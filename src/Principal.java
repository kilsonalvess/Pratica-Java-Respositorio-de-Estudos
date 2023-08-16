import br.com.kilson.modelos.Filme;

public class Principal  {
    public static void main(String[] args) {

    //*Referencia
    Filme meuFilme = new Filme();
    meuFilme.setNome("Baleia Azul");
    meuFilme.setAnodelancamento(2000);
    meuFilme.setDuracaoEmminutos(180);
    meuFilme.avalia(8.0);
    meuFilme.avalia(10.0);
    meuFilme.avalia(5.0);


    System.out.println("Total de avalições:"+ meuFilme.getTotalDeavalicoes());
    System.out.println("Media:" + meuFilme.media());

    System.out.println("****************************************************************");
    meuFilme.exibiFichaTecnica();




    }
}
