package Lesson2;

public class Urok2main {
    public static void main(String[] args) {
        // ESCAPE ПОСЛЕДОВАТЕЛЬСНОСТИ
        // \t табуляция, в примере
        System.out.println("\tПуть к каталогу D:\\folder\\file.txt");
        //устанавливается отступ стандартного TAB

        // \b удаляет символ, в примере:
        System.out.print("2+2=5");
        System.out.print("\b");
        System.out.print("4");
        // удаляется один символ по типу стандартной команды BACKSPACE

        // \r возвращает на начало каретки только в текущей строки, в примере:
        System.out.print("Hello World!!!");
        System.out.print("\r");
        System.out.println("Новый тект");
        // в текущей строке удаляется весь текст и с начала строки новая запись

        // \n новая строка если нужно перенести текст на новую строчку, в примере:
        System.out.println("Hello \nWorld!!!");
        // текст World!!! переносится на новую строчку

        // \" символ двойной кавычки (или одинарной \'), в примере:
        System.out.println("  \"Hello World!!!\"  ");
        // текстовое значение выводится в двойных кавычках "Hello World!!!"

        // \\ символ обратной косой черты,  в примере
        System.out.println("Путь к каталогу D:\\folder\\file.txt");
        // компилятор отрабатывает бех ошибки текст: Путь к каталогу в виде D:\folder\file.txt

        // Команда Printf - отличие команды - можно установить параметрами для удобства вывода значений
        // ПАРАМЕТРЫ ФОРМАТИРОВАНИЯ:
        // запись форматирования %d в команде Printf используется для целочисленных значений типа: byte,short,long,int
        // в примере:
         int a = 5;
         int b = 3;
         int c;
         System.out.printf("a=%d; b=%d; c=%d", a,b, c=a+b);
         // выводятся значения a,b,c с помощью более короткой записи с одновременным арифметическим действием

        // запись форматирования %c в команде Printf используется для вывода одиночного значения: типа char
        // в примере:
         char ch1 = 43;
         System.out.printf("Символ = %c", ch1);
        // выводистя значение символа 43, а именно +

        // запись форматирования %s в команде Printf используется для вывода строковых сзначений: типа string
        // запись форматирования %f в команде Printf используется для вещественных значений типа: float, double
        // добавление в запись %.1f '.1' '.2' '.3' и так далее используется для сокращения знаков после запятой
        // в примере:
         String name = "Ирина";
         float height = 1.7f;
         System.out.printf("Меня зовут %s. Мой рост %.1f.", name, height);
         // на экране выводится текст с обработкой одновременно параметров разных типов переменных: Меня зовут Ирина. Мой рост 1,7.

        // запись форматирования %n это перенос на другую строку
        // в примере
        System.out.printf("Меня зовут %s. %n Мой рост %.1f.", name, height);
        // на экран вторая часть текса с новой строки

        // запись форматирования %число задает количесвто символов (%5, %8 и так далее)
        // примеры
         System.out.printf("%8s%n", "222");
         System.out.printf("%8d%n", 123);
         System.out.printf("%4d%5d%n", 123, 456);
         System.out.printf("%4d%n", 123456789);
         System.out.printf("%12.2f%n", 123.45);
         System.out.printf("%12.2f%n", 123.45678);
         System.out.printf("%-6s%5d%n","num = ",456);
         // но, если количество символов в значении больше установленного орматиррованием, то выводится полное количесво симвовлом минуя установленного формитированием
        System.out.printf("-------------------------------%n");
        System.out.printf("    JAVA PRIMITIVE TYPES       %n");
        System.out.printf("-------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s | %n","CATEGORY","NAME","BITS");
        System.out.printf("| %-10s | %-8s | %04d | %n","floating","double",Double.SIZE);
    }
}
