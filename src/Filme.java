package br.com.kilson.modelos;

public class Filme {

     private  String nome;
     private int anodelancamento;
     private boolean incluidoNoPlano;
     private double somadasavaliacoes;
     private int totalDeavalicoes;
     private int duracaoEmminutos;


     public String getNome() {
          return nome;
     }


     public void setNome(String nome) {
          this.nome = nome;
     }


     public int getAnodelancamento() {
          return anodelancamento;
     }


     public void setAnodelancamento(int anodelancamento) {
          this.anodelancamento = anodelancamento;
     }


     public boolean isIncluidoNoPlano() {
          return incluidoNoPlano;
     }


     public void setIncluidoNoPlano(boolean incluidoNoPlano) {
          this.incluidoNoPlano = incluidoNoPlano;
     }


     public double getSomadasavaliacoes() {
          return somadasavaliacoes;
     }


     public int getTotalDeavalicoes() {
          return totalDeavalicoes;
     }


     public int getDuracaoEmminutos() {
          return duracaoEmminutos;
     }


     public void setDuracaoEmminutos(int duracaoEmminutos) {
          this.duracaoEmminutos = duracaoEmminutos;
     }


     //*metodos
     public void exibiFichaTecnica (){
          System.out.println("Nome do filme:"+nome);
          System.out.println("Ano de Lancamento:"+ anodelancamento);
          System.out.println("Duracao do filme:"+ duracaoEmminutos);

     }

     public void avalia (double nota){
          somadasavaliacoes += nota;
          totalDeavalicoes++;



     }

     public double media (){
          return somadasavaliacoes / totalDeavalicoes;


     }
























}
