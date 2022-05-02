import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Calculadora{
    
    //Fields
    public List<String> historico = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    
    static long contagemDeInstancias;
    
    //Constructor 
    public Calculadora(){
        contagemDeInstancias++;
    }
    
    //Methods
    private double[] entrada(){   
        
        System.out.println("Digite o valor do Primeiro Termo");
        double n1 = scan.nextDouble();
        System.out.println("Digite o valor do Segundo Termo");
        double n2 = scan.nextDouble();
        double[] numbers = {n1 ,n2};
        return numbers;

    }
    private void saida(double[] valores, char operacao, double resultado){
        System.out.printf("%.1f %c %.1f = %.1f", valores[0], operacao, valores[1], resultado);
    }
    
    public double somar() {
        double[] valores = entrada();
        double num1 = valores[0], num2 = valores[1];
        adicinarAoHistorico(num1, num2, '+', num1+num2);        
        saida(valores, '+', num1+num2);
        return num1 + num2;
    }
    public double subtrair() {
        double[] valores = entrada();
        double num1 = valores[0], num2 = valores[1];
        adicinarAoHistorico(num1, num2, '-', num1-num2);        
        saida(valores, '-', num1-num2);
        return num1 - num2;
    }
    public double multiplicar() {
        double[] valores = entrada();
        double num1 = valores[0], num2 = valores[1];
        adicinarAoHistorico(num1, num2, '*', num1*num2);        
        saida(valores, '*', num1*num2);
        return num1 * num2;
    }
    public double dividir() {
        double[] valores = entrada();
        double num1 = valores[0], num2 = valores[1];

        if(num2 == 0){
            throw new Error("Não é possivel dividir por ZERO.");
        } 

        adicinarAoHistorico(num1, num2, '/', num1/num2);        
        saida(valores, '/', num1/num2);
        return num1 / num2;
    }
    private void adicinarAoHistorico(double num1, double num2, char operacao, double valor){
        String lastOperation = String.format("%.1f%c%.1f = %.1f", num1,operacao,num2,valor);
        historico.add(lastOperation);
    }
    public static void main(String[] args) {
        //instanciando um objeto da class Calculadora.  
        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();
        Calculadora calculadora3 = new Calculadora();
        //Retorna e printa o valor!
        System.out.println(Calculadora.contagemDeInstancias);
        calculadora1.somar();
        
    }
}