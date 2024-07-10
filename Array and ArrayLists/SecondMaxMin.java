public class SecondMaxMin {
    public static void main(String[] args) {
        int[] numbers = { 15, 25, 35, 45, 55, 65, 75, 85 };

        secondMaxMin(numbers);
    }

    static void secondMaxMin(int[] arr) {
        int small, secondLarge, secondSmall, large;

        small = secondSmall = Integer.MAX_VALUE;
        large = secondLarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < small) {
                secondSmall = small;
                small = num;
            } else if (num < secondSmall && num != small)
                secondSmall = num;

            if (num > large) {
                secondLarge = large;
                large = num;
            } else if (num > secondLarge && num != large)
                secondLarge = num;
        }

        System.out.println("Second Smallest: " + secondSmall);

        System.out.println("Second Largest: " + secondLarge);

    }

}
