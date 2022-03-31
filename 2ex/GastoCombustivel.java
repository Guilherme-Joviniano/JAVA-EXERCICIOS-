import java.io.Console;

public class GastoCombustivel{
    public static void main(String[] args) {
        //Declaring a const.

        final int consumoMedio = 12;
        

        //Reading the console line .
        
        Console line = System.console();

        String velocidade = line.readLine("Insira a velocidade media do veiculo apenas em KM ");
        String tempo = line.readLine("Insira o Tempo Rodado em Horas: ");
        
        //int teste = Integer.parseInt("100"); first call the class after the method
        float distancia =  Float.parseFloat(tempo) * Float.parseFloat(velocidade); 
        float LitrosUsados = distancia/consumoMedio;

        LitrosUsados = Math.round(LitrosUsados);
        System.out.println("Você rodou por " + tempo + " horas" + " em uma velocidade média de " + velocidade +" e percorreu uma distância total de " + distancia +"KM");
        System.out.println("A quantidade de litros que foram usados é de " + LitrosUsados + "L");
    
    }
}