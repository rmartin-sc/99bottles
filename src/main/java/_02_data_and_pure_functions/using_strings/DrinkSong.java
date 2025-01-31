package _02_data_and_pure_functions.using_strings;

/**
 * A class with a static method that generates a song of the "99 bottle" form.
 */
public class DrinkSong {

    /**
     * Generates a song of the "99 bottle" form.
     * @param numVerses The number of verses to generate
     * @param itemSingular The singular form of the item (e.g. "bottle")
     * @param itemPlural The plural form of the item (e.g. "bottles")
     * @param location The location of the item (e.g. "on the wall")
     * @param action The action to take with the item (e.g. "Take one down, pass it around")
     * @return A string containing the entire song
     */
    public static String of(int numVerses, String itemSingular, String itemPlural, String location, String action) {
        var song = new StringBuilder();

        for (int i = numVerses; i > 0; i--) {
            song.append(makeVerse(i, itemSingular, itemPlural, location, action));
        }

        song.append("Go to the store and buy some more, %d %s %s.\n".formatted(numVerses, pluralize(numVerses, itemSingular, itemPlural), location));

        return song.toString();
    }

    /**
     * Generates the nth verse of song of the "99 bottle" form.
     * @param n The verse number to generate
     * @param itemSingular The singular form of the item (e.g. "bottle of pop")
     * @param itemPlural The plural form of the item (e.g. "bottles of pop")
     * @param location The location of the item (e.g. "on the wall")
     * @param action The action to take with the item (e.g. "Take one down, pass it around")
     * @return The nth verse of the song
     */
    private static String makeVerse(int n, String itemSingular, String itemPlural, String location, String action) {

        return ("""
                %d %s %s, %d  %s.
                %s, %d %s %s.
                """).formatted(n, pluralize(n, itemSingular, itemPlural), location, n, pluralize(n, itemSingular, itemPlural), action, n - 1, pluralize(n-1, itemSingular, itemPlural), location);
    }

    /**
     * Returns the singular/plural form of the item based on the given number of items.
     * @param n The number of items
     * @param singular The singular form of the item
     * @param plural The plural form of the item
     * @return The singular/plural form of the item depending on the number of items, n
     */
    private static String pluralize(int n, String singular, String plural) {
        return n == 1 ? singular : plural;
    }
}
