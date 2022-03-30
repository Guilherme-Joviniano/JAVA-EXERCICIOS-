import javafx.scene.media.AudioClipBuilder;

class Fatorial {

    long fatorial;

    //Constructor Method 
    public Fatorial(int number){
        
        this.fatorial = calc(number) ;

    };


    long calc(int number) {
        long acumulador = 1;
        for (int i = number; i > 1; i--) {
            acumulador = acumulador * i;
            System.out.println(acumulador);
        }
        return acumulador;
    }

    public static void main(String[] args) {

        Fatorial fator = new Fatorial(20);
        System.out.println(fator.fatorial);

    }


}