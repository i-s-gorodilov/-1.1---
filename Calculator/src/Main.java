package Calculator;

public class Main {

    public static void main(String args[])
    {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        //обработка ошибки
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
        catch(Exception e)
        {
            System.out.println("Во время операции деления произошла следующая ошибка: " + e.getMessage());
        }
        //изначальный код не работает, так как значение переменной b -> 0, а на 0 делить нельзя
        //int b = calc.minus.apply(1,1);
        //int b = calc.minus.apply(2, 1);
        //int c = calc.devide.apply(a, b);

        //calc.println.accept(c);
    }

}
