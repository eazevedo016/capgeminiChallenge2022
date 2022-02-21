import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
  //declarando arrayList como sendo global
  public static final List<Integer> listaPosicoes = new ArrayList<>();

  
  public static String converteParaMinusculo(String word){
    return word.toLowerCase();     
  }
  
 
  public static void retiraTodosCaracteresRepetidos(ArrayList<Character> listaCaracteresRepetidos, String palavra){
    Set<Character> listaSemRepeticoes = new HashSet<>();

    for(char item: listaCaracteresRepetidos) {
      listaSemRepeticoes.add(item);
    }
    System.out.println("\nCARACTERES QUE SE REPETEM: " + listaSemRepeticoes + "\n");
    System.out.println("-------------------");

    for(char item: listaSemRepeticoes){
      if(!(listaPosicoes==null)) listaPosicoes.add(-1);
      for(int i=0; i<palavra.length(); i++){
        if(item==palavra.charAt(i)){
          listaPosicoes.add(i);
        }
      }
    }
    System.out.println("O numero '1' eh o caracter que se repete e os outros numeros as posicoes desse caracter na string");
    System.out.println(listaPosicoes);

    for(int i = 1; i <- listaPosicoes.size(); i++){
      System.out.println("entrou");
      if(listaPosicoes.get(i)!=-1)
      System.out.println(listaPosicoes.get(i) + "poasd");
    }

}
  
  
  public static ArrayList<Character> extraiTodosCaracteresRepetidos(String palavra){
    ArrayList<Character> list = new ArrayList<Character>();

    for(int i=0; i<palavra.length(); i++){
      if(i==palavra.length()-1) break;
      for(int j=i+1; j<palavra.length();j++){
        if(palavra.charAt(i) == palavra.charAt(j)){
          list.add(palavra.charAt(i));   
        }
      }
    }
    return list;  
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String palavra = scan.next();
    ArrayList<Character> listaCaracteresRepetidos = new ArrayList<Character>();
    
    listaCaracteresRepetidos = extraiTodosCaracteresRepetidos(converteParaMinusculo(palavra));
    retiraTodosCaracteresRepetidos(listaCaracteresRepetidos,palavra);

    scan.close();
  }
}
    

      
      
    

