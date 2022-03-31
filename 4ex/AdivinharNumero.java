import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class AdivinharNumero{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numRandom = ThreadLocalRandom.current().nextInt(0, 9);
        
        while (true){
            System.out.println("Adivinhe o um numero entre 0 à 9");
            int k = scan.nextInt();    
            if(k == numRandom){
                System.out.println("Numero Correto!");
                break;
            }else{
                System.out.println("Numero errado digite novamente!");
            }
        }

    }
}