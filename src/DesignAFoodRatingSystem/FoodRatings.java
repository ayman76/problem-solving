package DesignAFoodRatingSystem;

import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

class FoodRating {
    private String food;
    private String cuisine;
    private int rating;

    public FoodRating(String food, String cuisine, int rating) {
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
        return "FoodRating{" +
                "food='" + food + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", rating=" + rating +
                '}';
    }
}


public class FoodRatings {

    Hashtable<String, FoodRating> foodRatings = new Hashtable<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        addFoodRatings(foods, cuisines, ratings);
    }

    public void changeRating(String food, int newRating) {
        if(foodRatings.containsKey(food)){
            FoodRating foundedFoodRating = foodRatings.get(food);
            foundedFoodRating.setRating(newRating);
            foodRatings.put(food, foundedFoodRating);
        }


    }

    public String highestRated(String cuisine) {
        Hashtable<String, Integer> cuisineFoodRatings = new Hashtable<>();
        for (FoodRating foodRating: foodRatings.values()){
            if(foodRating.getCuisine().equals(cuisine)){
                cuisineFoodRatings.put(foodRating.getFood(), foodRating.getRating());
            }
        }
        String highestRatedFood = Collections.max(cuisineFoodRatings.entrySet(),
                Comparator.<Map.Entry<String, Integer>, Integer>comparing(Map.Entry::getValue)
                        .thenComparing(Map.Entry::getKey)).getKey();
        return highestRatedFood;
    }

    private void addFoodRatings(String[] foods, String[] cuisines, int[] ratings){
        for (int i = 0; i < foods.length; i++){
            foodRatings.put(foods[i], new FoodRating(foods[i], cuisines[i], ratings[i]));
        }
    }
}
