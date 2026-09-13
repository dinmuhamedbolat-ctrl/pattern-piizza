
public class PepperoniBuilder implements PizzaBuilder {
    private Pizza.Size size;
    private Pizza.Dough dough;
    private boolean hasCheese;
    private boolean hasPepperoni;

    @Override
    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(Pizza.Dough dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addCheese() {
        this.hasCheese = true;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        this.hasPepperoni = true;
        return this;
    }

    @Override
    public Pizza build() {
        if (size == null || dough == null) {
            throw new IllegalStateException("Size and Dough must be specified!");
        }
        return new Pizza(size, dough, hasCheese, hasPepperoni);
    }
}