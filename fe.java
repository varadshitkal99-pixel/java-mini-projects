import java.util.Scanner;

public class fe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kg ;
        double lbs ;
       

        System.out.println("enter your weight in kg ");
        kg = scanner.nextDouble();
        double newlbs = kg * 2.20462;
        

        System.out.println("your weight in lbs is" + newlbs);

        scanner.close();
    }
}