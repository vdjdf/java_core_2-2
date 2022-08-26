package homeWork1.task2;

public class MyList<T> {

    private T[] objects;
    private int size;

    public MyList() {
        this.size = 0;
        this.objects = (T[]) new Object[3];
    }

    public boolean add(T object) {
        if (objects.length == size) {
            T[] newObjects = (T[]) new Object[objects.length * 2];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
        }
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = object;
                size++;
                return true;
            }
        }
        return false;
    }

    public void infoMyList() {

        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " , ");
        }
        System.out.println("\n");

    }
}