//Exercício: Verificação de dia da semana
//Escreva um programa que solicita ao usuário um número de 1 a 7 representando um dia
//da semana e exibe o nome correspondente a esse dia. Considere que 1 representa segunda-feira,
//2 representa terça-feira e assim por diante.

import java.util.Scanner;
public class VerifDiaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = leitor.nextInt();
        String dia = null;

        switch (numero){
            case 1:
                dia = "Segunda-feira";
                break;
            case 2:
                dia = "Terça-feira";
                break;
            case 3:
                dia = "Quarta-feira";
                break;
            case 4:
                dia = "Quinta-feira";
                break;
            case 5:
                dia = "Sexta-feira";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println("Dígito invalido. Digite um número de 1 a 7.");
                break;

        }
        System.out.println("O número "+numero+" corresponde ao dia "+dia+".");

    }
}
