public class Exe03 {
    static void Ex03(int var1, int var2){
        int cache = var1;
        var1 = var2;
        var2 = cache;
        System.out.println("Terceiro Exercicio:");
        System.out.println("O valor da variavel um é " + var1 + " O valor do variavel dois é " + var2);
     }
    public static void main(String args[]) {
        Ex03(5, 4);
    }   
}