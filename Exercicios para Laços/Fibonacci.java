public class Fibonacci {
  static void Fibonacci(int sequencia){
    long n1 = 0, n2 = 1, ProximoTermo;
    Float fi =  1 + (float) Math.sqrt(5.0);
    fi = fi/2;

    for (int i = 1; i <= sequencia; i++) {
        System.out.println(n1);
        ProximoTermo = n1 + n2;
        n1 = n2;
        n2 = ProximoTermo;
        
        // System.out.println(fi);
        
    }

  }   
  public static void main(String[] args) {
        Fibonacci(10);
    }
}