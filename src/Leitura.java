//*Bibliotecas Java
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {


        //*Inicialização do Scanner
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome:");

        //*Leitura de uma String
        String nome = leitura.nextLine();
        System.out.println("Nome:"+nome);


        //*Leitura de um inteiro
        System.out.println("Qual a sua idade");
        int idade = leitura.nextInt();


        //*Leitura de um double
        System.out.println("Digite uma nota:");
        Double nota = leitura.nextDouble();

        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Nota:"+nota);





    }
}
