package Lesson3;

public class Main {
    public static void main(String[] args) {
        // ОПЕРАТОРЫ ДЕЙСТВИЯ
        // "=" оператор присваивания
        // "+" оператор сложения или объединения строк
        // "-" оператор разность
        // "*" оператор умножения
        // "/" оператор деления
        // "%" остаток деления
        // примеры
        System.out.println("Сумма = " + (5 + 2)); // сложение (сложение и разность с скобками)
        System.out.println("Сумма = " + 5 + 2);  // объединение
        System.out.println("Разность = " + (5 - 2));  // разность
        System.out.println("Произведение = " + 5 * 2);  // произведение (умножение/деление без скобок)
        System.out.println("Частное = " + 5 / 2);  // результат целочисленный
        System.out.println("Частное = " + 5. / 2);  // результат вещественный (.определяет вещественность)
        // деление целые и вещественные
        int aa = 5;
        int bb = 2;
        double cc;
        cc = aa / bb;
        System.out.println(cc); // если переменные объявлены целочисленные, то ответ 2.0, если вещ-ые, то ответ 2.5
        // с остатком
        System.out.println(5 % 2);
        // решение примера вывести обратную последовательсность "4321"
        int num11 = 4321;
        int a11, b11, c11, d11, res11;
        System.out.println("Исходное число: " + num11);
        a11 = num11 % 10;
        System.out.println("a: " + a11);
        num11 = num11 / 10;
        b11 = num11 % 10;
        System.out.println("b: " + b11);
        num11 = num11 / 10;
        c11 = num11 % 10;
        System.out.println("c: " + c11);
        num11 = num11 / 10;
        d11 = num11 % 10;
        System.out.println("d: " + d11);
        // вывести на экран сумму "1234"
        res11 = a11 * 1000 + b11 * 100 + c11 * 10 + d11;
        System.out.println("Обратное число: " + res11);

        // УНАРНЫЕ ОПЕРАТОРЫ
        // ++ инкремент
        // -- декремент
        // префиксная форма ++a (сначала увеличивается, далее передает значение)
        // постфиксная форма a++ (сначала передает значение потов увеличивается)
        int a22;
        a22 = 8;
        a22++;
        System.out.println(a22); // 9 (+1) увеличил на едингицу
        int b22 = 8;
        b22--;
        System.out.println(b22); // 7 (-1) уменьшил на едингицу
        ++b22;
        System.out.println(b22); // увеличил на едингицу

        int a33 = 8;
        int b33 = ++a33; // b=9 , a= 9 // сначала действие потом сохраняется b
        System.out.println(a33); // 9
        System.out.println(b33); // 9

        int a34 = 8;
        int b34 = a34++; // b=8 , a= 8 // сначала сохраняется в b
        System.out.println(a34); // 9
        System.out.println(b34); // 9

        int a44 = 1;
        int b44 = 1;
        int c44 = a44++ + 3; // c=4
        int d44 = ++b44 + 3; // d=5
        System.out.println(a44); //2
        System.out.println(b44); //2
        System.out.println(c44); //4
        System.out.println(d44); //5

        int a5 = 2;
        int b5 = a5++; // a=3,  b=2 сначала в b попадет двойка, потом a увеличится
        int c5 = b5 + 3 + a5; //с =2+3+3
        System.out.println(c5); // 8

        int a6 = 1;
        int b6 = 2;
        int c6 = a6 + 5 * ++b6; // c= 1 + (5 * 3)
        System.out.println(c6);

        // ПРЕОБРАЗОВАНИЕ БАЗОВЫХ ТИПОВ ДАННЫХ
        //из большой тип в малый тип- это явное ручное преобразование
        int x11 = 5;
        byte y11 = (byte) x11;
        System.out.println(y11);
        // из маого типа в большой тип - это автоматическое преобразования (неявное)
        byte x22 = 5;
        int y22 = x22;
        System.out.println(y22);
        int x33 = 987654321;
        float y33 = x33;
        System.out.println(y33); // преобразование некорректно, более 8 знаков не корректно
        int x4 = 258;
        byte y4 = (byte) x4;
        System.out.println(y4); // не корректно т.к. выходим за размер -128...127
        // пример число помещается
        double x = 18.998989;
        int y = (int) x;
        System.out.println(y); //18 - не правильное округление

        double x6 = 18.998989;
        int y6 = (int) Math.round(x6); // правильное округление
        System.out.println(y6); //19

        // 5,3,7 ср.ариф., сумма, произведение

        double a2 = 5, b2 = 3, c2 = 7;
        double sr, pr, su;
        su = a2 + b2 + c2;
        System.out.println("сумма " + su);
        pr = a2 * b2 * c2;
        System.out.println("произведение " + pr);
        sr = su / 3;
        System.out.println("средняя " + sr);

        //другой вариант с использованием преобразования типа и сокращения кода
        int a3 = 5, b3 = 4, c3 = 7;
        int sum3 = a3 + b3 + c3;
        System.out.println("Сумма = " + sum3);
        System.out.println("Произведение = " + (a3 * b3 * c3));
        System.out.printf("Среднее арифметическое = %.2f ", +(double) sum3 / 3);
        System.out.println();

        int a4 = 5;
        double b4 = 4.7;
        double c4 = a4 + b4;
        System.out.println(c4);
        // неявное преобразование к высшиму типу памяти

        int d5 = 'a' + 3; // 'a' код символа char целочисленное.
        System.out.println(d5);




    }
}
