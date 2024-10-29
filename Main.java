import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // all problems hardcoded cuz lazy, can jus add scanner
    // TODO: Problem 1
    ratio(17, 0);

    // TODO: Problem 2
    factor(8, 2);

    // TODO: Problem 3
   range5059(60);

   // Problem 4
   p4(5, 10);
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    return (r1.getLength() == r2.getLength()) && (r1.getWidth() == r2.getWidth());
  }
  public static void ratio(int a, int b) 
  {
    if ((a==0) || (b==0))
    {
      System.err.println("Cannot Divide by Zero");
    }
    else
    {
      if (((double)a/b > 1) && ((double)a/b <= 8))
      {
        System.out.println("Ratio OK");
      }
      else
      {
        System.out.println("Ratio NOT ok");
      }
    }
  }
  public static void factor(int a, int b)
  {
    if (b==0)
    {
      System.err.println("Factor cannot be 0");
    }
    else 
    {
      if (a%b == 0)
      {
       System.out.println("Is a factor");
      }
      else
      {
        System.out.println("is NOT a factor");
      }
  }
  }
  public static void range5059(int a)
  {
    if ((a>59)||(a<50))
    {
      System.out.println("That's not in the fifties!");
      a = 55;
    }
    System.out.println("Your number is "  + a);
  }
  public static void p4(int x, int y)
  {
    if (!(y>9)||!(x<=2)&&(x*y>10))
    {
      System.out.println("pass");
    }
    else
    {
      System.out.println("fail");
    }
  }
}
