import java.util.Scanner;

public class CalculateDeposit {

    public static void main(String[] args) {

        new CalculateDeposit().calculateInterest();
    }

    double calculateComplexPercentFunction(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

        return round(pay, 2);
    }

    double calculateSimplePercentFunction(double doubleAmount, double double_year_rate, int deposit_period) {
        return round(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double round(double value, int places) {
        double ScaLe = Math.pow(10, places);

        return Math.round(value * ScaLe) / ScaLe;
    }

    void calculateInterest() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double outDoubleVar = 0;

        if (action == 1) {
            outDoubleVar = calculateSimplePercentFunction(amount, 0.06, period);
        } else if (action == 2) {
            outDoubleVar = calculateComplexPercentFunction(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }
}
