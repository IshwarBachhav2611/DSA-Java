//Count Frequency of an Element
public class FrequentElements {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40};

        int target = 10;
        int count = 0;

        for (int num : arr) {

            if (num == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);
    }
}