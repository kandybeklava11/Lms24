package Model;

public class Animal {
    private static Long counter = 0L;
    private Long id;
    private String name;
    private int age;

    public Animal(String name, int age) {
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
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
