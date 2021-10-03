package Learn.project.Animals;

public class Cat extends Animal {
    int clawLength;
    static int catCount;
    public Cat(String name, int age, String color, int clawLength){
        super(name, color,age);
        this.clawLength = clawLength;
        catCount++;
    }

    public String getName(){
        return this.name;
    }

    public void getInfo(){
        System.out.println("Hello, my name is: " + this.name + " my age is:\t" + this.age);
    }

    public static int getCatCount(){
        return catCount;
    }

    @Override
    public void getVoice() {
        System.out.println("Meooow");
    }

    @Override
    public void run(int let) {
        if (let>200){
            System.out.println("Кот не справится с данным маршрутом");
        }else {
            System.out.println("Кот проюежал\t" + let );
        }
    }
    @Override
    public void swim(int let) {
        System.out.println("Кошка не умеет плавать!");
    }
}
