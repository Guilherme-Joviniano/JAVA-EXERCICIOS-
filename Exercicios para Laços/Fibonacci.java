public class Fibonacci {
  static void calcFiSequence(int sequencia){
    long n1 = 0, n2 = 1, ProximoTermo;
    for (int i = 1; i <= sequencia; i++) {
        System.out.println(n1);
        ProximoTermo = n1 + n2;
        n1 = n2;
        n2 = ProximoTermo;
        System.out.println( (float) n2/n1);
               
    }

  }   
  public static void main(String[] args) {
        calcFiSequence(90);
    }
}