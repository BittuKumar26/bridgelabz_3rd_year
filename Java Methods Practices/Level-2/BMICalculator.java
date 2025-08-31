import java.util.Scanner;

public class BMICalculator { 
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0; 
        return weight / (heightMeters * heightMeters);
    } 
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] team = new double[10][3]; 
        String[] status = new String[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            team[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            team[i][1] = sc.nextDouble(); 
            team[i][2] = calculateBMI(team[i][0], team[i][1]); 
            status[i] = getBMIStatus(team[i][2]);
        }  
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), team[i][0], team[i][1], team[i][2], status[i]);
        } 
    }
}

