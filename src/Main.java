import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double res;
        double second = 0;
        boolean fin = false;
        System.out.print("Введите первое число: ");
        res = scan.nextDouble();
        while (!fin) {
            System.out.print("Введите операцию (+, -, *, /, =): ");
            char operator = scan.next().charAt(0);
            if (operator != '=') {
                System.out.print("Введите следующее число: ");
                second = scan.nextDouble();
            }
            switch (operator) {
                case '+':
                    res += second;
                    break;
                case '-':
                    res -= second;
                    break;
                case '*':
                    res *= second;
                    break;
                case '/':
                    res /= second;
                    break;
                case '=':
                    fin = true;
                    break;
                default:
                    System.out.println("Ошибка ввода: операции " + operator + " не существует.");
            }
            System.out.println("Результат: " + res);
        }
    }
}