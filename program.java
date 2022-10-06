/**
 * program
 */
public class program {

  public static void main(String[] args) {
    MaxNum();
    SquareRoot();
    Length();
  }
  public static void MaxNum() {
    System.out.println("Maximum Number is : " + Math.max(5,6));
  }
  public static void SquareRoot() {
    System.out.println("Square Root of 16 is : " + Math.sqrt(16));
  }
  public static void Length() {
    String name = "Taimoor";
    System.out.println("Character length of name Taimoor is : " + name.length() );
  }
}
