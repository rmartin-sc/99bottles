package _01_simple;

public class DrinkSong {

    public static void sing__naive() {
        IO.println("9 bottles of pop on the wall, 9 bottles of pop");
        IO.println("Take one down, pass it around, 8 bottles of pop on the wall");
        IO.println("8 bottles of pop on the wall, 8 bottles of pop");
        IO.println("Take one down, pass it around, 7 bottles of pop on the wall");
        IO.println("7 bottles of pop on the wall, 7 bottles of pop");
        IO.println("Take one down, pass it around, 6 bottles of pop on the wall");
        IO.println("6 bottles of pop on the wall, 6 bottles of pop");
        IO.println("Take one down, pass it around, 5 bottles of pop on the wall");
        IO.println("5 bottles of pop on the wall, 5 bottles of pop");
        IO.println("Take one down, pass it around, 4 bottles of pop on the wall");
        IO.println("4 bottles of pop on the wall, 4 bottles of pop");
        IO.println("Take one down, pass it around, 3 bottles of pop on the wall");
        IO.println("3 bottles of pop on the wall, 3 bottles of pop");
        IO.println("Take one down, pass it around, 2 bottles of pop on the wall");
        IO.println("2 bottles of pop on the wall, 2 bottles of pop");
        IO.println("Take one down, pass it around, 1 bottles of pop on the wall");
        IO.println("1 bottle of pop on the wall, 1 bottle of pop");
        IO.println("Take one down, pass it around, no more bottles of pop on the wall");
        IO.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__aBitBetterButBroken() {

        for (int i = 9; i > 0; i -= 1) {
            IO.println("%d bottles of pop on the wall, %d bottles of pop\n".formatted(i, i));
            IO.println("Take one down, pass it around, %d bottles of pop on the wall\n".formatted(i - 1));
        }

        IO.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__aBitBetterNotBroken() {

        for (int i = 9; i > 0; i--) {
            var s = i == 1 ? "" : "s";
            IO.println("%d bottle%s of pop on the wall, %d bottle%s of pop\n".formatted(i, s, i, s));
            s = i - 1 == 1 ? "" : "s";
            IO.println("Take one down, pass it around, %d bottle%s of pop on the wall\n".formatted(i - 1, s));
        }

        IO.println("Go to the store and buy some more, 9 bottles of pop on the wall.");
    }

    public static void sing__generalized(int n) {

        for (int i = n; i > 0; i--) {
            var s = pluralize(i, "bottle", "bottles");
            IO.println("%d %s of pop on the wall, %d %s of pop\n".formatted(i, s, i, s));
            s = pluralize(i - 1, "bottle", "bottles");
            IO.println("Take one down, pass it around, %d bottle%s of pop on the wall\n".formatted(i - 1, s));
        }

        var s = pluralize(n, "bottle", "bottles");
        IO.println("Go to the store and buy some more, %d %s of pop on the wall.\n".formatted(n, s));
    }

    public static void sing__evenMoreGeneralized(int n, String drinkSingular, String drinkPlural, String location, String action) {
        for (int i = n; i > 0; i--) {
            var drink = pluralize(i, drinkSingular, drinkPlural);
            IO.println("%d %s %s, %d %s\n".formatted(i, drink, location, i, drink));
            drink = pluralize(i - 1, drinkSingular, drinkPlural);
            IO.println("%s, %d %s %s\n".formatted(action, i - 1, drink, location));
        }

        var drink = pluralize(n, drinkSingular, drinkPlural);
        IO.println("Go to the store and buy some more, %d %s %s.\n".formatted(n, drink, location));
    }

    public static void singPopSong(int numVerses) {
        sing__evenMoreGeneralized(numVerses, "bottle of pop", "bottles of pop", "on the wall", "Take one down, pass it around");
    }

    private static String pluralize(int n, String singular, String plural) {
        return n == 1 ? singular : plural;
    }
}
