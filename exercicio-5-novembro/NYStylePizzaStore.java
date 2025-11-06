public class NYStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
            new NYPizzaIngredientFactory();

        if (item.equals("queijo")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo de Nova York");
        } else if (item.equals("vegetariana")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza Vegetariana no Estilo de Nova York");
        } else if (item.equals("mariscos")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo de Nova York");
        } else if (item.equals("calabresa")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de Calabresa no Estilo de Nova York");
        }
        return pizza;
    }
}



