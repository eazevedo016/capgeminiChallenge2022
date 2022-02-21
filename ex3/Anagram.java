import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
  //declarando arrayList como sendo global
  public static final List<Integer> listaPosicoes = new ArrayList<>();


  /** Função para identifcar os caracteres repetidos e extraí-los
    * @param palavra String - String a ser analisada.
    * @return String - Retorna uma string tendo convertido todos os seus caracteres para minúsculo.
  */
  public static String converteParaMinusculo(String palavra){
    return palavra.toLowerCase();     
  }

 
  /** Procedimeto para retirar os caracteres repetidos da lista de caracteres repetidos já extraídos da string
    * @param palavra String - String a ser comparada.
    * @param listaCaracteresRepetidos ArrayList<Character> - Lista com os caracteres repetidos da palavra, inclusive repetidos na própria lista.
    * @return ArrayList<String> - Retorna uma lista somente com os caracteres únicos que se repetem dentro da String palavra.
  */
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
  }

  
  /** Função para identifcar os caracteres repetidos e extraí-los
    * @param palavra String - String a ser analisada.
    * @return ArrayList<String> - Retorna uma lista com os caracteres repetidos
  */
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
    

      
      
    

