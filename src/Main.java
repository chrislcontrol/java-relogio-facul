import models.Watch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Watch watch = new Watch();

        watch.printCurrentHour();

        int input = 0;

        while (input != 99) {
            System.out.println("Digite uma opção: ");
            System.out.println("1: Acrescentar hora.");
            System.out.println("2: Acrescentar minuto.");
            System.out.println("3: Acrescentar segundo.");
            System.out.println("4: Decrementar hora.");
            System.out.println("5: Decrementar minuto.");
            System.out.println("6: Decrementar segundo.");
            System.out.println("99: Sair.");
            System.out.print("Digite: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    watch.increaseOneHour();
                    break;
                case 2:
                    watch.increaseOneMinute();
                    break;
                case 3:
                    watch.increaseOneSecond();
                    break;
                case 4:
                    watch.decreaseOneHour();
                    break;
                case 5:
                    watch.decreaseOneMinute();
                    break;
                case 6:
                    watch.decreaseOneSecond();
                    break;
            }

            watch.printCurrentHour();
        }
    }
}