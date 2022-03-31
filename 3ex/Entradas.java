import java.io.Console;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.lang.Integer;

public class Entradas{
    
    private static void Console(int ano) {
        
        //Instance of the Console 
        Console line = System.console();
        int userIdade = Integer.parseInt(line.readLine("Insira qual é ou será a sua Idade neste ano: "));
        int anoNascimento = ano - userIdade;
        System.out.printf("O usuario nasceu no ano de %d", anoNascimento);

    }

    private static void Grafica(int ano) {

        //Instance of the JOptionPane 
        JOptionPane panel = new JOptionPane();
        String message = "Insira qual é ou será a sua Idade neste ano: ";
        int userIdade = Integer.parseInt(panel.showInputDialog(null, message, "Getting borned year"));
        int anoNascimento = ano - userIdade;
        String messageComAno = String.format("O ano de nascimento do usuario é %d", anoNascimento);
        panel.showMessageDialog(null, messageComAno);
        
    }


    public static void main(String[] args) {
        //Instance of the calendar
        Calendar calendar =  Calendar.getInstance(); 
        int anoAtual = calendar.get(Calendar.YEAR);

        Grafica(anoAtual);
        Console(anoAtual);

    }
}
