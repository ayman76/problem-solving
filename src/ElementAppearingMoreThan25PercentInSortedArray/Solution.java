package ElementAppearingMoreThan25PercentInSortedArray;

public class Solution {

    public int findSpecialInteger(int[] arr) {
        int targetFrequency = arr.length / 4;

        for(int i = 0; i < arr.length; i++){
            int count = 1;

            while(i < arr.length - 1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }

            if(count > targetFrequency){
                return arr[i];
            }
        }
        return -1;
    }

    public int findSpecialInteger1(int[] arr) {
        int targetFrequency = arr.length / 4;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i + targetFrequency]){
                return arr[i];
            }
        }
        return -1;
    }
}
