package Lesson2;

public class LinearSearch implements Practice2Search{

    @Override
    public String searchName() {

        return "linear";
    }

    @Override
    public int search(int[] arr, int target) {

        for(int i=0; i<arr.length; i++){

            if(arr[i] == target)
                return i;
            else
                return -1;

        }
        return 0;
    }
}
