package Jukebox;

import java.util.*;

public class Jukebox {

    public static void main(String[] args) {

        ArrayList<Song> songList = new ArrayList<Song>();

        songList.add(new Song("Dream on", 102));
        songList.add(new Song("Californication", 97));
        songList.add(new Song("Sweet Child o mine",100));
        songList.add(new Song("Californication", 97));


        System.out.println(new Song("kais", 22) == new Song("kais", 22) );
        //        System.out.println(songList);
//
//        HashSet<Song> songSet = new HashSet<Song>();
//        songSet.addAll(songList);
//        System.out.println(songSet);



//        for (String s: songList) {
//            System.out.println(s);
//        }
//
//        Iterator<String> i = songList.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
    }

}

class Song implements Comparable<Song>{
    String name;
    Integer bpm;

    Song (String n, Integer b) {
        name = n;
        bpm = b;
    }

//    @Override
//    public String toString() {
//        return name + " " + bpm;
//    }

    @Override
    public int compareTo(Song s) {
        return this.name.compareTo(s.name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;


        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(bpm, song.bpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bpm);
    }
}