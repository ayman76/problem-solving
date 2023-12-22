package DesignAFoodRatingSystem;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

class FoodInfo {
    private String food;
    private String cuisine;
    private int rating;

    public FoodInfo(String food, String cuisine, int rating) {
        this.food = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FoodInfo{" +
                "food='" + food + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", rating=" + rating +
                '}';
    }
}


public class FoodRatings {

    Map<String, FoodInfo> foodInfo = new HashMap<>();
    Map<String, TreeSet<FoodInfo>> foodRatings = new Hashtable<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        addFoodRatings(foods, cuisines, ratings);
    }

    public void changeRating(String food, int newRating) {
        FoodInfo foodRating = foodInfo.get(food);
        TreeSet<FoodInfo> foundedFoodRating = foodRatings.get(foodRating.getCuisine());
        foundedFoodRating.remove(foodRating);
        foodRating.setRating(newRating);
        foundedFoodRating.add(foodRating);
    }

    public String highestRated(String cuisine) {
        return foodRatings.get(cuisine).first().getFood();
    }

    private void addFoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {

            FoodInfo foodRating = new FoodInfo(foods[i], cuisines[i], ratings[i]);
            foodRatings.putIfAbsent(cuisines[i], new TreeSet<>((a, b) -> {
                if (a.getRating() == b.getRating()) return a.getFood().compareTo(b.getFood());
                return Integer.compare(b.getRating(), a.getRating());
            }));

            foodRatings.get(cuisines[i]).add(foodRating);

            foodInfo.put(foods[i], foodRating);
        }
    }
}
