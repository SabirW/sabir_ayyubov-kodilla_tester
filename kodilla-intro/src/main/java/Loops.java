public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int i = names.length;

        for (int j = 0; j < i; j++) {
            System.out.println(names[j]);

        }

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int q = numbers.length;
        int sum = 0;

        for (int j = 0; j < q; j++) {
            sum = sum + numbers[j];

        }
        System.out.println(sum);

        int u = 0;
        while (u <= 10) {
            System.out.println(u);
            u++;
        }


    }
}