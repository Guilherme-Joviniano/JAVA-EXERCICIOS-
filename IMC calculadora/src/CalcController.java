
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.reflect.InvocationTargetException;

public class CalcController {
    
    static String IMC(Double altura, Double peso){

        Double alturaAoQuadrado = Math.pow(altura, 2); 
        
        Double userIMC =  peso/alturaAoQuadrado;
        
        
        if(userIMC < 17.00){ 
            return String.format("Muito Abaixo do Peso %.2f", userIMC);
        }
        if(userIMC >= 17.00 && userIMC < 18.49){
            return String.format("Abaixo do Peso %.2f", userIMC);
        }
        if(userIMC >= 18.50 && userIMC < 24.99){
            return String.format("Peso Normal %.2f", userIMC);
        }
        if(userIMC >= 24.50 && userIMC < 29.99){
            return String.format("Acima do Peso %.2f", userIMC);
        }
        if(userIMC >= 30 && userIMC < 34.99){
            return String.format("Obesidade I  %.2f", userIMC);
        }
        if(userIMC >= 35 && userIMC < 39.99){
            return String.format("Obesidade II Severa  %.2f", userIMC);
        }

        return String.format("Obesidade III Mórbida", userIMC);

    }

    @FXML
    private TextField inputAltura;

    @FXML
    private TextField inputPeso;

    @FXML
    private Label message;
    
    @FXML
    private Button sendButton;
    

    @FXML
    public void runCalc(ActionEvent event) {

        Double userAltura = Double.parseDouble(inputAltura.getText());
        Double userPeso = Double.parseDouble(inputPeso.getText());
    
        message.setText(IMC(userAltura, userPeso));
        // message.setText(userAltura);

    }

}
