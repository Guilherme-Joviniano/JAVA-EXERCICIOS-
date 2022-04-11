import java.util.*;


class ValidarNumeroPrimo {
    
    int number;
    boolean ePrimo;
    List<Integer> divisores = new ArrayList<Integer>();  
    
    //Constructor
    public ValidarNumeroPrimo(int number){
        this.number = number;
        this.ePrimo = Validar();
        this.divisores = Divisores();
    }

    boolean Validar(){
        if(this.number < 0) return false;
        if(this.number == 1 || this.number == 0) return true;
        for(int i = 2; i < this.number; i++){
            if(this.number % i == 0){
                return false;
            }
        }
        return true;
    }   

    List<Integer> Divisores(){
        if(!this.ePrimo){
            for(int i = 2; i < this.number; i++){
                if(this.number % i == 0){
                    divisores.add(i);
                }
            }
            return divisores;
        }
        return null;
    }

    public static void main(String[] args) {

        ValidarNumeroPrimo num1 = new ValidarNumeroPrimo(497);
        
        if(num1.ePrimo){
            System.out.println("É primo");
        } else{
            System.out.println("Não é primo");
        } 
        
        if(num1.divisores == null){
            System.out.println(String.format("O numero %d já é primo", num1.number));
        }else{
            System.out.println(num1.divisores);
        }
        
    }
}