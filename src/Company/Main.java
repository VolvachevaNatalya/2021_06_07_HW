package Company;

import jdk.dynalink.Operation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        function1();
        function2();


//        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        System.out.print("Выводитвсечисла: ");
//        System.out.print("Не выводит ни одного числа: ");...
//        System.out.print("Вывод четных чисел: ");...
//        System.out.print("Вывод нечетных чисел: ");...
//        System.out.print("Выводчиселбольше5: ");


        Double res1 = calculate(12.0, 4, (a,b) -> a + b);
        System.out.println("a + b = " + res1);
        Double res2 = calculate(12.0, 4, (a,b) -> a - b);
        System.out.println("a - b = " + res2);
        Double res3 = calculate(12.0, 4, (a,b) -> a * b);
        System.out.println("a * b = " + res3);
        Double res4 = calculate(12.0, 4, (a,b) -> a / b);
        System.out.println("a / b = " + res4);
        Double res5 = calculate(5.0, 2.0, (a,b) -> Math.pow(a,b));
        System.out.println("a ^ b = " + res5);
        Double res6 = calculate(55.0, 77.0, (a, b) -> a > b ? a : b);
        System.out.println("Max number is " + res6);
        Double res7 = calculate(55.0, 77.0, (a, b) -> a > b ? b : a);
        System.out.println("Min number is " + res7);
    }


    //#1:
    private static void function1() {
        Double a = 1.5;
        Double b = 2.0;
        Double c = 2.0;
        Function<Double, Double> function1 = (x) -> (a+b+c)*x;
        System.out.println(function1.apply(3.0));
    }

    // #2
    public static void function2() {
        Function<String, Long> converter = (str) -> Long.parseLong(str) *2;
        Long result = converter.apply("200");
        System.out.println(result);

    }


   //  #4
    public static Double calculate (double a, double b, DoubleOperator operator) {
        return operator.apply(a,b);
    };
};

