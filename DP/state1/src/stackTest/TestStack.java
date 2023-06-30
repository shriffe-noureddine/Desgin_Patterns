package stackTest;
import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String answer;
        Stack myStack = new Stack();
        do {
            System.out.print(" 1 - push 2 - pop 3 - quit : ");
            answer = reader.next();
            if (answer.equals("1")) {
                System.out.print("Enter value to push : ");
                int value = reader.nextInt();
                myStack.push(value);
            } else if (answer.equals("2")) {
                System.out.println("Stack top value = "
                        +myStack.pop());
            }
        } while (!answer.equals("3"));
    }
}