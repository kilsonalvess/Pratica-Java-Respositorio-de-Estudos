import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        int contador = 0;
        double x = 0;
        double numero = 0;

        while (x!=-1) {

            System.out.println("Digite numero:");
            x = leitura.nextDouble();
            contador++;

            if (x==-1){
                break;
            }






        }

        System.out.println("Voçe digitou:"+contador+" vezes!");








    }









}
