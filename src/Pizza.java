// 1. Product: Класс пиццы, который мы строим
public class Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    public enum Dough { THIN, THICK }

    private final Size size;
    private final Dough dough;
    private final boolean hasCheese;
    private final boolean hasPepperoni;

    // Конструктор доступен только билдерам
    protected Pizza(Size size, Dough dough, boolean hasCheese, boolean hasPepperoni) {
        this.size = size;
        this.dough = dough;
        this.hasCheese = hasCheese;
        this.hasPepperoni = hasPepperoni;
    }

    @Override
    public String toString() {
        return String.format("Pizza [Size=%s, Dough=%s, Cheese=%b, Pepperoni=%b]",
                size, dough, hasCheese, hasPepperoni);
    }
}