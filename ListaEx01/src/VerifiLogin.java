//Exercício: Verificação de login
//Escreva um programa que solicita ao usuário um nome de usuário e uma senha.
//Verifique se o nome de usuário é "admin" e a senha é "senha123".
//Exiba uma mensagem indicando se o login foi bem-sucedido ou não.

import java.util.Objects;
import java.util.Scanner;
public class VerifiLogin {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = leitor.next();

        System.out.print("Digite a senha: ");
        String senha = leitor.next();

        if (Objects.equals(usuario, "admin") && Objects.equals(senha, "senha123")){
            System.out.println("Login bem-sucedido!");

        }else {
            System.out.println("Nome de usuário ou senha incorretos");
        }

    }
}
