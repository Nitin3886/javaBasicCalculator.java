import java.util.Scanner;
import java. lang.Math;
class Input
{
static int a,b;
static Scanner sc = new Scanner(System.in);
static void input1()
{
System.out.print("Enter First Number: ");
a = sc.nextInt();
System.out.print("Enter Second Number: ");
b = sc.nextInt();
}
static void input2()
{
System.out.print("Enter a Number: ");
a = sc.nextInt();
}
static int add(int a,int b)
{
return a+b;
}
static int sub(int a,int b)
{
return a-b;
}
static int mul(int a,int b)
{
return a*b;
}
static int div(int a,int b)
{
return a/b;
}
static int sqr(int a)
{
return a*a;
}
static double sqroot(double a)
{
return Math.sqrt(a);
}
}
class Calculator extends Input
{
static double c;
static void input3()
{
System.out.println("Enter a Number: ");
c = sc.nextDouble();
}
static double sine(double d)
{
return Math.sin(Math.toRadians(d));
}
static double cosine(double d)
{
return Math.cos(Math.toRadians(d));
}
static double tann(double d)
{
return Math.tan(Math.toRadians(d));
}
public static void main(String...args)
{
System.out.println("***** Welcome to Webeduclick Basic Calculator *****");
System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Square \n6. Square Root \n7. Sin \n8. Cos \n9. Tan");
int m = sc.nextInt();
switch(m)
{
case 1:
input1();
System.out.println("\n"+a+"+"+b+"="+add(a,b));
break;
case 2:
input1();
System.out.println("\n"+a+"-"+b+"="+sub(a,b));
break;
case 3:
input1();
System.out.println("\n"+a+"*"+b+"="+mul(a,b));
break;
case 4:
input1();
System.out.println("\n"+a+"/"+b+"="+div(a,b));
break;
case 5:
input2();
System.out.println("\nSquare of "+a+"="+sqr(a));
break;
case 6:
input2();
System.out.println("\nSquare root of "+a+"="+sqroot(a));
break;
case 7:
input3();
System.out.println("\nSine("+c+")="+sine(c));
break;
case 8:
input3();
System.out.println("\nCos("+c+")="+cosine(c));
break;
case 9:
input3();
System.out.println("\nTan("+c+")="+tann(c));
break;
default:
System.out.println("Wrong Entry");
}
}
}
