import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть максимальну довжину рядка: ");
        int maxLength = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть текст: ");
        String inputText = scanner.nextLine();

        StringProcessor processor = new StringProcessor(inputText, maxLength);

        System.out.println("\nОброблений текст:");
        System.out.println(processor.getProcessedText());

        scanner.close();
    }
}