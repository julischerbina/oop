import transport.Automobile;

public class Main {
    public static void main(String[] args) {
        Automobile.Key universalKey = new Automobile.Key(true, true);
        Automobile lada = new Automobile("", "Granta", 1.7, "желтый", 2015, "Россия",
                "механическая", "седан", "ф555фф88", 4,
                2, new Automobile.Key(true, false));
        Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 3, "черный",
                2020, "Германия", "автомат", "седан", "г564гг85", 5,
                6, universalKey);
        Automobile bmw = new Automobile("BMW", "", -1, "черный", -5, "Германия", "автомат",
                "седан", "в555вв65", 5, 5, universalKey);
        Automobile kia = new Automobile("Kia", "Sportage 4-го поколения", -0.5, "красный", 2018, "",
                "механическая", "седан", "а555аа55", 4, 2, universalKey);
        Automobile hyundai = new Automobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "механическая", "седан", "в555вв65", 5, 5, universalKey);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}