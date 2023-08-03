
public class Main {
    public static void main(String[] args) {

        //*Declarações de variáveis
        int ano = 2000;
        String filme;
        boolean incluidonoPlano = true;
        Double notaDofilme = 8.1;


        //*Text Block
        filme = """
                Top Gun
                Titanic
                American Pay
                Gordo e o Magro
                """;

        //*imprimindo  com contatenação +
        System.out.println("Filme:"+filme);

        //*Fazendo Media com 3 notas
        double media = (9.8 + 7.5 + 10)/3;
        System.out.println(media);

        //*Convertendo um Double para Int casting
        media = (int) (media/3);
        System.out.println(media);


        //*Incrementando
        int x = 10;
        x +=1;
        System.out.println(x);



        double Celsius = 10.0;
        double Fahrenheit;

        System.out.println("Temperatura Convertida:"+(Celsius *1.8) +32);













}

    }