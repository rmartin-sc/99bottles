package _03_new_requirements;

/**
 * A class with a static method that generates a song of the "99 bottles" form.
 */
public class DrinkSong {

    /**
     * Generates a song of the "99 bottles" form.
     * @param numVerses The number of verses to generate
     * @param songInfo The information needed to generate the song
     * @return A string containing the entire song
     */
    public static String of(int numVerses, SongInfo songInfo) {
        var song = new StringBuilder();

        for (int i = numVerses; i > 0; i--) {
            song.append(makeVerse(i, songInfo));
        }

        song.append("Go to the store and buy some more, %s %s.\n".formatted(songInfo.itemPhrase(numVerses), songInfo.location()));

        return song.toString();
    }

    /**
     * Generates the nth verse of song of the "99 bottles" form.
     * @param n The verse number to generate
     * @param songInfo The information needed to generate the song
     * @return A string containing the nth verse of the song
     */
    private static String makeVerse(int n, SongInfo songInfo) {

        return ("%s %s, %s.\n" +
                "%s, %s %s.\n").formatted(songInfo.itemPhrase(n), songInfo.location(), songInfo.itemPhrase(n), songInfo.action(), songInfo.itemPhrase(n-1), songInfo.location());
    }

}
