//import java.util.*;

public class First_Java {
  public static void main(String[] args) {
  //Scanner in = new Scanner(System.in);
  /*1. Write a program to print whether a number is even or odd, also take input from the user.
    System.out.print(" enter a number = ");
    int a = in.nextInt();
    if(a%2 == 0)
      System.out.println("Even");
    else
      System.out.println("Odd");*/
  /*2. Take name as input and print a greeting message for that particular name.
    String a = in.nextLine();
    System.out.println("hi "+ a);*/
  /*3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    int p,t,r;
    System.out.print("Enter Principle = ");
    p = in.nextInt();
    System.out.print("Enter time(in years) = ");
    t = in.nextInt();
    System.out.print("Enter rate = ");
    r = in.nextInt();
    System.out.println("your total ammount = "+ (p+(t*r)) +"/-");*/
  /*4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    int ans=0;
    while(true)
    {
      System.out.print("Enter operator = ");  
      int op = in.next().trim().charAt(0);
      
        if(op == '/'||op == '%'||op == '*'||op == '+'||op == '-')
        {
          System.out.print("enter number = ");
          int a = in.nextInt();
          int b = in.nextInt();
          if(op == '/')
          {
            if(a != 0 && b != 0)
              {ans = a/b;}
            else
              {System.out.println("can't devide by ");}
          }
          if(op == '%')
          {
            if(a != 0 && b != 0)
              ans = a%b;
          }
          if(op == '*')
          {
          ans = a*b;
          }
          if(op == '+')
            {
              ans = a+b;
            }
          if(op == '-')
            {
              ans = a-b;
            }
        }
        else if(op == 'x'||op == 'X')
        {
          break;
        }
        else
        {
          System.out.println("Invalid operator");
        }
        System.out.println(ans);
    }*/
  /*5. Take 2 numbers as input and print the largest number.
    System.out.print("Enter two numbers = ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = Math.max(a, b);
    System.out.println("Large number is = "+c);*/
  /*6. Input currency in rupees and output in USD.
    System.out.print("Enter rupees/- = ");
    double inr = in.nextDouble();
    double usd = inr/82.25;
    System.out.println("usd = "+String.format("%.2f",usd)+"/-");*/
  /*7. To calculate Fibonacci Series up to n numbers.
    System.out.println("Enter nth number = ");
    int num = in.nextInt();
    int p = 0;
    int i = 1;
    int sum =1;
    int count = 2;
    System.out.print(p+" "+i+" ");
    while(count<=num)
    {
      int temp = i;
      i = p + i;
      p = temp;
      sum += i;
      count++;
      System.out.print(i+" ");
    }
    System.out.println("Nth = "+ i+" Sum = "+sum);*/
  /*8. To find out whether the given String is Palindrome or not.
    String org = "AbcdcbA", rev = "";
    char a;
    for(int i = 0; i<org.length();i++)
    {
      a = org.charAt(i);
      rev = a+rev;
    }
    System.out.println(rev +" "+ org);
    if(org.equals(rev))
      System.out.println("String is palindrom");
    else
      System.out.println("not palindrom");*/
  /*9. To find Armstrong Number between two given number.
    System.out.println("Enter range = ");

    int low = in.nextInt(); 
    int high = in.nextInt();

      for(int number = low + 1; number < high; ++number) 
      {
        int digits = 0;
        int result = 0;
        int originalNumber = number;

        // number of digits calculation
        while (originalNumber != 0) {
          originalNumber /= 10;
          ++digits;
        }

        originalNumber = number;

        // result contains sum of nth power of its digits
        while (originalNumber != 0) {
          int remainder = originalNumber % 10;
          result += Math.pow(remainder, digits);
          originalNumber /= 10;
        }

        if (result == number) {
          System.out.print(number + " ");
        }
      */
  }
}
