import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        int age;
        int giveupAge;

        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = userAge.nextInt();

        giveupAge = 100 - age;

        System.out.println(age + "-year olds should read at least " + giveupAge + " pages before giving up on a book.");
        userAge.close();
    }
}
