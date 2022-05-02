public class Exibir {
    
    
    public static void main(String[] args) {
 
        char ch = '\u2588';
        String title = "Desenvolvimento de Sistemas - Turma DS1-T";
        String whithespace  = String.format("%c\t\t\t%s\t\t\t%c", ch, title,ch);
        
        for(int i = 0; i < 89; i++){
            System.out.print(ch);
        }
          
        System.out.println();
        System.out.println(whithespace);

        for(int i = 0; i < 89; i++){
            System.out.print(ch);
        }
 
           
    }
}