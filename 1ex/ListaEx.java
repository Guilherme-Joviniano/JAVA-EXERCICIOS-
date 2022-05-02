
public class ListaEx {

    static void Exe01(double numdeci1, double numdeci2) {
        double soma = numdeci1 + numdeci2;
        double subtracao = numdeci1 - numdeci2;
        double divisao = numdeci1 / numdeci2;
        double multiplicacao = numdeci1 * numdeci2;
        System.out.println("Primeiro Exercicio:");
        System.out.println("Soma " + soma + " Subtração " + subtracao + " Divisão " + divisao + " Multiplicação " + multiplicacao);

     }

     static void Exe02(int num1, int num2) { 
        int expo = 5;
        double valorexpo1 = Math.pow(num1, expo);
        double valorexpo2 = Math.pow(num2, expo);
        double divisao = num1/num2;
        double modulo = num1 % num2;
        double raiznum1 = Math.sqrt(num1);
        double raiznum2 = Math.sqrt(num2);
        System.out.println("Segundo Exercicio:");
        System.out.println("Valor Expo_1: " + valorexpo1 + " Valor Expo_2: " + valorexpo2 + " Divisao dos Numeros: " + divisao + " Modulo: " + modulo + " Raiz Numero 1: " + raiznum1 + " Raiz Numero 2: " + raiznum2);
    }

     static void Exe03(int var1, int var2){
        int cache = var1;
        var1 = var2;
        var2 = cache;
        System.out.println("Terceiro Exercicio:");
        System.out.println("O valor da variavel um é " + var1 + " O valor do variavel dois é " + var2);
     }

     static void Exe04(double compra, int desconto) {
         double valorPercentual = (compra / 100) * desconto;
         double promocao = compra - valorPercentual;
         System.out.println("Quarto Exercicio:");
         System.out.println("O valor da compra com " + desconto + "% de desconto é " + promocao);
     }

     static void Exe05(double valorDolar) {
        double ValorReal = 5.25;  
        double conversao = ValorReal * valorDolar;
        System.out.println("Quinto Exercicio:");
        System.out.println("Conversão para R$: " + conversao);
     }

     static void Exe06(double celsius) {         
        double farenheit = (9 * celsius + 160) / 5;
        System.out.println("Sexto Exercicio:");
        System.out.println(celsius + "°C" + " em farenheit são " + farenheit + "°F");
     }
     public static void main( String args[] ) {
        
        
        
        Exe01(0.5,0.7);
        Exe02(6,5);
        Exe03(10,4);
        Exe04(1000,20);
        Exe05(100);
        Exe06(27.8);


    }
}
