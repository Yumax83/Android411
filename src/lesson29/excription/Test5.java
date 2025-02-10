package lesson29.excription;
public class Test5 {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (NewException e){
           System.out.println("Перехваченное исключение. " + e);
        }
    }

    public static void compute(int a) throws NewException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10){
            throw new NewException(a, "Некорректное значение");
        }
        System.out.println("Нормальное значение");
    }
}

class NewException extends Exception {
    private int detail;

    public NewException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "NewException{" +
                "detail=" + detail +
                ", message=" + getMessage() +
                "}";
    }
}
