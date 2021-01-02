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

}
