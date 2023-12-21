package DesignAFoodRatingSystem;

public class Main {

    public static void main(String[] args) {
        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] ratings = {9, 12, 8, 15, 14, 7};

        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);

//        System.out.println(foodRatings.foodRatings.toString());
        System.out.println(foodRatings.highestRated("korean"));
        System.out.println(foodRatings.highestRated("japanese"));

        foodRatings.changeRating("sushi", 16);
//        System.out.println(foodRatings.foodRatings.toString());
        System.out.println(foodRatings.highestRated("japanese"));

        foodRatings.changeRating("ramen", 16);
//        System.out.println(foodRatings.foodRatings.toString());
        System.out.println(foodRatings.highestRated("japanese"));
    }
}
