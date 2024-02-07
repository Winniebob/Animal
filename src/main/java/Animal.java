abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract void makeSound();

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }

}
