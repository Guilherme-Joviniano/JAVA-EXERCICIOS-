import javax.print.attribute.standard.RequestingUserName;

class Tabuada {

    static void calc(int number){
        for(int i = 0; i<=2;  i++){
            for(int j = 0; j<=10; j++){System.out.printf(" \n %d x %d = %d \n", number , j, number * j);}
            System.out.println("----------------------------------------------------------------------");
            number++;
        }
    }

    public static void main(String[] args) {       
        
        calc(9);
        
    }
}