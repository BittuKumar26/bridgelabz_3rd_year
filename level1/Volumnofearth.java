/*
7. Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____  */
 

package level1;
public class Volumnofearth {
    public static void main(String[] args) {
        int radius = 6378; 
        double volumeKm3 = (4/3) * Math.PI* Math.pow(radius, 3);  // PI= 22/7;
        double volumeMiles3 = volumeKm3 * 0.238; 
        System.out.println( "The volume of earth in cubic kilometers is " + volumeKm3 + " km^3 and cubic miles is " + volumeMiles3 + " miles^3");
    }
}

