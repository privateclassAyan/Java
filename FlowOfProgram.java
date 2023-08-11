//import java.util.Scanner;
public class FlowOfProgram {
  public static void main(String[] args) {
  /*1. Input a year and find whether it is a leap year or not.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 1st Year = ");
    int y1 = sc.nextInt();
    System.out.print("Enter 2nd year = ");
    int y2 = sc.nextInt();
    while(y1<y2)
    {
      if(LeapYear(y1))
        System.out.println(y1 + " = Leap year");
      y1++;
    }
    
  /*static boolean LeapYear(int year)
    {
      if((year % 100 != 0)&&(year % 4 == 0)||(year%400 == 0))
        return true;
      return false;
    }*/
  /*2. Take two numbers and print the sum of both.
      System.out.println(sum(8, 10));
    }
    static int sum(int a, int b)
    {
      int sum = a+b;
      return sum;
    }*/
  /*3. Take a number as input and print the multiplication table for it.
      Scanner in = new Scanner(System.in);
      System.out.print("Enter numer = ");
      int a = in.nextInt();
      System.out.print("Enter number of multiples = ");
      int b = in.nextInt();
      for(int i = 1; i<= b; i++)
      {
        System.out.println(a+ " * "+ i +" = "+ a*i );
      }*/
  /*4. Take 2 numbers as inputs and find their HCF and LCM.
      Scanner in = new Scanner(System.in);
      System.out.print("Enter two numbers = ");
      int a = in.nextInt();
      int b = in.nextInt();
      System.out.println("Lcm = " + lcm(a, b));
      System.out.println("Hcf = " + hcf(a, b));
    }
    static int lcm(int a, int b)
    { 
      int lcm = (a>b)?a:b;
      while(true)
      {
        if(lcm % a == 0 && lcm % b == 0)
          {
            return lcm;
          }
        ++lcm;
      }
    }
    static int hcf(int a,int b)
    {
      int hcf =1;
      for(int i =1; i<=a && i <= b; i++)
      {
        if(a%i ==0 && b%i ==0)
          hcf = i;
      }
      return hcf;
    }*/
  /*5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    String choice = "";
    int sum = 0;
    Scanner in = new Scanner(System.in);
    while(!choice.equals("x"))
    {
      System.out.println("Enter a number or x to quit");
      choice = in.next();

      if(!choice.equals("x"))
      {
        int number = Integer.parseInt(choice);
        sum += number;
      }
    }
    System.out.println("Sum = "+sum);*/
  }
}