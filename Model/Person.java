package Model;

public class Person {
    private static Long counter = 0L;
    private Long id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = ++counter;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
