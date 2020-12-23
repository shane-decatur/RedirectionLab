import java.util.*;
public class MakeStars{

  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner m = new Scanner(n.nextLine());
      while (m.hasNext()){
        String str = m.next();
        System.out.print(str);
      }
      System.out.println();
    }
  }
}
