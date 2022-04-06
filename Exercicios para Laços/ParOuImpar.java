import java.util.Scanner;

class ParOuImpar{

    

    static void ParOuImpar(){
        
        Scanner scan = new Scanner(System.in);    
        System.out.println("Digite um numero real e positivo: ");
        int number = scan.nextInt();

        while(true){
            if(number < 0){
                System.out.println("Digite um número positivo! ");
            }

            if(number % 2 == 0){
                System.out.println("é par");
            }else{
                System.out.println("é impar");
            }

            System.out.println("Quer Continuar?");
            final String isTrue = scan.next().substring(0, 1).toUpperCase();
            if (isTrue.equals("S")) {
                System.out.println("Digite outro um numero real e positivo: ");
                number = scan.nextInt();
            } else {
                System.out.println("Saindo do Loop");
                break;
            }
        }

    }

    public static void main( String[] args) {
        
        ParOuImpar();

    }

}