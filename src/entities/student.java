package entities;

public class student {
    private int id;
    private String name;
    private int age;

    public student(){
    }
    public student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
