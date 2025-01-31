package _03_new_requirements;

/**
 * Represents the information needed to generate a song of the "99 bottle" form.
 * @param containerSingular The singular form of the container (e.g. "bottle")
 * @param containerPlural The plural form of the item (e.g. "bottles")
 * @param item The item to be placed in the container (e.g. "beer")
 * @param location The location of the item (e.g. "on the wall")
 * @param action The action to take with the item (e.g. "Take one down, pass it around")
 */
public record SongInfo(String containerSingular, String containerPlural, String item, String location, String action) {

    /**
     * Returns the singular/plural form of the item based on the given number of items.
     * @param n The number of items
     * @return The singular/plural form of the item
     */
    public String itemPhrase(int n) {
        if ( n != 0 && n % 24 == 0 ) {
            if ( n == 24 ) {
                return "1 2-4 of " + item;
            } else {
                return (n/24) + "2-4s of " + item;
            }
        } else if ( n != 0 && n % 6 == 0 ) {
            if ( n == 6 ) {
                return "1 6-pack of " + item;
            } else {
                return (n/6) + " 6-packs of " + item;
            }
        } else {
            return n == 1 ? "1 " + containerSingular + " of " + item : n + " " + containerPlural + " of " + item;
        }
    }
}

