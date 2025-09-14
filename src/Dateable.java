import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        int userAge;
        int eligibleAge;

        Scanner age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        userAge = age.nextInt();

        eligibleAge=(userAge/2)+7;

        System.out.println(userAge + "-year olds should date somebody who is at least " + eligibleAge + " years old.");
        age.close();

    }
}
