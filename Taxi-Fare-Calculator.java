import java.util.Scanner;

public class TaxiFareCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double BASE_FARE = 5.0;  
        final double RATE_PER_KM = 2.0; 
        double totalFare = 0.0;  
        String moreRides = "yes"; 
        System.out.println("Taxi Fare Calculaor");
        while (true) {
            System.out.print("Enter the distance for the ride in kilometers: ");
            double distance = s.nextDouble();
            double fareForThisRide = BASE_FARE + (distance * RATE_PER_KM);
            totalFare += fareForThisRide;  
            System.out.printf("The fare for this ride is: %.2f\n", fareForThisRide);
            System.out.print("Do you want to enter another ride? (yes/no): ");
            moreRides = s.next(); 
            if (moreRides.length() != 3 || moreRides.charAt(0) != 'y') {
                break;  
            }
        }
        System.out.printf("\nTotal fare for all rides: %.2f\n", totalFare);
        s.close();
    }
}
