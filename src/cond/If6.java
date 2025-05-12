package cond; // 잘못된 코드 예제

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("나이가 10살 이하, 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        price -= discount;

        System.out.println("가격은 " + price + "원 입니다");
    }
}
