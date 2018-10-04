public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public void setSpeed(String speed) {
        switch (speed) {
            case "SLOW":
                this.speed = SLOW;
                break;
            case "MEDIUM":
                this.speed = MEDIUM;
                break;
            case "FAST":
                this.speed = FAST;
                break;
        }
    }

    public String getSpeed() {
        if (this.speed == SLOW) {
            return "SLOW";
        } else if (this.speed == MEDIUM) {
            return "MEDIUM";
        } else if (this.speed == FAST) {
            return "FAST";
        } else {
            return "";
        }

    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        String status = this.isOn() ? "on" : "off";
        return "This fan is " + this.color + " with radius " + this.radius + ". The fan speed is " + this.getSpeed() + " and is " + status;
    }
}
