import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    
    public static String converteParaMinusculo(String word){
        return word.toLowerCase();     
    }
    
    public static void ordenaLista(char[] newList){
        Arrays.sort(newList);
    }
    
    public static void retiraTodosCaracteresRepetidos(char[] newList){
        System.out.println(newList);    
    }
    
    
    
    public static char[] extraiTodosCaracteresRepetidos(String palavra){
        char[] list = new char[1000];
        int count = 0;

        for(int i=0; i<palavra.length(); i++){
            if(i==palavra.length()-1) break;
            System.out.println("I = " + palavra.charAt(i));
            for(int j=i+1; j<palavra.length();j++){
                if((palavra.charAt(i) == palavra.charAt(j)) && (palavra.charAt(i) != list[count])){
                    list[count] = (char) palavra.charAt(i);
                    count = count + 1;
                }
                System.out.println("J = " + palavra.charAt(j));
            }
        }
        return list;  
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        char[] newList = new char[1000];
        
        newList = extraiTodosCaracteresRepetidos(converteParaMinusculo(palavra));
        
        ordenaLista(newList);
        retiraTodosCaracteresRepetidos(newList);
        
               
    }
}
    

      
      
    

