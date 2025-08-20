package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String dimension;
    private boolean isStamped;

    public Stamp (String name, String dimension, boolean postmarked) {
        this.name = name;
        this.dimension = dimension;
        this.isStamped = postmarked;
    }

    public String getName() {
        return name;
    }

    public String getDimension() {
        return dimension;
    }

    public String getPostmarked() {
        if (isStamped) {
            return "Stamped";
        } else  {
            return "Not Stamped";
        }
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimension='" + dimension + '\'' +
                ", postmarked='" + getPostmarked() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name) && Objects.equals(dimension, stamp.dimension) && Objects.equals(isStamped, stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, isStamped);
    }
}
