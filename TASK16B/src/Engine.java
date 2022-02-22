import java.util.Objects;

public class Engine {
    private int power;
    private int capacity;

    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && capacity == engine.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, capacity);
    }
}
