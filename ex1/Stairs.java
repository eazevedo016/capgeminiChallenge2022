import java.util.Scanner;

public class Stairs {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;

    n = scan.nextInt();
    int auxiliary = n;

    //laço for para escrever os asteriscos conforme formatação pedida.
    for(int i=1; i<=n; ++i){
      String symbol = "*";
      String space = " ";
      
      System.out.println(space.repeat(auxiliary-1) + symbol.repeat(i));
      auxiliary = auxiliary - 1;
    }
    
    scan.close();
  }
}