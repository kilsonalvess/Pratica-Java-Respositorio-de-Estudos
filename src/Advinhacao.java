import java.util.Scanner;
import java.util.Random;

public class Advinhacao {
    public static void main(String[] args) {

        int x = (new Random().nextInt(5));
        System.out.println(x);

        for (int i = 0; i < 5; i++) {

            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite numero:");
            int entrada = leitura.nextInt();



            if (entrada == x ){
                System.out.println("Parabéns voce acertou!!!!!!");
                break;
            }

            else {
                System.out.println("ERROUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");

            }

        }













    }



}
