package ss7_abstractclass_interface.thuchanh.animal_and_interface_edible.animal;

import ss7_abstractclass_interface.thuchanh.animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound () {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat () {
        return "could be fried";
    }
}
