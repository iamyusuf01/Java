public class CountNum {
    public static void main(String[] args) {
        int n = 123455;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if(rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of 5s in the given number: " + count);
    }
}
