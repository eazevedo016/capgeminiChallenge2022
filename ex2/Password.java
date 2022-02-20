import java.util.Scanner;

public class Password {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String password;
  
    password = scan.next();

    if(password.length() <= 6){
      System.out.println(6-password.length());
    }

    scan.close();
  }
}
  

