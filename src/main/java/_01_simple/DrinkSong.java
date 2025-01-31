package _01_simple;

public class DrinkSong {

    public static void sing__naive() {
        System.out.println("9 bottles of pop on the wall, 9 bottles of pop");
        System.out.println("Take one down, pass it around, 8 bottles of pop on the wall");
        System.out.println("8 bottles of pop on the wall, 8 bottles of pop");
        System.out.println("Take one down, pass it around, 7 bottles of pop on the wall");
        System.out.println("7 bottles of pop on the wall, 7 bottles of pop");
        System.out.println("Take one down, pass it around, 6 bottles of pop on the wall");
        System.out.println("6 bottles of pop on the wall, 6 bottles of pop");
        System.out.println("Take one down, pass it around, 5 bottles of pop on the wall");
        System.out.println("5 bottles of pop on the wall, 5 bottles of pop");
        System.out.println("Take one down, pass it around, 4 bottles of pop on the wall");
        System.out.println("4 bottles of pop on the wall, 4 bottles of pop");
        System.out.println("Take one down, pass it around, 3 bottles of pop on the wall");
        System.out.println("3 bottles of pop on the wall, 3 bottles of pop");
        System.out.println("Take one down, pass it around, 2 bottles of pop on the wall");
        System.out.println("2 bottles of pop on the wall, 2 bottles of pop");
        System.out.println("Take one down, pass it around, 1 bottles of pop on the wall");
        System.out.println("1 bottle of pop on the wall, 1 bottle of pop");
        System.out.println("Take one down, pass it around, no more bottles of pop on the wall");
        System.out.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__aBitBetterButBroken() {

        for (int i = 9; i > 0; i -= 1) {
            System.out.printf("%d bottles of pop on the wall, %d bottles of pop\n", i, i);
            System.out.printf("Take one down, pass it around, %d bottles of pop on the wall\n", i - 1);
        }

        System.out.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__aBitBetterNotBroken() {

        for (int i = 9; i > 0; i--) {
            var s = i == 1 ? "" : "s";
            System.out.printf("%d bottle%s of pop on the wall, %d bottle%s of pop\n", i, s, i, s);
            s = i - 1 == 1 ? "" : "s";
            System.out.printf("Take one down, pass it around, %d bottle%s of pop on the wall\n", i - 1, s);
        }

        System.out.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__generalized(int n) {

        for (int i = n; i > 0; i--) {
            var s = pluralize(i, "bottle", "bottles");
            System.out.printf("%d %s of pop on the wall, %d %s of pop\n", i, s, i, s);
            s = pluralize(i - 1, "bottle", "bottles");
            System.out.printf("Take one down, pass it around, %d bottle%s of pop on the wall\n", i - 1, s);
        }

        var s = pluralize(n, "bottle", "bottles");
        System.out.printf("Go to the store and buy some more, %d %s of pop on the wall.\n", n, s);
    }

    public static void sing__evenMoreGeneralized(int n, String drinkSingular, String drinkPlural, String location, String action) {
        for (int i = n; i > 0; i--) {
            var drink = pluralize(i, drinkSingular, drinkPlural);
            System.out.printf("%d %s %s, %d %s\n", i, drink, location, i, drink);
            drink = pluralize(i - 1, drinkSingular, drinkPlural);
            System.out.printf("%s, %d %s %s\n", action, i - 1, drink, location);
        }

        var drink = pluralize(n, drinkSingular, drinkPlural);
        System.out.printf("Go to the store and buy some more, %d %s %s.\n", n, drink, location);
    }

    public static void singBeerSong(int numVerses) {
        sing__evenMoreGeneralized(numVerses, "bottle of beer", "bottles of beer", "on the wall", "Take one down, pass it around");
    }

    private static String pluralize(int n, String singular, String plural) {
        return n == 1 ? singular : plural;
    }
}
