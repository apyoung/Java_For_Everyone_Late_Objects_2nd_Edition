package answers.ch01_Introduction;

/**
 * Write a program that prints the balance of an account after the first, second, and third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 */

public class P1_04
{
  public static void main(String[] args)
  {
    double balance = 1000;
    double interest = 0.05;

    System.out.printf("Balance for year 0 is %.2f \n", balance);

    for (int year = 1; year <= 3; year++)
    {
      balance = balance + balance * interest;
      System.out.printf("Balance for year %d is %.2f \n", year, balance);
    }
  }
}
