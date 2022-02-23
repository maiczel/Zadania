public class Car {
    private String name;
    private int maxSpeed;
    private Color color;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}