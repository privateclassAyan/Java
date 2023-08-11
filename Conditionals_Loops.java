import java.util.Scanner;

public class Conditionals_Loops {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*1. Area Of Circle Java Program
      System.out.println("Enter radious = ");
      int r = in.nextInt();
      double pi = 3.14159;
      double area = Math.PI*(Math.pow(r, 2));
      System.out.println(String.format("%.2f", area));*/
    /*2. Area Of Triangle
      System.out.print("enter base = ");
      int b = in.nextInt();
      System.out.print("Enter height = ");
      int h = in.nextInt();
      int Area = (int)(0.5*(h*b));
      System.out.println("Area = "+Area);*/
    /*3. Area Of Rectangle Program
      System.out.print("Enter width = ");
      int w =in.nextInt();
      System.out.print("Enter Length = ");
      int l = in.nextInt();
      int area = w*l;
      System.out.println("Area of a Recangle = "+area);*/
    /*4. Area Of Isosceles Triangle
      System.out.print("enter base = ");
      int b = in.nextInt();
      System.out.print("Enter height = ");
      int h = in.nextInt();
      int Area = (int)((h*b)/2);
      System.out.println("Area = "+Area);*/
    /*5. Area Of Parallelogram
      System.out.print("Enter base = ");
      int b = in.nextInt();
      System.out.print("Enter height = ");
      int h = in.nextInt();
      int area = b*h;
      System.out.println("Area = "+area);*/
    /*6. Area Of Rhombus
      System.out.print("Enter Diagonal = ");
      int p = in.nextInt();
      System.out.print("Enter Diagonal = ");
      int q = in.nextInt();
      int area = (p*q)/2;
      System.out.println("Area = "+area);*/
    /*7. Area Of Equilateral Triangle
      System.out.print("Enter the sides = ");
      double a = in.nextDouble();
      double area = (Math.sqrt(3)/4)*(Math.pow(a, 2));
      System.out.println(String.format("Area of Equilateral Triangle = %.5f",area));*/
    /*8. Perimeter Of Circle
      System.out.println("Enter Radious");
      int r = in.nextInt();
      double Perimeter = 2*(Math.PI*(r));
      System.out.println("Perimeter of circle = "+Perimeter);*/
    /*9. Perimeter Of Equilateral Triangle
      System.out.print("Enter sides = ");
      int a = in.nextInt();
      int p = 3*a;
      System.out.println("Perimeter of Equilateral Triangle = "+p);*/
    /*10. Perimeter Of Parallelogram
      System.out.print("Enter Base = ");
      int b = in.nextInt();
      System.out.print("Enter Side = ");
      int a = in.nextInt();
      int p = 2*(a+b);
      System.out.println("Perimeter of Parallelogram = "+p);*/
    /*11. Perimeter Of Rectangle
      System.out.print("Enter Base = ");
      int b = in.nextInt();
      System.out.print("Enter Side = ");
      int a = in.nextInt();
      int p = 2*(a+b);
      System.out.println("Perimeter of Parallelogram = "+p);*/      
    /*12. Perimeter Of Square 
      System.out.print("Enter sides = ");
      int a = in.nextInt();
      int p = 4*a;
      System.out.println("Perimeter of Equilateral Square = "+p);*/
    /*13. Perimeter Of Rhombus
      System.out.print("Enter sides = ");
      int a = in.nextInt();
      int p = 4*a;
      System.out.println("Perimeter of Equilateral Rhombus = "+p);*/
    /*14. Volume Of Cone Java Program
      System.out.print("Enter radious = ");
      double r = in.nextDouble();
      System.out.print("Enter height = ");
      double h = in.nextDouble();
      double v = (Math.PI * r * r * h) / 3;
      System.out.println(String.format("Volume of Cone = %.4f",v));*/
    /*15. Volume Of Prism
      System.out.print("Enter the base = ");
      int b = in.nextInt();
      System.out.print("Enter height = ");
      int h = in.nextInt();
      int v = b*h;
      System.out.println("the voulume = "+v);*/
    /*16. Volume Of Cylinder
      System.out.print("Enter radious = ");
      double r = in.nextDouble();
      System.out.print("Enter height = ");
      double h = in.nextDouble();
      double Volume = Math.PI*(Math.pow(r, 2))*h;
      System.out.println(String.format("%.2f", Volume));*/
    /*17. Volume Of Sphere
      System.out.print("Enter radious = ");
      double r = in.nextDouble();
      double v = (4.0/3.0)*(Math.PI*(Math.pow(r, 3)));
      System.out.println(v);*/
    /*18. Volume Of Pyramid
      System.out.print("Enter base = ");
      double b = in.nextDouble();
      System.out.print("Enter width = ");
      double w = in.nextDouble();
      System.out.print("Enter height = ");
      double h = in.nextDouble();
      double v = (b*w*h)/3;
      System.out.println(String.format("Volume of Pyramid = %.2f",v));*/
    /*19. Curved Surface Area Of Cylinder
      20. Total Surface Area Of Cube*/
    /*21. Fibonacci Series In Java Programs
      int n1, n2;
      n1=0; n2=1;
      System.out.print(n1+" "+n2);
      for(int i=2;i<10;i++)
      {
        int temp = n2;
        n1 += n2;
        n2 += n1;
        System.out.print(" "+n1+" "+n2);
        //System.out.println("\n"+i);
      }*/
    /*22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)*/
    /*23. Input a number and print all the factors of that number (use loops).
      System.out.print("enter a number = ");
      int a = in.nextInt();
      System.out.print("Enter number of factors = ");
      int f = in.nextInt();
      for(int i = 1; i<=f ; i++)
      {
        System.out.println(a+" * "+i+" = "+a*i);
      }*/
    /*24. Take integer inputs till the user enters 0 and print the sum of all numbers(HINT: while loop)
      System.out.println("Enter a number = ");
      int n,sum=0;
      while(true)
      {
        n = in.nextInt();
        if(n == 0)
          break;
        sum += n;
      }
      System.out.print("sum is = "+sum);*/
    /*25. Take integer inputs till the user enters 0 and print the largest number from all.
      System.out.println("Enter number or '0'(zero) to exit = ");
      int n,max = 0;
      while(true)
      {
        n = in.nextInt();
        if(n == 0)
          break;
        else if(n>=max)
          max = n;
      }
      System.out.println("Max value = "+max);*/
    /*26. Addition Of Two Numbers
      System.out.print("Enter number = ");
      int a = in.nextInt();
      System.out.print("enter number = ");
      int b = in.nextInt();
      System.out.println(a+" + "+b+" = "+ (a+b));*/
  }
}