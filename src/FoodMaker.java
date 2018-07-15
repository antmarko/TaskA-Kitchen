import java.util.List;

//controller for creating food using polymorphism (in our case we want to create salad)
public class FoodMaker {
	String vessel;
	Kitchen kitchen; 
	List<Tool> tools;
	List<Ingredient> ingredients;
	public FoodMaker(String vessel, Kitchen kitchen, List<Tool> tools, List<Ingredient> ingredients) {
		super();
		this.vessel = vessel;
		this.kitchen = kitchen;
		this.tools = tools;
		this.ingredients = ingredients;
	}
	
	public void createFood() {
		//combine fields to create salad
	}
	

	
	
}
