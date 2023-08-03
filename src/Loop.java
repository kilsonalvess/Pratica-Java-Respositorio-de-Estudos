import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        //*Variaveis de inicialização
        double media = 0;
        double nota = 0;

        //*Loop for quando vc determina quantas vezes voce quer percorrer o loop
        for (int i = 0; i < 3; i++) {

            System.out.println("Digite nota:");
            nota = leitura.nextDouble();
            //*Incrementa as notas detro da variavel de acordo com o numero de interções do loop
            media += nota;
        }

        System.out.println("Soma das Notas:"+media);
        System.out.println("Media das notas:"+media/3);














    }




}
