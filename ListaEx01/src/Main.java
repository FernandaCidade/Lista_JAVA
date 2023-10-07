//Importando uma pasta para receber informação do usuário
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //metodo

        Scanner leitor = new Scanner(System.in); //instanciando e System indica que receberá informação do systema

        //final float  - final é igual const no javascript
        System.out.print("Digite o salário: ");
        final float salario = leitor.nextFloat();

        if (salario < 1000){
            var novoSalario = salario * 1.1f;
            System.out.println(novoSalario);
        }else{
            System.out.println("Salário dentro da faixa.");
        }

    }
}