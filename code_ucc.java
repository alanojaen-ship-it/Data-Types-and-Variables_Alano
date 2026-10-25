
public class code_ucc {
    public static void main(String[] args) {


        double centimeters = 275.75;

        
        int wholeMeters = (int) (centimeters / 100);

    
        double remainingCm = centimeters % 100;

    
        System.out.println("===== UNIT CASTING CONVERTER =====");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCm);

        
        int number = 50;
        double convertedNumber = number;

        System.out.println("\n===== IMPLICIT CASTING =====");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + convertedNumber);

        
        double decimalNumber = 25.75;
        int wholeNumber = (int) decimalNumber;


        System.out.println("\n===== EXPLICIT CASTING =====");
        System.out.println("Original Double: " + decimalNumber);
        System.out.println("Converted Integer: " + wholeNumber);
    }
}