// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String[] listaProfessores = {"Samanta","Alexia", "Alana", "Odirlei", "Thiago"};

       for( int contador = 0; contador < listaProfessores.length; contador++){
           System.out.println("O indice atual é: " + contador);

           if (contador == 0) {
               System.out.println("O número de indice do(a) professoro(a) " +listaProfessores[contador]+" é zero"); //Contador é melhor do que colocar[0]
           } else if (contador % 2  == 0) {
               System.out.println("O número de indice do(a) professor(a)" + listaProfessores[contador] + " é par");
           }else{
               System.out.println("O número de indice do(a) professor(a)" + listaProfessores[contador] + " é ímpar");
           }

       }
    }
}