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

    public void increase(int boost){
        value+=boost;
    }

    public void decrease(int boost){
        value-=boost;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    private int value;
}
