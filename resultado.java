import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    // code goes here 
    String aComparar = strArr[0]; 
    String dicionario = strArr[1];
    String[] palavrasSeparadas = dicionario.split(",");
    String resposta = "";

    //guarda o tamanho do array final com as palavras que bateram
    int testeTamanho = 0;
  

    for (int x = 0, y = 0; x < palavrasSeparadas.length; x++){
      if (palavrasSeparadas[x].length() > 1) {
        if (aComparar.contains(palavrasSeparadas[x])) {
          y++;
          testeTamanho = y;
        }

        
      }
    }

    String[] rep = new String[testeTamanho];

    for (int x = 0, y = 0; x < palavrasSeparadas.length; x++){
      if (palavrasSeparadas[x].length() > 1) {

        if (aComparar.contains(palavrasSeparadas[x])) {
          rep[y] = palavrasSeparadas[x];
          
          y++;
        }
      }
    }
    String palavrasJuntas = "";
    String palavraFinal = "";
    boolean funcionou = false;
    for (int x = 0 ; x < rep.length; x++) {
      for (int y = 0; y < rep.length; y ++) {
        palavrasJuntas = rep[x] + rep[y];
        //System.out.println (palavrasJuntas);
        
        if (palavrasJuntas.equals(aComparar)) {
          palavraFinal = rep[x] + "," + rep[y];
          funcionou = true;

        }

      }
      
    }

    String token = "r1omjb4zabc";
    String[] tokenSeparado = token.split("");
    String[] palavraFinalSeparado = palavraFinal.split("");
    String[] palavraFinal2 = new String[tokenSeparado.length + palavraFinalSeparado.length];
    String resultado = "";

    for (int x = 0; x < palavraFinal2.length; x++){
      if (x < palavraFinalSeparado.length){
        resultado = resultado + palavraFinalSeparado[x];
      }
      if (x < tokenSeparado.length){
        resultado = resultado + tokenSeparado[x];
      }
    }

    if (funcionou == false) {
      resultado = "not possible";
    }

    //String abcd = "";
    //for (int x = 0; x < rep.length; x++ ){
    //  abcd = abcd + rep[x];

    //}
   

    

    

    //return strArr[0];
    return resultado;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}
