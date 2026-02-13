import java.util.Scanner;
public class simplecalculator{ 
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number:");
    double num1=sc.nextDouble();
    System.out.println("enter the second number:");
    double num2=sc.nextDouble();
    System.out.println("enter the operator(+,-,*,/):");
    char operator=sc.next().charAt(0);
    double result;
    switch(operator){
        case '+':
            result=num1+num2;
            System.out.println("Result:"+result);
            break;
        case '-':
            result=num1-num2;
            System.out.println("Result:"+result);
            break;
        case '*':
            result=num1*num2;
            System.out.println("Result:"+result);
            break;
        case '/':
            result=num1/num2;
            System.out.println("Result:"+result);
            break;
        default:
            System.out.println("invalid");

    }

}}