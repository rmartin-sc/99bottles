package _01_simple;

public class Main {


    public static void main(String[] args) {

        // DrinkSong.sing__naive();

        //singSong_evenMoreGeneralized(9, "bottle of beer", "bottles of beer", "on the wall", "Take one down, pass it around");
        DrinkSong.singBeerSong(99);
        DrinkSong.sing__evenMoreGeneralized(9, "whisky flask", "whisky flasks", "in my coat", "Take one out, slosh it about");
        DrinkSong.sing__evenMoreGeneralized(9, "stein of mead", "steins of mead", "on the bar", "Tip one back and down the hatch");

    }
}
