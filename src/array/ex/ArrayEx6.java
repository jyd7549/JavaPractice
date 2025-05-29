package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber;
        int minNumber;
        System.out.print("입력받을 숫자의 갯수를 입력하세요 : ");

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print(numbers.length + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
        maxNumber = numbers[0];
        minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);
    }
}
