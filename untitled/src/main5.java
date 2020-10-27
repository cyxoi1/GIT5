public class main5 {
    public static void main(String[] args) {

        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum Value = " + c);


    }

    private static int minFunction(int a, int b) {
        int min;
        if (a > b)
            min = b;
        else
            min = a;

        return min;

    }


}
