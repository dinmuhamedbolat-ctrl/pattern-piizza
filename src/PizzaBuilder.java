
public interface PizzaBuilder {
    PizzaBuilder setSize(Pizza.Size size);
    PizzaBuilder setDough(Pizza.Dough dough);
    PizzaBuilder addCheese();
    PizzaBuilder addPepperoni();
    Pizza build();
}