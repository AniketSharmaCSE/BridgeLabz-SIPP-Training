package mealplangenerator;

public class Main {
    public static void main(String[] args) {
        // Create meal plans
        VegMeal vegMeal = new VegMeal("Paneer curry with rice");
        VeganMeal veganMeal = new VeganMeal("Tofu salad with quinoa");
        KetoMeal ketoMeal = new KetoMeal("Chicken with avocado and leafy greens");
        HighProtein proteinMeal = new HighProtein("Egg white omelette with spinach");

        // Generate personalized meal plans using generic method
        Meal<VegMeal> myVegMeal = generateMealPlan(vegMeal);
        Meal<VeganMeal> myVeganMeal = generateMealPlan(veganMeal);
        Meal<KetoMeal> myKetoMeal = generateMealPlan(ketoMeal);
        Meal<HighProtein> myProteinMeal = generateMealPlan(proteinMeal);

        // Print results if generated successfully
        if (myVegMeal != null) System.out.println(myVegMeal);
        if (myVeganMeal != null) System.out.println(myVeganMeal);
        if (myKetoMeal != null) System.out.println(myKetoMeal);
        if (myProteinMeal != null) System.out.println(myProteinMeal);
    }

    // Place the generateMealPlan method here as above
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        if (mealPlan.getMealDescription() == null || mealPlan.getMealDescription().isEmpty()) {
            System.out.println("Invalid meal plan: description missing.");
            return null;
        }
        return new Meal<>(mealPlan);
    }
}
