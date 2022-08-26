package homeWork1.task1;

public interface Flyable {
    public default void fly(){
        System.out.println("Быстро летит");
    }
}
