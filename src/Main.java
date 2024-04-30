import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rez;
        double second = 0;
        boolean fin = false;
        char znak;
        System.out.print("Введите первое число: ");
        rez = scan.nextDouble();
        while (!fin) {
            System.out.print("Введите операцию (+, -, *, /, =): ");
            znak = scan.next().charAt(0);
            if (znak != '=') {
                System.out.print("Введите следующее число: ");
                second = scan.nextDouble();
            }
            switch (znak) {
                case '+':
                    rez += second;
                    break;
                case '-':
                    rez -= second;
                    break;
                case '*':
                    rez *= second;
                    break;
                case '/':
                    rez /= second;
                    break;
                case '=':
                    fin = true;
                    break;
                default:
                    System.out.println("Ошибка ввода: операции " + znak + " не существует.");
            }
            System.out.println("Результат: " + rez);
        }
    }
}