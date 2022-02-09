
public class Exercicios {
     static void Exe01() {
        double numdeci1 = 0.5;
        double numdeci2 = 0.7;
        
        double soma = numdeci1 + numdeci2;
        double subtracao = numdeci1 - numdeci2;
        double divisao = numdeci1/numdeci2;
        double multiplicacao = numdeci1 * numdeci2;

        System.out.println("Soma " + soma + " Subtração " + subtracao + " Divisão " + divisao + " Multiplicação " + multiplicacao );
        
    }
     static void Exe02() {
            int num1 = 10;
            int num2 = 5;
            int expo = 5;

            double valorexpo1 = Math.pow(num1, expo);
            double valorexpo2 = Math.pow(num2, expo);

            double divisao = num1/num2;
            double modulo = num1 % num2;
            double raiznum1 = Math.sqrt(num1);
            double raiznum2 = Math.sqrt(num2);
            System.out.println("Valor Expo_1: " + valorexpo1 + " Valor Expo_2: " + valorexpo2 + " Divisao dos Numeros: " + divisao + " Modulo: " + modulo + " Raiz Numero 1: " + raiznum1 + " Raiz Numero 2: " + raiznum2);
        
        }
        static void Exe03(){
            int var1 = 10;
            int var2 = 4;
            int cache = var1;
            var1 = var2;
            var2 = cache;
            System.out.println("O valor da variavel um é " + var1 +" O valor do variavel dois é "+ var2);
        }
        static void Exe04(){
            int compra = 100;
            int desconto = 20;
            double valor_relativo = (compra/100) * desconto;
            double promocao = compra - valor_relativo;
            System.out.println("O valor da compra com " + desconto + "% de desconto é " + promocao);
        }
        static void Exe05(){
            double valoReal = 5.25;
            double valorDolar = 100;
            double conversao = valoReal*valorDolar;
            System.out.println("Conversão para R$: " + conversao);
        }
        static void Exe06(){
            double celcius = 27.8;
            double farenheit = (9*celcius+160)/5;
            System.out.println(farenheit);
         
        }

        
    public static void main(String[] args) {
        
        Exe01();
        Exe02();
        Exe03();
        Exe04();
        Exe05();
        Exe06();

    }
}
