import java.util.*;

public class gcd {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.printf("Enter an integer a:\n");
    int a = s.nextInt();
    s.nextLine();
    
    System.out.printf("Enter an integer b\n");
    int b = s.nextInt();
    s.nextLine();
    s.close();

    System.out.printf("The GCD of %d and %d is %d", a, b, findGCD(a, b));
  }

  public static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = a;
      a = b;
      b = temp % b;
    }

    return a;
  }
}