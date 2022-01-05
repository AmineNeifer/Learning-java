package Swared;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List
        ArrayList<Agent> agents = new ArrayList<Agent>();
        agents.add(new Agent("Amine", 25025020));
        agents.add(new Agent("Kais", 50246254));
        agents.add(new Agent("Joe", 20318795));
        agents.add(new Agent("Nidhal", 25025020));
        agents.add(new Agent("Joe", 20318795));
//        System.out.println(agents);
        Collections.sort(agents);
//        System.out.println(agents);
        Collections.sort(agents, new ComparePhone());
        System.out.println(agents);

        // Set
        HashSet<Agent> agentsSet = new HashSet<Agent>();
        agentsSet.addAll(agents);
//        System.out.println(agentsSet);
//        Iterator<Agent> i = agentsSet.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
        // Map
        HashMap<String, Integer> agentsMap= new HashMap<String, Integer>();
        agentsMap.put(agents.get(0).getName(), agents.get(0).getPhone());
        agentsMap.put(agents.get(1).getName(), agents.get(1).getPhone());
        agentsMap.put(agents.get(2).getName(), agents.get(2).getPhone());
        for (Map.Entry entry: agentsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator iterator = agentsMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)iterator.next();
        }
    }
}
