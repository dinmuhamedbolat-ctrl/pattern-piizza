
public class Waiter {
    public Pizza constructClassicMargarita(PizzaBuilder builder) {
        return builder.setSize(Pizza.Size.MEDIUM)
                .setDough(Pizza.Dough.THIN)
                .addCheese()
                .build();
    }
}