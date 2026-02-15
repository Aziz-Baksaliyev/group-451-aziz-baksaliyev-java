package homework_12;

	public class Pizza {
	    public String size;
	    public double price;
	    public String[] ingredients = new String[10];
	    public int ingredientCount = 0;

	    public Pizza(String size) {
	        this.size = size;
	        if (size.equals("маленькая")) {
	            this.price = 300;
	        } else if (size.equals("средняя")) {
	            this.price = 500;
	        } else {
	            this.price = 700;
	        }
	    }

	    public void addIngredient(String ing) {
	        if (ingredientCount < 10) {
	            ingredients[ingredientCount] = ing;
	            ingredientCount = ingredientCount + 1;
	        }
	    }

	    public double calculatePrice() {
	        return this.price + (ingredientCount * 50);
	    }

	    public void showOrder() {
	        System.out.print("Пицца [" + size + "]. Состав: ");
	        for (int i = 0; i < ingredientCount; i++) {
	            System.out.print(ingredients[i] + " ");
	        }
	        System.out.println("Цена: " + calculatePrice());
	    }
	}
