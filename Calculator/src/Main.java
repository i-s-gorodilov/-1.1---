public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
// Изначально на 6-й строке мы передавали два равных аргумента, разница которых равна 0.
// Программа выдавала ошибку на строке 7 при попытке деления на 0.