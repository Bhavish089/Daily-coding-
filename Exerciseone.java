/*In this Exersice we will calc the percentage of 5 subjects */
import java.util.Scanner;

public class Exerciseone {
    public static void main(String[] args) {
        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter your full Name: ");
        String name2 = name1.nextLine();
        Scanner sub = new Scanner(System.in);
        System.out.println("Marks obtain in Eng : ");
        float a = sub.nextInt();
        System.out.println("Marks obtain in Mathematics : ");
        float b = sub.nextFloat();
        System.out.println("Marks obtain in Physics : ");
        float c = sub.nextFloat();
        System.out.println("Marks obtain in Chemistry : ");
        float d = sub.nextFloat();
        System.out.println("Marks Obtain in Computers : ");
        float e = sub.nextFloat();

        float percentage = a+b+c+d+e/100;
        System.out.println(name2 + " Your Percentage is " + percentage);
    }
}
