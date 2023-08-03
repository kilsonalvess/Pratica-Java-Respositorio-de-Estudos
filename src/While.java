import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        double media = 0;
        double nota = 0;
        int contador = 0;

        //
        while(nota !=-1) {

            System.out.println("Digite nota ou -1 para encerrar:");
            nota = leitura.nextDouble();

            if (nota !=-1){
            media += nota;

            //*Contador de notas
            contador++;
            }
        }

        System.out.println("Soma das Notas:"+media);
        System.out.println("Media das notas:"+media/contador);

















    }
}
