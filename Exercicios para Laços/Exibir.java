import java.util.jar.Manifest;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javafx.scene.layout.TilePane;

public class Exibir {
    public static void main(String[] args) {
        char ch = '\u2588';
        String title = "Desenvolvimento de Sistemas - Turma DS1-T";

        String whitespace  = String.format("%c                     %s                     %c", ch, title,ch);
        
        for(int i = 0; i < 85; i++){
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(whitespace);
        for(int i = 0; i < 85; i++){
            System.out.print(ch);
        }
        
           
    }
}