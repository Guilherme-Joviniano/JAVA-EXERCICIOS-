import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Auth{

    String password;
    String Login;
    int authTries = 3;

    public Auth(String Login, String password){
        this.Login = Login;
        this.password = password;    
    }

    void Authenticantion(){
        Scanner scan = new Scanner(System.in);
        while(authTries > 0){
            
            System.out.println("Digite seu Login: ");
            String typedLogin = scan.next(); 
            System.out.println("Digite sua Senha: ");
            String typedPassword = scan.next();
            
            if(typedLogin != Login || typedPassword != password){
                this.authTries--;
                if(this.authTries == 0) break; 
                System.out.printf("Login ou Senha Incorretos, tente novamente! você ainda têm %d têntativas \n",this.authTries);
                Authenticantion();
            }else{
                System.out.println("Autenticado!");
                break;
            }
        }
        System.out.println("Tentativas excedidas!");
    }
    public static void main(String[] args) {
        Auth user1 =  new Auth("Guilherme", "123");

        user1.Authenticantion();


    }

}