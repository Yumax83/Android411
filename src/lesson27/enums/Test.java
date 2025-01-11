package lesson26.enums;

public class Test {
    enum Length {
        KM("Километр", 1000),
        M("Метр", 1),
        DM("Дециметр", 0.1),
        СM("Сантиметр", 0.01),
        MM("Миллиметр", 0.001);

        String name;
        double d;

        Length(String name, double d) {
            this.name = name;
            this.d = d;
        }

        @Override
        public String toString() {
            return name;
        }

        double coefficient(Length inp) {
            return d / inp.d;
        }
    }


    public static void main(String[] args) {
        //System.out.println((double) 0.01/0.1);
        // System.out.println(Length.KM);
        for (Length l1 : Length.values()) {
            for (Length l2 : Length.values()) {
                if (l1!=l2)
                System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " + l2);
            }
            System.out.println();
        }

    }
}
