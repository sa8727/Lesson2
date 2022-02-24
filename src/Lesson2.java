public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(First(10, 15));
        Second(-5);
        System.out.println(Third(-5));
        Fourth("привет бандиты", 6);
    }

    public static boolean First(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static int Second(int c) {
        if (c >= 0) {
            System.out.println("Число " + c + " положительное");
        } else {
            System.out.println("Число " + c + " отрицательное");
        }
        return c;
    }

    public static boolean Third(int d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Fourth(String s, int f) {
        while (f > 0) {
            f -= 1;
            System.out.println(s);
        }
    }
}