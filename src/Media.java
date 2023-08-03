import java.util.Scanner;

public class Media {
    public static void main(String[] args) {


        //*Media do usuario imprimindo na tela
        Scanner leitura = new Scanner (System.in);


        System.out.println("Digite a primeira nota:");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota:");
        double  nota3 = leitura.nextDouble();


        System.out.println("Media:"+nota1+nota2+nota3/3);






    }
}
