package SortMountains;

import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList <Mountain> mtn = new LinkedList <Mountain>();

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }
    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.height - two.height;
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mtn);

        NameCompare nc = new NameCompare();
        mtn.sort(nc);
        System.out.println("by name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        mtn.sort(hc);
        System.out.println("by height:\n" + mtn);
    }
}
class Mountain {
    String name;
    int height;
    Mountain(String n, int h) {
        height = h;
        name = n;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
