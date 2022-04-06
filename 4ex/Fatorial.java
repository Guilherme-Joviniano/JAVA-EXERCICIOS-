import java.util.Scanner;

class Fatorial {

    public Long value;

    //Constructor Method 
    public Fatorial(final long number) {
        this.value = calc(number);
    };

    private Long calc(final long number) {
        
        //Filter
        if(number > 59){
            System.out.println("O numero digitado ou é abaixo do zero ou está fora da alcance do metodo que é de até 59");
            return null;
            }
        if(number <  0){ 
            System.out.println("O numero digitado ou é abaixo do zero ou está fora da alcance do metodo que é de até 59");
            return null;
        }
        if(number == 0){ 
            return (long) 1;
        }

        //calc
        long acumulador = 1;
        for (long i = number; i > 1; i--) {
            acumulador *= i;
        }
        return acumulador;
    }

    public static void main(final String[] args) {

        // final Fatorial fatorial = new Fatorial(5);
        // System.out.println(fatorial.value);

        
        final Scanner ler = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Informe um numero positivo: ");
            int n = ler.nextInt();
            long fat = n;
            if (n >= 0) {
                if (n == 0) {
                    fat++;
                }
                for (int i = 2; i < n; i++) {
                    fat = fat * i;
                }
                System.out.printf("%d! = %d \n", n, fat);
            } else {
                System.out.println("Somente numeros positivos são aceitos! Digite Novamente");
            }

            System.out.println("Quer continuar ?");
            String continuar = ler.next().toUpperCase().substring(0, 1);
            if(continuar.equals("S")){
                System.out.println("Continuando..");        
            }else{
                isTrue = false;
            }
        }   
    }
}