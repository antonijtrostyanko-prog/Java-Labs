//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.print("Выберите задание: ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    while (a < 1 || a > 3) {
        System.out.print("Нет такого варианта!!! Попробуйте ещё раз: ");
        a = scanner.nextInt();
    }
    switch (a) {
        case 1:
            System.out.print("Введите градусы по Фаренгейту: ");
            double f = scanner.nextDouble();
            while (f < -459.4) {
                System.out.print("Невозможная температура, введите ещё раз: ");
                f = scanner.nextDouble();
            }
            double c = (f - 32) * 5 / 9;
            System.out.print("По Цельсии это: " + c);
            break;
        case 2:
//            System.out.print("Выберите какую валюту вы хотите перевести: 1-USD, 2-EUR, 3-RUB ");
//            int choice = scanner.nextInt();
//            while (choice < 1 || choice > 3) {
//                System.out.print("Несуществующий код валюты! Выберите код валюты от 1-3: ");
//                choice = scanner.nextInt();
//            }
            int choice;
            do {
                System.out.print("Выберите какую валюту вы хотите перевести: 1-USD, 2-EUR, 3-RUB ");
                choice = scanner.nextInt();
            } while (choice < 1 || choice > 3);
            System.out.print("Введите сумму: ");
            double x = scanner.nextDouble();
            while (x < 0) {
                System.out.print("Некорректная сумма, введите ещё раз: ");
                x = scanner.nextDouble();
            }
            System.out.print("Выберите в какую валюту вы хотите перевести: 1-USD, 2-EUR, 3-RUB ");
            int choice1 = scanner.nextInt();
            while (choice == choice1 || choice1 < 1 || choice1 > 3) {
                System.out.print("Выберите другой существующий код валюты: ");
                choice1 = scanner.nextInt();
            }
            double result = 0;
            if (choice == 1 && choice1 == 2) {
                result = x * 0.86;
            } else if (choice == 1 && choice1 == 3) {
                result = x * 86.6;
            } else if (choice == 2 && choice1 == 1) {
                result = x * 1.16;
            } else if (choice == 2 && choice1 == 3) {
                result = x * 100.5;
            } else if (choice == 3 && choice1 == 1) {
                result = x * 0.01;
            } else if (choice == 3 && choice1 == 2) {
                result = x * 0.0099;
            }
            System.out.print(result);
            break;
        case 3:
            System.out.print("Введите начало диапазона А: ");
            int a1 = scanner.nextInt();
            System.out.print("Введите конец диапазона B: ");
            int b = scanner.nextInt();
            while (b <= a1) {
                System.out.print("Конец диапазона должен быть больше начала! Введите ещё раз: ");
                b = scanner.nextInt();
            }
            int sum = 0;
            for (int i = a1; i <= b; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.print("Сумма чётных чисел в диапазоне = " + sum);
            break;
    }
    scanner.close();
}