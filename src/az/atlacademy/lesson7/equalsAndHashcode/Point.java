package az.atlacademy.lesson7.equalsAndHashcode;

import java.util.Objects;

public class Point {
    int id;
    int age;

    public Point(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return id == point.id && age == point.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age);
    }
}
