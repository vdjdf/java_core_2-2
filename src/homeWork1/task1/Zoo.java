package homeWork1.task1;

public class Zoo<T extends Flyable, V extends Swimable, E extends Bitable> {

    private T flyingPet;
    private V swimbalePet;
    private E bitablePet;

    public Zoo(T flyingPet, V swimbalePet, E bitablePet) {
        this.flyingPet = flyingPet;
        this.swimbalePet = swimbalePet;
        this.bitablePet = bitablePet;
    }

    public T getFlyingPet() {
        return flyingPet;
    }

    public void setFlyingPet(T flyingPet) {
        this.flyingPet = flyingPet;
    }

    public V getSwimbalePet() {
        return swimbalePet;
    }

    public void setSwimbalePet(V swimbalePet) {
        this.swimbalePet = swimbalePet;
    }

    public E getBitablePet() {
        return bitablePet;
    }

    public void setBitablePet(E bitablePet) {
        this.bitablePet = bitablePet;
    }


    public void feedSwimable() {
        System.out.println("в зоопарке ");
        swimbalePet.swim();
    }

    public void feedBitable() {
        System.out.println("в зоопарке  ");
        bitablePet.bite();
    }

    public void feedFlyable() {
        System.out.println("в зоопарке ");
        flyingPet.fly();
    }
}
