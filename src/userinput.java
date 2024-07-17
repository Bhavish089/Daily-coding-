import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from user > ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one : ");
        float a = sc.nextFloat();
        //int a  = sc.nextInt();
        System.out.println("Enter number two : ");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b;
        float sum =  a + b;
        System.out.println("The sum of two number is " + sum);
        System.out.println("Enter an integer");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
