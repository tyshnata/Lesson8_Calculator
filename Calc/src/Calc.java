public class Calc {

    Integer a;
    Integer b;

    public Calc(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public void divide(Integer a, Integer b) throws NumberLessThanZeroExeption, DivisionByZeroExeption{
        if (a<0 | b<0){
            throw new NumberLessThanZeroExeption(" Числа меньше нуля");
        }
        if (b==0){
            throw new DivisionByZeroExeption(" Деление на ноль");
        }
        System.out.println(a +"/"+b +" = "+(double)a/b);
    }

    public void multiplication(Integer a, Integer b) throws NumberLessThanZeroExeption{
        if (a<0 | b<0){
            throw new NumberLessThanZeroExeption(" Числа меньше нуля");
        }
        System.out.println(a +"*"+b +" = "+a*b);
    }
    public void add(Integer a, Integer b) throws NumberLessThanZeroExeption{
        if (a<0 | b<0){
            throw new NumberLessThanZeroExeption(" Числа меньше нуля");
        }
        System.out.println(a +"+"+b +" = "+(a+b));
    }
    public void subtraction(Integer a, Integer b) throws NumberLessThanZeroExeption{
        if (a<0 | b<0){
            throw new NumberLessThanZeroExeption(" Числа меньше нуля");
        }
        System.out.println(a +"-"+b +" = "+(a-b));
    }
}
