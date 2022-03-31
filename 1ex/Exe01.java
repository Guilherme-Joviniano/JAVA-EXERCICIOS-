public class Exe01 {
    
    static void Ex01(double numdeci1, double numdeci2) {
        double soma = numdeci1 + numdeci2;
        double subtracao = numdeci1 - numdeci2;
        double divisao = numdeci1 / numdeci2;
        double multiplicacao = numdeci1 * numdeci2;
        System.out.println("Primeiro Exercicio:");
        System.out.println("Soma " + soma + " Subtração " + subtracao + " Divisão " + divisao + " Multiplicação " + multiplicacao);

     }
    public static void main(String args[]) {
        Ex01(0.5, 0.9);
    }
}