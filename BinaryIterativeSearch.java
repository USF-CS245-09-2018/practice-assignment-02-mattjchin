package Lesson2;

public class BinaryIterativeSearch implements Practice2Search {

    @Override
    public String searchName(){
        return "binary-iterative";
    }

    @Override
    public int search(int[] arr, int target) {

        int middle = (arr.length - 1) / 2;
        int lower = 0;
        int upper = arr.length - 1;


        for(int i=0; i<arr.length; i++){

            if(arr[middle] == target)
                return middle;
            else if (middle < target)
                lower += 1;
            else if(middle > target)
                upper -= 1;
            else
                return -1;

        }
        return 0;
    }
}
