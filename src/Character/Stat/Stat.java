package Character.Stat;

public abstract class Stat {
    public Stat(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increase(){
        value++;
    }

    public void decrease(){
        value--;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    private int value;
}
