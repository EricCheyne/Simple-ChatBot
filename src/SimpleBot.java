import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int integer = scanner.nextInt();

        for (int i = 0; i <= integer; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Why do we use methods?");
        String answerOptions = """
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.""";
        System.out.println(answerOptions);

        answerUser(1, 2, 3, 4);

        scanner.close();
    }

    static void answerUser(int option1, int option2, int option3, int option4) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(userInput);

        if (userInput == option2) {
            System.out.println("Congratulations, have a nice day!");
        } else {
            System.out.println("Please try again.");
            answerUser(option1, option2, option3, option4);
        }

        scanner.close();
    }
}
