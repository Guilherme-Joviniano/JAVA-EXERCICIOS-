package exercicio;

import java.util.Scanner;

public class vetorExercicio{
    static void entrada(double[] vetor) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor do %dª", i+1);
            vetor[i] = scan.nextDouble();
        }
        scan.close();
    }
    
    static double media(double[] vetor) {
        double acumulador = 0;
        for(int i = 0; i < vetor.length; i++){
            acumulador += vetor[i]; 
        }
        return acumulador / vetor.length;

    }
    
    static double menor(double[] vetor) {
        double menorElemento = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            if(menorElemento > vetor[i]){
                menorElemento = vetor[i];
            }
        }
        return menorElemento;
        
    }
    
    static double maior(double[] vetor) {
        double maiorElemento = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            if(maiorElemento < vetor[i]){
                maiorElemento = vetor[i];
            }
        }
        return maiorElemento;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        
        int tamanhoDoVet = scan.nextInt();
        double[] numeros = new double[tamanhoDoVet];

        
        entrada(numeros);
        
        double maiorValor = maior(numeros);
        double menorValor = menor(numeros);
        double media = media(numeros);

        System.out.printf("O maior é %.2f, o menor é %.2f e a media é %.2f", maiorValor, menorValor, media);
        scan.close();
    }
}