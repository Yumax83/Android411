package Lesson4;

import java.util.Scanner;

public class urok4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // КОМБИНИРОВАННЫЕ ОПЕРАТОРЫ ПРИСВАИВАНИЯ
        // a=a+2       +=        a+=2
        // b=b-34      -=        b-=34
        // с=с*7       *=        с*=7
        // d=d/3       /=        d/=3
        // f=f%4       %=        f%=4
        // выражение      оператор      соеращенное выражение
//        int a = 5;
//        System.out.println(a+10); // 15 a=5
//       // a += 10; // a = a + 10; 5+10=15
//        a -= 2;  // a=a-2; 15-2=13
//        System.out.println(a);
//        int a, b, c, sum;
//        System.out.print("Ведите 1 число: ");
//        a = input.nextInt();
//        System.out.print("Ведите 2 число: ");
//        b = input.nextInt();
//        System.out.print("Ведите 3 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел = " + sum);
        // АЛЬТЕРНАТИВНЫЙ ВВОД c СПОЛЬЗОВАНИЕМ КОМБИНИРОВАННЫХ ОПЕРАТОРОВ
//        int sum;
//        System.out.print("Ведите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Ведите 2 число: ");
//        sum += input.nextInt();
//        System.out.print("Ведите 3 число: ");
//        sum += input.nextInt();
//        System.out.println("Сумма чисел = " + sum);

        // ОПЕРАТОРЫ СРАВНЕНИЯ
        // знак "==" проверяющий равенство
        // знак "!=" проверяющий НЕ равенство

//        int a = 8;
//        int b = 3;
//        System.out.println(a==b); // результат false
//        System.out.println(a!=b); // результат true
//        System.out.println(a>b); // результат true
//        System.out.println(a>=b); // результат true
//        System.out.println(a<b); // результат false
//        System.out.println(a<=b); // результат false

        //Несколько условий: есть логические операторы


//        boolean a2 = 5 > 6 && 4 < 6; // && Оператор "и"  если результат проверки true справа и слева то главный результат true, иначе всегда false
//        System.out.println(a2);
//        boolean a3 = 7 > 6 && 4 < 6;
//        System.out.println(a3);
//
//        boolean a1 = 5 > 6 || 4 < 6; // || Оператор "или"  если результат проверки или слева или справа true, то главный результата всегда true, иначе false т.е. false||false
//        System.out.println(a1);
//
//        boolean a4 = 5 > 6 || 4 == 6; // false
//        System.out.println(a4);
//
//        boolean a5 = 25 > 6 || 4 / 2 < 3; // true
//        System.out.println(a5);
//
//        boolean a6 = 25 < 6 || 4 / 2 > 3; // false
//        System.out.println(a6);
//
//        boolean a7 = 25 > 6 || 5 < 3 && 4 == 4; // true
//        System.out.println(a7);
//
//        boolean a8 = 25 > 6 && 5 < 3 || 4 == 4 * 2;
//        System.out.println(a8);

        // ЛОГИЧЕСКОЕ НЕ  "!"  значение преобразуется на противоположное, например true на false
        // !(a||b) !(a&&b)   преобразуется на противоположное после выполнения в скобках
//        boolean a1 = !(25 > 6 && 5 < 3 && 4 == 4 + 2);
//        boolean a2 = 5 < 3;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(!a2);

        /*
            if (условие)  {
                команда 1
            }
            else {
            команда 2
            }
         */
//        int age;
//        System.out.println("Ваш возраст:  ");
//        age = input.nextInt();
//        if (age >= 17) {
//            System.out.println("Доступ разрешен");
//            System.out.println("Добро пожаловать");
//        } else {
//            System.out.println("Доступ запрещен");
//            System.out.println("Только с 18");
//        }
//        int num1 = 17, num2 = 17;
//        if (num1 > num2) {
//            System.out.println("Первое больше второго");
//        } else if (num1 == num2) {
//                System.out.println("Равны");
//            } else {
//                System.out.println("Первое меньше второго");
//            }
//        int age = 46;
//        if (age >= 18 && age <= 65) {
//            System.out.println("Можете работать");
//        } else{
//            System.out.println("Работать не обязательно");
//        }

//        int age = 25;
//        boolean isYoung = age >= 18;
//        boolean isOld = age <= 65;
//        if (isYoung && isOld) {
//            System.out.println("Можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }
//        int age = 75;
//        if (!(age < 18 || age > 65)) {
//            System.out.println("Можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }
//        int a, b, c;
//        System.out.print("Ведите первую сторону: ");
//        a = input.nextInt();
//        System.out.print("Ведите вторую сторону: ");
//        b = input.nextInt();
//        System.out.print("Ведите третью сторону: ");
//        c = input.nextInt();
//        if (a == b && a == c && c == b) {
//            System.out.println("Треугольник равносторонний");
//        } else if (a == b || a == c || b == c) {
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник разносторонний");
//        }
//        int day, time;
//        System.out.print("Ведите день недели цифрами: ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день.\n Введите время:");
//            time=input.nextInt();
//            if (time >=9 && time<=18){
//                System.out.println("Открыто");
//            }else {
//                System.out.println("Закрыто");
//            }
//        }else if (day==6 || day==7){
//            System.out.println("Выходной день");
//        }else {
//            System.out.println("Такого дня недели не существует");
//        }
//        int n;
//        System.out.print("Введите количество ворон: ");
//        n = input.nextInt();
//        if (n >= 0 && n <= 9) {
//            System.out.print("На ветке ");
//            if (n == 1) {
//                System.out.print(n + " ворона");
//            } else if (n >= 2 && n <= 4) {
//                System.out.print(n + " вороны");
//            } else {                                   // else if (n>=5 && n<=9 || n==0
//                System.out.print(n + " ворон");
//            }
//        } else
//            System.out.print("Ошибка ввода данных");
//        int n;
//        n = input.nextInt();
//        System.out.println(n % 10);
        //ТЕРНАРНЫЙ ОПЕРАТОР
//        int number, res;
//        number = -10;
//        res = number >= 0 ? number: -number;
//        System.out.println(res);

        int age=18;
        int a;
        System.out.println("Введите возраст: ");
        age = input.nextInt();
        //System.out.println(age >= 18 ? "Приятного просмотра" : "Вам еще рано смотреть этот фильм");
        System.out.printf(age >= 18 ? "fdf" : "Вам еще рано смотреть этот фильм");


    }
}


