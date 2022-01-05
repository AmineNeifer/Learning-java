package Swared;

import java.util.Comparator;
import java.util.Objects;

public class Agent implements Comparable<Agent> {
    private String name;
    private Integer phone;

    public Agent(String n, Integer p) {
        name = n;
        phone = p;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " " + phone;
    }

    @Override
    public int compareTo(Agent a) {
        return name.compareTo(a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}

        if (o == null || this.getClass() != o.getClass()) { return false;}

        Agent a = (Agent)o;
        return this.getPhone().equals(a.getPhone()) && this.getName().equals(a.getName());
    }
}

