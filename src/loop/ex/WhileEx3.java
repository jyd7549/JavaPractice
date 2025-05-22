package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            System.out.println("max = " + i);
            sum += i;
            System.out.println(sum);
            i++;
        }
    }
}
