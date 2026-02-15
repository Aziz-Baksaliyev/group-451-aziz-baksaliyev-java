package homework_12;


public class Order {
    public String customerName;
    public Pizza[] pizzas = new Pizza[10];
    public int pizzaCount = 0;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addPizza(Pizza p) {
        if (pizzaCount < 10) {
            pizzas[pizzaCount] = p;
            pizzaCount = pizzaCount + 1;
        }
    }

    public void printCheck() {
        double total = 0;
        System.out.println("Чек для: " + customerName);
        for (int i = 0; i < pizzaCount; i++) {
            pizzas[i].showOrder();
            total = total + pizzas[i].calculatePrice();
        }
        System.out.println("Итого: " + total);
    }
}
