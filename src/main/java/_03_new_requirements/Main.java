package _03_new_requirements;

public class Main {
     static void main() {

        var popSongInfo = new SongInfo("bottle", "bottles", "pop", "on the wall", "Take one down, pass it around");
        var popSong = DrinkSong.of(9, popSongInfo);

        System.out.println(popSong);
    }
}
