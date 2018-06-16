import java.util.Scanner;

public class ScannerControl {
    Scanner scanner=new Scanner(System.in);

    public Integer enterNumber(){
        Integer number;
        while (!scanner.hasNextInt()){
            System.out.println("Напишите число правильно. ");
            scanner.next();
        }
        number=scanner.nextInt();
        return number;
    }

    public Calc enterTwoNumbers(){
        Integer number1, number2;
        Calc calc;
        ScannerControl scan = new ScannerControl();
        System.out.println("Введите первое число:");
        number1=scan.enterNumber();
        System.out.println("Введите второе число:");
        number2=scan.enterNumber();
        return calc=new Calc(number1,number2);
    }

}
