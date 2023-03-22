/*
Question : Java Program to Find the Area of Rhombus
_____________________________________________________
Case 1 (Simple Test Case):

Enter the length of the diagonals of the rhombus
23
45
Area = 517.5
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Area = 0,Diagonal1,Diagonal2;
        System.out.println("Enter the first length of diagonal :");
        Diagonal1 = sc.nextDouble();
        System.out.println("Enter the second length of diagonal :");
        Diagonal2 = sc.nextDouble();
        Area = (Diagonal1 * Diagonal2) / 2;
        System.out.println("Printing the result : " + Area);
    }
}