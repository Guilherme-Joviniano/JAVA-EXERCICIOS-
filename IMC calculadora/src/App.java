

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.reflect.InvocationTargetException;

public class App extends Application { 
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        System.out.println(getClass().getResource("../fxml/layout.fxml"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = loader.load();
        Scene screen = new Scene(root);

        primaryStage.setTitle("Calculadora de IMC");
        primaryStage.setScene(screen);
        primaryStage.show();

    }


    
}