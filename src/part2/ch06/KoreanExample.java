package part2.ch06;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-1234567");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println();

        Korean k2 = new Korean("양유림", "000601-1234567");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
        System.out.println();
    }
}
