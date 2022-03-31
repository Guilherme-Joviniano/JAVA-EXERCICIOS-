public class Exe04 {
    
    static void Ex04(double compra, int desconto) {
        double valorPercentual = (compra / 100) * desconto;
        double promocao = compra - valorPercentual;
        System.out.println("Quarto Exercicio:");
        System.out.println("O valor da compra com " + desconto + "% de desconto é " + promocao);
    }
    public static void main(String args[]) {
        Ex04(300, 20);
    }
}