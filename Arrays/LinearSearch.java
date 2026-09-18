//Linear Search-Find whether a particular element exists.
public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 45, 18};

        int target = 45;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}