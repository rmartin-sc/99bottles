package _02_data_and_pure_functions;

import _02_data_and_pure_functions.using_record.SongInfo;

public class Main {

     static void main() {
        var song = _02_data_and_pure_functions.using_strings.DrinkSong.of(9, "bottle of pop", "bottles of pop", "on the wall", "Take one down, pass it around");
        IO.println(song);

        var info = new SongInfo("bottle of pop", "bottles of pop", "on the wall", "Take one down, pass it around");
        song = _02_data_and_pure_functions.using_record.DrinkSong.of(9, info);
        IO.println(song);
    }
}
