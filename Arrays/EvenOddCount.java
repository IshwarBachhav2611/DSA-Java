//Count Even and Odd Numbers
public class EvenOddCount {
    public static void main(String[] args) {

        int[] arr = {10, 15, 22, 7, 30, 41};

        int even = 0;
        int odd = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}