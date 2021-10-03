package Learn.project;

import Learn.project.Animals.Animal;
import Learn.project.Animals.Cat;
import Learn.project.Animals.Dog;

public class hello {
    public static void main(String[]args){
       Cat Lucy = new Cat("Люси",2, "black",3);
       Dog Bob = new Dog("Bob","marple",3,2);

       Animal animals[] = {
               Lucy,
               Bob
       };
        for (Animal animal : animals){
            animal.swim(10);
            animal.run(400);
        }

    }

}
