package Day1_Generics;
//MealPlan interface and subtypes
interface MealPlan {
 String getMealType();
}

class VegetarianMeal implements MealPlan {
 public String getMealType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
 public String getMealType() { return "Vegan"; }
}

//Generic meal class
class Meal<T extends MealPlan> {
 private T mealPlan;
 public Meal(T mealPlan) { this.mealPlan = mealPlan; }
 public T getMealPlan() { return mealPlan; }
}

//Generic method to generate meal plans
class MealPlanner {
 public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
     System.out.println("Generating meal plan for: " + plan.getMealType());
     return new Meal<>(plan);
 }
}

//Demo
public class MealDemo {
 public static void main(String[] args) {
     Meal<VegetarianMeal> vegMeal = MealPlanner.generateMealPlan(new VegetarianMeal());
     Meal<VeganMeal> veganMeal = MealPlanner.generateMealPlan(new VeganMeal());
 }
}

