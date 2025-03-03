import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private double a;
    private double b;
    private double x;

    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }

    private void inputValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        this.a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        this.b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        this.x = scanner.nextDouble();
    }

    private double calculateY() {
        return Math.pow(Math.sin(Math.pow(x * x + a, 2)), 3) - Math.sqrt(a / b);
    }

    private double calculateZ() {
        return x * x / a + Math.cos(Math.pow(a + b, 3));
    }

    private void print(double y, double z) {
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    private void printDateTime() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Поточна дата і час: " + formatter.format(now));
    }

    private void run() {
        inputValues();
        double y = calculateY();
        double z = calculateZ();
        print(y, z);
        printDateTime();
    }
}