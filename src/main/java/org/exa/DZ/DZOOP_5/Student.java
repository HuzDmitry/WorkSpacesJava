package org.exa.DZ.DZOOP_5;

import java.util.Objects;
import java.util.UUID;

public class Student {
    private final String Name;
    private final UUID Id;

    public Student(String name) {
        Name = name;
        Id = UUID.randomUUID();
    }

    public String getName() {
        return Name;
    }

    public UUID getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + Name + '\'' +
                ", Id=" + Id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Name, student.Name) && Objects.equals(Id, student.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Id);
    }
}
