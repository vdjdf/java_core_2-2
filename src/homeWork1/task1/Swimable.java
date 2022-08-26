package homeWork1.task1;

public interface Swimable {
    public default void swim() {
        System.out.println(" Плавает");
    }
}
