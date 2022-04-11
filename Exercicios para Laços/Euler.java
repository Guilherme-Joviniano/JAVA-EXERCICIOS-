import java.util.Scanner;


public class Euler {
    static void Euler(){
        Scanner scan = new Scanner(System.in);
        while(true){
            
            System.out.println("Digite o valor de X");
            Float x = scan.nextFloat();
            Float e = 1 + (1/x);
            e = (float) Math.pow(e ,x);
            System.out.println(e);

            System.out.println("Quer Continuar?");
            String isTrue = scan.next().substring(0,1).toUpperCase();
            
            if (!isTrue.equals("S")) {
                System.out.println("Saindo do Loop");
                break;
            } 
        }
    }
    public static void main(String[] args) {
        Euler();
    }
}