import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {


        String nome = "Kilson Alves";
        Double saldo = 50.00;
        String tipo_conta = "Conta Corrente";
        String menu;
        int opcao = 0;
        Double valor_tranferir = 0.0;
        Double valor_receber = 0.0;


        System.out.println("\n******************************************");
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Saldo:" + saldo);
        System.out.println("Tipo de Conta:" + tipo_conta);
        System.out.println("\n******************************************");

        menu = """
                *** Digite sua opção ***
                1- Consultar Saldo
                2- Transferir Valor
                3 - Receber Valor
                4- Sair
                """;


        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo:"+saldo);
            }

            else if (opcao == 2) {
                System.out.println("Digite valor a ser transferido: ");
                valor_tranferir = leitura.nextDouble();

                    if (valor_tranferir > saldo){
                        System.out.println("O valor digitado e maior do que seu saldo em conta!!");
                    }

                    else if (valor_tranferir <= saldo){

                        saldo -= valor_tranferir;
                        System.out.println("Saldo Atualizado:"+saldo);

                    }
            }

            else if (opcao == 3){
                System.out.println("Digite um valor a receber:");
                valor_receber = leitura.nextDouble();
                saldo += valor_receber;
                System.out.println("Saldo Atualizado:"+saldo);


            }



        }
        }
    }




























