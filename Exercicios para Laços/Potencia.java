


public class Potencia{

    static public Float Pow(float base, float expo) {
        float value = base;
        if(expo == 0 && base == 0){
            throw new Error("ENGRAÇADINHO VC NE?");
        }
        if(expo == (float) 0) {
            return value = 1;
        }
        for(int i = 1; i < expo; i++){
            value *= base;           
        }
        return value;
        
    }
    

    public static void main(String[] args) {
        float result = Pow(10, 0);
        System.out.println(result);
        char money = 36;
        System.out.println(money);
    }
}