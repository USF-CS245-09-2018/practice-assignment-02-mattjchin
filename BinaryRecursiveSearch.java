package Lesson2;

public class BinaryRecursiveSearch implements Practice2Search {

    @Override
    public String searchName() {
        return "binary-recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        return binrsearch(arr, target,0, arr.length);
    }

    private int binrsearch(int[] arr, int target, int lower, int upper) {

        int mid = (upper+lower)/2;

        if (lower > upper)
            return -1;
        if(arr[mid] == target)
            return mid;
        else if (arr[mid] < target) {
            lower = mid + 1;
            return binrsearch(arr, target, lower, mid-1);
        }
        else if(arr[mid] > target){
            upper = mid - 1;
            return binrsearch(arr, target, lower+1, upper);
        }
        else
            return 0;
    }
}
