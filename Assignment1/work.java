import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        String imput = sc.nextLine();
        System.out.println("You are "+ imput +" years old.");
        int num1 = 10;
        int num2 = 37;
        int sum = num1+num2;
        System.out.println("The sum of "+ num1 +" and "+ num2 +" is "+ sum +".");
        // I learned about the scanners and how to use them properly.
        // In order to do an imput I have to put sc.nextLine then it'll read as an imput.
        // For me to make a sum i had to make a sum vareable
    }
}
