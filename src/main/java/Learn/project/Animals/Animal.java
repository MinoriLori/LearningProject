package Learn.project.Animals;

abstract public class Animal {
    String name, color;
    int age;
    private static int count;
    public Animal(String name, String color, int age){
        this.name = name;
        this.age = age;
        this.color = color;
        count++;
    }

    final public static int getCount() {
        return count;
    }

    abstract public void run(int let);

    abstract public void swim(int let);

    abstract public void getVoice();
}
