package netcafe;
import java.uti.*;
public class NetCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Net Cafe Login ===");
        
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        
        if (username.equals("admin")&& (password.equals("admin123"))){
            System.out.println("Login Success!");
            System.out.println("Welcome Back, Admin");
        } else if (username.equals("staff") && (password.equals("staff123"))){
            System.out.println("Login Success!");
            
        } else if (username.equals("customer") && (password.equals("customer123"))){
            System.out.println("Login Success!");
        } else {
            System.out.println("Invalid username or password");
        }
    } 
}
