import java.io.BufferedReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        ArrayList<PessoaJuridica> listaPj = new ArrayList<>();
        PessoaFisica metodosPf = new PessoaFisica();
        PessoaJuridica metodosPj = new PessoaJuridica();



        System.out.println("Bem-vindo ao sistema de cadastro de Pessoa Fisica e Pessoa Juridica");
        Scanner scanner = new Scanner(System.in);


        int opcao;
        do {

            System.out.println("Escolha uma opção: 1 - Pessoa Física / 2 - Pessoa Juridica / 0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoPf;

                    do {

                        System.out.println("Escolha uma opção: 1 - Cadastrar Pessoa Física / 2 - Listar Pessoa Física / 0 - Voltar ao menu anterior");
                        opcaoPf = scanner.nextInt();
                        switch (opcaoPf) {
                            case 1:

                                PessoaFisica novaPf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();

                                System.out.println("Digite o nome da pessoa física: ");
                                novaPf.nome = scanner.next();

                                System.out.println("Digite o CPF: ");
                                novaPf.cpf = scanner.next();

                                System.out.println("Digite o rendimento mensal (Digite somente números): ");
                                novaPf.rendimento = scanner.nextInt();

                                System.out.println("Digite a data de nascimento da pessoa física no formato (dd/MM/aaaa): ");
                                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                                Period periodo = Period.between(date, LocalDate.now());

                                novaPf.dataNascimento = date;

                                if (periodo.getYears() >= 18) {
                                    System.out.println("A pessoa tem mais de 18 anos");
                                } else {
                                    System.out.println("A pessoa tem menos de 18 anos. Retornando ao menu principal.");
                                    break;
                                }


                                System.out.println("Digite o lougradouro: ");
                                novoEndPf.lograedouro = scanner.next();

                                System.out.println("Digite o número: ");
                                novoEndPf.numero = scanner.next();

                                System.out.println("Este endereço é comercial? S/N: ");
                                String endCom;
                                endCom = scanner.next();

                                if (endCom.equalsIgnoreCase("S")) {
                                    novoEndPf.enderecoComercial = true;
                                } else {
                                    novoEndPf.enderecoComercial = false;
                                }
                                novaPf.endereco = novoEndPf;

                                listaPf.add(novaPf);

                                System.out.println("Cadastro realizado com sucesso!");

                                break;

                            case 2:
                                //vai conferir se a lista está vazia ou não
                                if (listaPf.size() > 0) {
                                    //vai acessar cada item da lista
                                    for (PessoaFisica cadaPf : listaPf) {
                                        System.out.println();
                                        System.out.println("Nome: " + cadaPf.nome);
                                        System.out.println("CPF: " + cadaPf.cpf);
                                        System.out.println("Endereço: " + cadaPf.endereco.lograedouro + ", " + cadaPf.endereco.numero);
                                        System.out.println("Data de Nascimento: " + cadaPf.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.println("Imposto a ser pago: " + metodosPf.CalcularImposto(cadaPf.rendimento));
                                        System.out.println();
                                        System.out.println("Digite 0 para continuar");
                                        scanner.nextLine();
                                    }
                                    opcaoPf = scanner.nextInt();
                                } else {
                                    System.out.println("Lista vazia");
                                }
                                break;

                            case 0:
                                System.out.println("Voltando ao menu anterior");
                                break;

                            default:
                                System.out.println("Opção invalida, por favor digite uma opção válida!");
                                break;
                        }
                    } while (opcaoPf != 0);
                    break;


                case 2: //Pessoa Juridica
                                int opcaoPj;

                                do {

                                    System.out.println("Escolha uma opção: 1 - Cadastrar Pessoa Jurica / 2 - Listar Pessoa Jurica / 0 - Voltar ao menu anterior");
                                    opcaoPj = scanner.nextInt();


                                    switch (opcaoPj) {
                                        case 1:

                                            PessoaJuridica novaPj = new PessoaJuridica();
                                            Endereco novoEndPj = new Endereco();

                                            System.out.println("Digite o nome da pessoa Jurídica: ");
                                            novaPj.nome = scanner.next();

                                            System.out.println("Digite o CNPJ da pessoa Juridica: ");
                                            novaPj.cpnj = scanner.next();

                                            System.out.println("Digite o rendimento mensal (Digite somente números): ");
                                            novaPj.rendimento = scanner.nextInt();

                                            System.out.println("Digite o lougradouro: ");
                                            novoEndPj.lograedouro = scanner.next();

                                            System.out.println("Digite o número: ");
                                            novoEndPj.numero = scanner.next();

                                            System.out.println("Este endereço é comercial? S/N: ");
                                            String endCom;
                                            endCom = scanner.next();

                                            if (endCom.equalsIgnoreCase("S")) {
                                                novoEndPj.enderecoComercial = true;
                                            } else {
                                                novoEndPj.enderecoComercial = false;
                                            }
                                            novaPj.endereco = novoEndPj;

                                            listaPj.add(novaPj);

                                            System.out.println("Cadastro realizado com sucesso!");

                                            break;

                                        case 2:
                                            //vai conferir se a lista está vazia ou não
                                            if (listaPj.size() > 0) {
                                                //vai acessar cada item da lista
                                                for (PessoaJuridica cadaPj : listaPj) {
                                                    System.out.println();
                                                    System.out.println("Nome: " + cadaPj.nome);
                                                    System.out.println("CPNJ: " + cadaPj.cpnj);
                                                    System.out.println("Endereço: " + cadaPj.endereco.lograedouro + ", " + cadaPj.endereco.numero);
                                                    System.out.println("Imposto a ser pago: " + metodosPj.CalcularImposto(cadaPj.rendimento));
                                                    System.out.println();
                                                    System.out.println("Digite 0 para continuar");
                                                    scanner.nextLine();
                                                }
                                                opcaoPj = scanner.nextInt();
                                            } else {
                                                System.out.println("Lista vazia");
                                            }
                                            break;

                                        case 0:
                                            System.out.println("Voltando ao menu anterior");
                                            break;

                                        default:
                                            System.out.println("Opção invalida, por favor digite uma opção válida!");
                                            break;
                                    }
                        } while (opcaoPj != 0);
                          break;

                    case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema! Forte abraço!");
                    break;

                default:
                    System.out.println("Opção inválida, por favor digite uma opção válida!");
            }
        } while (opcao != 0);

    }
}