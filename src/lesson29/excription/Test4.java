package lesson29.excription;
public class Test4 {
    public static void main(String[] args) {
        try {
            ex();
        } catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Текст ниже");
    }

    public static void ex() throws RuntimeException{
        throw new RuntimeException("Hello Exception!!!");
    }
}
