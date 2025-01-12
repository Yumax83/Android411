package lesson27.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 4};
        Double[] doubleArray = {3.3, 2.2, 1.1, 4.4};
        Character[] characterArray = {'G','e','n','e','r','i','c'};
       printArray(intArray);
       printArray(doubleArray);
       printArray(characterArray);
    }

//    public static void printArray(Integer[] inputArray){ // без generic
//        for (Integer element:inputArray) {
//            System.out.printf("%s ", element);
//
//        }
//        System.out.println();
//    }
//}
    public static <T> void printArray(T[] inputArray){ // <T> объявили обобщение или generic , работает с классами обвертки для примитивных данных, с примитивными данными не работает int - не работает Integer - работает
        for (T element:inputArray) {
            System.out.printf("%s ", element);

        }
        System.out.println();
    }
}
