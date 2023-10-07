//Você irá gerar uma média de duas notas, e caso a nota seja maior igual a 6, precisa aparecer uma mensagem de parabéns, caso não seje maior igual a 6, informe ao usuário que ele não passou.
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float primeiraNota = leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float segundaNota = leitor.nextFloat();

        float media = (primeiraNota + segundaNota);

        if (media >= 6){
            System.out.println("Meus Parabéns!");
        }else {
            System.out.println("Você não passou. Estude mais!");
        }
    }

}
