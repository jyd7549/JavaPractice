package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("나이가 10살 이하, 1000원 할인");
        }

        price -= discount;

        System.out.println("가격은 " + price + "원 입니다");
    }
}
