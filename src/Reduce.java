public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int n = 0;
        while (i != 0) {
            boolean iseven = i % 2 == 0;
            if (iseven) {
                i = i / 2;
            } else {
                i--;
            }
            n++;
        }
        System.out.println(n);
    }
}
