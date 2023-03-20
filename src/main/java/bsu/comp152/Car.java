package bsu.comp152;

public class Car {

    private String makeModel;
    private int year;
    private int speed;

    // How could we do practice with throwing exceptions?

    public Car(String mk, int yr){
        makeModel = mk;
        if (yr < 1900){
            throw new IllegalArgumentException("Year must be later than 1900.");
        }
        year = yr;
        speed = 0;
    }

    public String getMakeModel(){
        return makeModel;
    }

    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }

    public void accelerate(){
        speed = speed + 5;
    }

    public void brake(){
        speed = speed - 5;
    }

    @Override
    public String toString() {
        return year + " " + makeModel;
    }

    public boolean equals(Car other){
        return makeModel.equals(other.makeModel) && year == other.year;
    }

    public boolean isSpeeding(int limit){
        return speed > limit;
    }

    public boolean isFaster(Car other){
        return speed > other.speed;
    }

    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
}
