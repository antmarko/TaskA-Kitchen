import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//create new kitchen
		Kitchen kitchen = Kitchen.getInstance();
		//assign attribute values for kitchen
		List<Counter> counters= new ArrayList<Counter>();
		counters.add(new Counter());
		kitchen.setCounters(counters);
		//create list of needed tools
		Tool knive = new VegetableTool(ToolType.MANUAL, "Knive");
		List<Tool> tools = new ArrayList<Tool>();
		tools.add(knive);
		//create list of needed ingredients
		Ingredient cucumber = new VegetableIngredient("Cucumber");
		Ingredient tomato = new VegetableIngredient("Tomato");
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		ingredients.add(cucumber);
		ingredients.add(tomato);
		//create salad
		FoodMaker saladMaker = new FoodMaker("Dish", kitchen, tools, ingredients);
		saladMaker.createFood();

	}

}
