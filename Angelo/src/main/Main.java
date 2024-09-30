package main;

import composicao.Cargo;
import composicao.Endereco;
import composicao.Profissao;
import composicao.TelsContato;
import pessoas.Cliente;
import pessoas.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Cadastro de pessoas.Pessoa ===");
            System.out.println("1 - Cadastrar pessoas.Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu ano de nascimento (ex: 1990): ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite seu mês de nascimento (ex: 5): ");
            int mes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite seu dia de nascimento (ex: 20): ");
            int dia = scanner.nextInt();
            scanner.nextLine();

            LocalDate dataDeNascimento = LocalDate.of(ano, mes, dia);

            // Endereço
            System.out.print("Digite a rua: ");
            String rua = scanner.nextLine();
            System.out.print("Digite o número: ");
            String numero = scanner.nextLine();
            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Digite o estado: ");
            String estado = scanner.nextLine();
            System.out.print("Digite o CEP: ");
            String cep = scanner.nextLine();

            Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);

            // Lista de telefones
            TelsContato telsContato = new TelsContato();
            System.out.print("Quantos telefones deseja adicionar? ");
            int quantidadeTelefones = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < quantidadeTelefones; i++) {
                System.out.print("Digite o telefone " + (i + 1) + ": ");
                String telefone = scanner.nextLine();
                telsContato.adicionarTelefone(telefone);
            }

            if (opcao == 1) {
                // Cadastro de pessoas.Cliente
                System.out.print("Digite o código do cliente: ");
                String codigo = scanner.nextLine();

                // Cadastro da profissão
                System.out.print("Digite o nome da profissão: ");
                String nomeProfissao = scanner.nextLine();
                System.out.print("Digite a descrição da profissão: ");
                String descricaoProfissao = scanner.nextLine();

                Profissao profissao = new Profissao(nomeProfissao, descricaoProfissao);

                Cliente cliente = new Cliente(nome, dataDeNascimento, codigo, endereco, telsContato, profissao);
                System.out.println("\n=== Informações do pessoas.Cliente ===");
                System.out.println(cliente);
                System.out.println("Idade: " + cliente.obterIdade());

            } else if (opcao == 2) {
                // Cadastro de Funcionário
                System.out.print("Digite o nome do cargo: ");
                String nomeCargo = scanner.nextLine();
                System.out.print("Digite a descrição do cargo: ");
                String descricaoCargo = scanner.nextLine();

                Cargo cargo = new Cargo(nomeCargo, descricaoCargo); // Cria um objeto composicao.Cargo

                System.out.print("Digite o salário do funcionário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                // Admissão
                System.out.print("Digite o ano de admissão (ex: 2023): ");
                int anoAdmissao = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o mês de admissão (ex: 5): ");
                int mesAdmissao = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o dia de admissão (ex: 20): ");
                int diaAdmissao = scanner.nextInt();
                scanner.nextLine();

                LocalDate dataAdmissao = LocalDate.of(anoAdmissao, mesAdmissao, diaAdmissao);

                Funcionario funcionario = new Funcionario(nome, dataDeNascimento, cargo, salario, dataAdmissao, endereco, telsContato);
                System.out.println("\n=== Informações do Funcionário ===");
                System.out.println(funcionario);

                // Reajustar salário
                System.out.print("Digite o percentual de reajuste: ");
                double percentual = scanner.nextDouble();
                funcionario.reajustarSalario(percentual);
                scanner.nextLine();

                // Promover funcionário
                System.out.print("Digite o novo nome do cargo para promoção: ");
                String novoNomeCargo = scanner.nextLine();
                System.out.print("Digite a nova descrição do cargo: ");
                String novaDescricaoCargo = scanner.nextLine();

                Cargo novoCargo = new Cargo(novoNomeCargo, novaDescricaoCargo);
                funcionario.promover(novoCargo);

                System.out.println("\n=== Informações Atualizadas do Funcionário ===");
                System.out.println(funcionario);
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
