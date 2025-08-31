public class UnitConverter { 
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    } 
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Demo Main Method
    public static void main(String[] args) { 
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("30 feet to yards: " + convertFeetToYards(30));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("50 inches to meters: " + convertInchesToMeters(50));
        System.out.println("12 inches to cm: " + convertInchesToCentimeters(12)); 
        System.out.println("100°F to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("0°C to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("150 pounds to kg: " + convertPoundsToKilograms(150));
        System.out.println("70 kg to pounds: " + convertKilogramsToPounds(70));
        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}
