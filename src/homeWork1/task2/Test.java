package homeWork1.task2;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        MyList<Object> myList = new MyList();
        myList.add(obj);
        myList.add(obj);
        myList.infoMyList();
        myList.add(obj);
        myList.add(obj);

        myList.infoMyList();


    }
}
