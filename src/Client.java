public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        // Использование директора
        PizzaBuilder margaritaBuilder = new MargaritaBuilder();
        Pizza margarita = waiter.constructClassicMargarita(margaritaBuilder);
        System.out.println("Director built: " + margarita);

        // Использование билдера напрямую (Method Chaining)
        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();
        Pizza pepperoni = pepperoniBuilder.setSize(Pizza.Size.LARGE)
                .setDough(Pizza.Dough.THICK)
                .addCheese()
                .addPepperoni()
                .build();
        System.out.println("Client built: " + pepperoni);
    }
}