//Exercício: Verificação de idade
//Escreva um programa que solicita o ano de nascimento de uma pessoa e verifica se ela é maior de 18 anos.
//Exiba uma mensagem indicando se a pessoa é maior de idade ou não.

import java.time.Year;
import java.util.Scanner;
public class VerifIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }




    }
}
