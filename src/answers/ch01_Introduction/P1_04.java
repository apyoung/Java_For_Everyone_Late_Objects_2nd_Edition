package answers.ch01_Introduction;

/**
 * Write a program that prints the balance of an account after the first, second, and third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 */

public class P1_04
{

  public static void main(String[] args)
  {
    System.out.println("Balance (0): " + 1000.0);
    System.out.println("Balance (1): " + 1000 * 1.05);
    System.out.println("Balance (2): " + 1000 * 1.05 * 1.05);
    System.out.println("Balance (3): " + 1000 * 1.05 * 1.05 * 1.05);
  }
}
