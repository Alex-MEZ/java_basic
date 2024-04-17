class NumberUtility {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int x = 15;
        int y = 3;

        System.out.println("Сумма чисел " + x + " и " + y + " равна: "+ sum(x, y));
        System.out.println("Разность чисел " + x + " и " + y + " равна: " + difference(x, y));
        System.out.println("Произведение чисел " + x + " и " + y + " равно: " + product(x, y));
    }
}
