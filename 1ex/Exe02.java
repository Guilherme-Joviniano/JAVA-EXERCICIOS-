public class Exe02 {

    static void Ex02(int num1, int num2) { 
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

    public static void main(String args[]) {
        Ex02(56, 4);
    }
}