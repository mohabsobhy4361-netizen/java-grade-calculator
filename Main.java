import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a grade :");
        int grade = input.nextInt();

        if (grade >= 99 && grade <= 100) {
            System.out.println("A+");

        } else if (grade >= 90 && grade <= 98) {
            System.out.println("A");

        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");

        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");

        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");

        } else if (grade >= 0 && grade <= 59) {
            System.out.println("F");

        } else {
            System.out.println("enter a number between 0 and 100 ");
        }
    }
}