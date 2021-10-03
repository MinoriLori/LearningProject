package Learn.project.Animals;

public class Dog extends Animal{
    int fangLength;
    private static int dogCount;
    public Dog(String name, String color, int age, int fangsLenght){
        super(name, color, age);
        this.fangLength = fangsLenght;
        dogCount++;
    }

    @Override
    public void run(int let) {
        if (let > 500){
            System.out.println(this.name + "\tне может столько бежать!");
        }else {
            System.out.println(this.name +" пробежал " + let+" метров!");
        }
    }

    @Override
    public void swim(int let) {
        if (let > 10){
            System.out.println(this.name + "\t не может столько плыть!");
        }else {
            System.out.println(this.name + "\t проплыл " +let +"\tметров");
        }
    }

    @Override
    public void getVoice() {
        System.out.println("brr");
    }

    public static int getDogCount(){
        return dogCount;
    }

    public void bark(){
        System.out.println("Whoof whoof");
    }
}
