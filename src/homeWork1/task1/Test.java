package homeWork1.task1;

import homeWork1.task1.testClass.*;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Crocodile crocodile = new Crocodile();
        Salmon salmon = new Salmon();

        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();

        Zoo zoo = new Zoo(eagle, crocodile, dog);
        Zoo zoo2 = new Zoo(sparrow, salmon, cat);

        zoo.feedSwimable();
        zoo.feedBitable();
        zoo.feedFlyable();

        zoo2.feedSwimable();
        zoo2.feedBitable();
        zoo2.feedFlyable();

    }
}
