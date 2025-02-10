package lesson34.cities;

public class City  implements  Comparable <City>{
    String name;
    int codeCity;


    public City(String name, int codeCity) {
        this.name = name;
        this.codeCity = codeCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(int codeCity) {
        this.codeCity = codeCity;
    }

    @Override
    public int compareTo(City o) {
        return o !=null ? name.compareTo(o.getName()) : 0;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", code: " + codeCity +
                ';';


    }
}

