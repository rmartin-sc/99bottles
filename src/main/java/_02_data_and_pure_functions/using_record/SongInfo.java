package _02_data_and_pure_functions.using_record;

/**
 * Represents the information needed to generate a song of the "99 bottles" form.
 * @param itemSingular The singular form of the item (e.g. "bottle of pop")
 * @param itemPlural The plural form of the item (e.g. "bottles of pop")
 * @param location The location of the item (e.g. "on the wall")
 * @param action The action to take with the item (e.g. "Take one down, pass it around")
 */
public record SongInfo(String itemSingular, String itemPlural, String location, String action) {

    /**
     * Returns the singular/plural form of the item based on the given number of items.
     * @param n The number of items
     * @return The singular/plural form of the item
     */
    public String item(int n) {
        return n == 1 ? itemSingular() : itemPlural();
    }
}
