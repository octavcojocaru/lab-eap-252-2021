package externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher implements Externalizable { // Externalizable ne lasa sa avem mai mult control asupra serializarii si deserializarii

    private String name; // transient nu are efect daca folosim Externalizable si il serializam manual
    private String course;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name); // alegem ce fielduri sa fie serializate si in ce ordine
        out.writeUTF(course);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF(); // la deserializare trebuie sa respectam ordinea scrierii properietatilor
        course = in.readUTF();
        age = in.readInt();
    }
}
