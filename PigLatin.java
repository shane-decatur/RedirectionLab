public class PigLatin{
  public static String pigLatinSimple(String s){
    String first = s.substring(0,1);
    if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")){
      return s + "hay";
    }
    else{
      return s.substring(1) + first + "ay";
    }
  }

  public static String pigLatin(String s){
    String digraph = s.substring(0,2);
    if (digraph.equals("bl") || digraph.equals("br")
    || digraph.equals("ch") || digraph.equals("ck") || digraph.equals("cl") || digraph.equals("cr")
    || digraph.equals("dr") || digraph.equals("fl") || digraph.equals("fr")
    || digraph.equals("gh") || digraph.equals("gl") || digraph.equals("gr") || digraph.equals("ng")
    || digraph.equals("ph") || digraph.equals("pl") || digraph.equals("pr") || digraph.equals("qu")
    || digraph.equals("sc") || digraph.equals("sh") || digraph.equals("sk") || digraph.equals("sl")
    || digraph.equals("sm") || digraph.equals("sn") || digraph.equals("sp") || digraph.equals("st")
    || digraph.equals("th") || digraph.equals("tr") || digraph.equals("tw")
    || digraph.equals("wh") || digraph.equals("wr")){
      return s.substring(2) + digraph + "ay";
    }
    else{
      return pigLatinSimple(s);
    }
  }

  public static void main(String[] args){
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
  }
}
