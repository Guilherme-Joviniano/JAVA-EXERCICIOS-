import java.util.Scanner;

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
            if(!Login.equals(typedLogin) || !password.equals(typedPassword)){
                this.authTries--;
                if(this.authTries == 0) break; 
                System.out.printf("Login ou Senha Incorretos, tente novamente! você ainda têm %d têntativas \n", this.authTries);
                Authenticantion();
            }else{
                System.out.println("Autenticado!");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        Auth user1 =  new Auth("guilherme", "123");
        System.out.println(user1.Login + user1.password);
        user1.Authenticantion();
    }

}