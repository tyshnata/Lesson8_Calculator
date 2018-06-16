public class Main {
    public static void main(String[] args){
        PrintInfo.infoOnActions();
        choiceAct();
    }

    private static void choiceAct(){
        ScannerControl scan = new ScannerControl();
        Integer item;
        Calc calc;
        try {
            while (true) {
                item = scan.enterNumber();

                switch (item) {
                    case 1:
                        calc=scan.enterTwoNumbers();
                        calc.add(calc.getA(), calc.getB());
                        PrintInfo.infoOnActions();
                        break;
                    case 2:
                        calc=scan.enterTwoNumbers();
                        calc.subtraction(calc.getA(), calc.getB());
                        PrintInfo.infoOnActions();
                        break;
                    case 3:
                        calc=scan.enterTwoNumbers();
                        calc.multiplication(calc.getA(), calc.getB());
                        PrintInfo.infoOnActions();
                        break;
                    case 4:
                        calc=scan.enterTwoNumbers();
                        calc.divide(calc.getA(), calc.getB());
                        PrintInfo.infoOnActions();
                        break;
                    case 0:
                        System.out.println("Пока!");
                        return;
                    default:
                        System.out.println("Введите правильное значение. ");
                }
            }
        }
        catch (DivisionByZeroExeption e){
            System.out.println("Ошибка: " + e);
        }
        catch (NumberLessThanZeroExeption e){
            System.out.println("Ошибка: " + e);
        }


    }
}
