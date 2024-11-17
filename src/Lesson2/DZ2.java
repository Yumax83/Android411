package Lesson2;

public class DZ2 {
    public static void main(String[] args) {
        System.out.printf("-------------------------------%n");
        System.out.printf("    JAVA PRIMITIVE TYPES       %n");
        System.out.printf("-------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s | %n","CATEGORY","NAME","BITS");
        System.out.printf("| %-10s | %-8s | %04d | %n","Floating","double",64);
        System.out.printf("| %-10s | %-8s | %04d | %n","Floating","float",32);
        System.out.printf("| %-10s | %-8s | %04d | %n","Integral","long",64);
        System.out.printf("| %-10s | %-8s | %04d | %n","Integral","int",32);
        System.out.printf("| %-10s | %-8s | %04d | %n","Integral","short",16);
        System.out.printf("| %-10s | %-8s | %04d | %n","Integral","byte",8);
        System.out.printf("| %-10s | %-8s | %04d | %n","Integral","char",16);
        System.out.printf("| %-10s | %-8s | %04d | %n","Boolean","boolean",1);


        // вместо текста использую функцию .SIZE из ДЗ №1 ( возвращает количество бит)
        System.out.println();
        System.out.printf("%n---------------------------------------%n");
        System.out.printf("    C использованием функции .Size %n " +
                " для получения значения в поле BITS %n");
        System.out.printf("---------------------------------------%n");
        System.out.printf("         JAVA PRIMITIVE TYPES          %n");
        System.out.printf("---------------------------------------%n");
        System.out.printf("| %-14s | %-11s | %4s | %n","CATEGORY","NAME","BITS");
        System.out.printf("| %-14s | %-11s | %04d | %n","Floating","double",Double.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Floating","float",Float.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Integral","long",Long.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Integral","int",Integer.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Integral","short",Short.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Integral","byte",Byte.SIZE);
        System.out.printf("| %-14s | %-11s | %04d | %n","Integral","char",16);
        System.out.printf("| %-14s | %-11s | %04d | %n","Boolean","boolean",1);
    }
}
