import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rez; // Объявляем переменную для хранения результата вычислений
        double second = 0; // Объявляем переменную для хранения второго числа
        boolean fin = false; // Объявляем переменную для проверки завершения вычислений
        char znak; // Объявляем переменную для хранения операции

        System.out.print("Введите первое число: "); // Просим пользователя ввести первое число
        rez = scan.nextDouble(); // Считываем введенное число и сохраняем его как результат

        while (!fin) { // Запускаем цикл, пока не будет введен знак "="
            System.out.print("Введите операцию (+, -, *, /, =): "); // Просим пользователя ввести операцию
            znak = scan.next().charAt(0); // Считываем введенный символ и сохраняем его в операцию

            if (znak != '=') { // Если операция не равна "=", запрашиваем второе число для операции
                System.out.print("Введите следующее число: ");
                second = scan.nextDouble(); // Считываем второе число и сохраняем его
            }

            switch (znak) { // Проверяем значение операции
                case '+': // Если операция - сложение
                    rez += second; // Прибавляем второе число к результату
                    break;
                case '-': // Если операция - вычитание
                    rez -= second; // Выполняем вычитание второго числа из результата
                    break;
                case '*': // Если операция - умножение
                    rez *= second; // Умножаем результат на второе число
                    break;
                case '/': // Если операция - деление
                    rez /= second; // Делим результат на второе число
                    break;
                case '=': // Если операция - равенство
                    fin = true; // Завершаем работу программы
                    break;
                default: // Если введено что-то другое
                    System.out.println("Ошибка ввода: операции " + znak + " не существует."); // Выводим сообщение об ошибке
            }
            System.out.println("Результат: " + rez); // Выводим результат вычислений
        }
    }
}
