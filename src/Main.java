public class Main {

    public static Automobile[] automobiles = {
            new Automobile("","Granta", 1.7, "желтый", 2015, "Россия"),
            new Automobile("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия"),
            new Automobile("BMW", "", -1, "черный", -5, "Германия"),
            new Automobile("Kia", "Sportage 4-го поколения", -0.5, "красный", 2018, ""),
            new Automobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея")
    };
    public static void main(String[] args) {
        for (Automobile car: automobiles) {
            System.out.println(car);
        }
    }
}