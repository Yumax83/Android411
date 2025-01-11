package lesson27.DZ27;

public class Transport {
    enum Speeds {
        CAR("Автомобиль", 65),
        TRUCK("Грузовик", 55),
        AIRPLANE("Самолет", 600),
        TRAIN("Поезд", 70),
        BOAT("Катер", 22);
        String name;
        int v;

        Speeds(String name, int v) {
            this.name = name;
            this.v = v;
        }

        @Override
        public String toString() {
            return name + ": типичная скорость составляет " + v + " миль в час.";
        }
    }

    public static void main(String[] args) {
        System.out.println("Скорости транспортных средств:");
        for (Speeds s : Speeds.values()) {
            System.out.println(s);
        }
    }
}
