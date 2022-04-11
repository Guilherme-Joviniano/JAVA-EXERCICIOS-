import sun.print.PSPrinterJob.EPSPrinter;

public class Potencia {

    static void Pow(int base, int expo){
        
        long valor = base;
        for(int i = 1; i < expo; i++){
            valor *= base;           
        }

        System.out.println(valor);
    }


    public static void main(String[] args) {
        Pow(5,3);

    }
}