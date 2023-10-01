import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Personagem personagem = new Personagem("John");
    //nasce com muito sono e sem energia. fome mais ou menos
    //ele tem probabilidade 80% de dormir
    //10% de caçar
    //10% de comer
    while(true){
      int oQueFazer = gerador.nextInt(3); //[0..3[
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          break;
        case 1:
        personagem.comer();
          break;
        case 2:
        personagem.dormir();
        break;
      }
      personagem.morrer();
      personagem.exibirEstado();
      System.out.println("--------------------");
      
      Thread.sleep(8000);
    }
  }
}
