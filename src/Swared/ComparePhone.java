package Swared;

import java.util.Comparator;

public class ComparePhone implements Comparator<Agent> {
    public int compare(Agent a1, Agent a2) {
        return a1.getPhone().compareTo(a2.getPhone());
    }
}
