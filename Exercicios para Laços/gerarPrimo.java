import java.util.ArrayList;
import java.util.List;

public class gerarPrimo {

    public List<Long> numbers = new ArrayList<Long>();

   public gerarPrimo(int sequencia){
        this.numbers = generator(sequencia);
    }

    List<Long> generator(long sequencia){       
        
        numbers.add( (long) 2);
        numbers.add( (long) 3);
        numbers.add( (long) 5);

        long value;
        for(long i = 1; i <= sequencia; i++){
            value = (6 * i) - 1;
            numbers.add(value);
        }
        return this.numbers;
    }
    public static void main(String[] args) {
        
        gerarPrimo prime = new gerarPrimo(100);
        System.out.println(prime.numbers);


    }

}