package exercises.lsn1;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many miles you have driven: ");
        double milesDriven = input.nextDouble();

        System.out.println("Please enter the amount of gas (in gallons) you have used: ");
        double gallonsConsumed = input.nextDouble();

        double milesPerGallon = milesDriven/gallonsConsumed;
        System.out.println("Your car currently gets " + milesPerGallon + " miles per gallon");
    }
}
