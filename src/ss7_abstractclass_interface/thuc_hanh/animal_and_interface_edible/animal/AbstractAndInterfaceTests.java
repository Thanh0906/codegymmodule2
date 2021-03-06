package ss7_abstractclass_interface.thuc_hanh.animal_and_interface_edible.animal;

import ss7_abstractclass_interface.thuc_hanh.animal_and_interface_edible.fruit.Apple;
import ss7_abstractclass_interface.thuc_hanh.animal_and_interface_edible.fruit.Fruit;
import ss7_abstractclass_interface.thuc_hanh.animal_and_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Chicken edibler = (Chicken) animal;
                System.out.println(((Chicken) edibler).howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
