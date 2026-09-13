// 2. Builder: Общий интерфейс с Method Chaining
public interface PizzaBuilder {
    PizzaBuilder setSize(Pizza.Size size);
    PizzaBuilder setDough(Pizza.Dough dough);
    PizzaBuilder addCheese();
    PizzaBuilder addPepperoni();
    Pizza build();
}