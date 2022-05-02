import java.io.Console;
import java.util.Calendar;

public class Pessoa{
    
    Console line = System.console();   
    public String name;
    public int age;
    public String genre;
    private int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

    public Pessoa() {
        this.name  = getName();
        this.age = getIdade();
        this.genre = getGenre();
    }    
    private int getIdade(){
        int anoNascimento = Integer.parseInt(line.readLine("Digite o ano do seu nascimento: "));
        return anoAtual - anoNascimento;
    }
    private String getName(){
        String name = line.readLine("Digite seu nome: ");
        return name.toLowerCase();
    }
    private String getGenre(){
        String genre = line.readLine("Digite o seu Genero: ");
        return genre;
    }
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.printf("%s %s %s",p1.age,p1.genre,p1.name);
    }
}