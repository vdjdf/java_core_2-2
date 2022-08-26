package homeWork1.task1;

public interface Bitable {
    public default void bite(){
        System.out.println( "Укус ");
    }
}
