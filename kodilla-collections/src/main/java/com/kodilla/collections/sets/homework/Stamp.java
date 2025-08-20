package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String dimension;
    private String postmarked;

    public Stamp (String name, String dimension, String postmarked) {
        this.name = name;
        this.dimension = dimension;
        this.postmarked = postmarked;
    }

    public String getName() {
        return name;
    }

    public String getDimension() {
        return dimension;
    }

    public String getPostmarked() {
        return postmarked;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimension='" + dimension + '\'' +
                ", postmarked='" + postmarked + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name) && Objects.equals(dimension, stamp.dimension) && Objects.equals(postmarked, stamp.postmarked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, postmarked);
    }
}
