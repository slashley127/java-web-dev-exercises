package exercises.lsn1;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of your rectangle: ");
        int length = input.nextInt();

        System.out.println("Please enter the width of your rectangle: ");
        int width = input.nextInt();

        int area = length*width;
        System.out.println("The area of your rectangle is " + area);




    }
}
