import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    String first = s.substring(0,1).toLowerCase();
    if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")){
      return s.toLowerCase() + "hay";
    }
    else{
      return s.substring(1).toLowerCase() + first + "ay";
    }
  }

  public static String pigLatin(String s){
    String digraph = "";
    if (s.length() > 1) digraph = s.substring(0,2).toLowerCase();
    if (digraph.equals("bl") || digraph.equals("br")
    || digraph.equals("ch") || digraph.equals("ck") || digraph.equals("cl") || digraph.equals("cr")
    || digraph.equals("dr") || digraph.equals("fl") || digraph.equals("fr")
    || digraph.equals("gh") || digraph.equals("gl") || digraph.equals("gr") || digraph.equals("ng")
    || digraph.equals("ph") || digraph.equals("pl") || digraph.equals("pr") || digraph.equals("qu")
    || digraph.equals("sc") || digraph.equals("sh") || digraph.equals("sk") || digraph.equals("sl")
    || digraph.equals("sm") || digraph.equals("sn") || digraph.equals("sp") || digraph.equals("st")
    || digraph.equals("th") || digraph.equals("tr") || digraph.equals("tw")
    || digraph.equals("wh") || digraph.equals("wr")){
      return s.substring(2).toLowerCase() + digraph + "ay";
    }
    else{
      return pigLatinSimple(s);
    }
  }


  public static String pigLatinBest(String s){
    char last = s.charAt(s.length()-1);
    if(!Character.isLetter(s.charAt(0))){
      return s;
    }
    else if (!Character.isLetterOrDigit(last)){
      return pigLatin(s.substring(0,s.length()-1)) + last;
    }
    else{
      return pigLatin(s);
    }
  }

  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner m = new Scanner(n.nextLine());
      while (m.hasNext()){
        System.out.print(pigLatinBest(m.next()));
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
