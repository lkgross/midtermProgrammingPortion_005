package bsu.comp152;

import org.junit.jupiter.api.Test;

public class CarTest {

    Car car1 = new Car("Toyota Prius", 2010);

    Car car2 = new Car("Honda Civic", 1997);

    @Test
    void testGetMakeModel(){
        assert(car1.getMakeModel().equals("Toyota Prius"));
    }

    @Test
    void testGetYear(){
        assert(car1.getYear()==2010);
    }

    @Test
    void testGetSpeed(){
        assert(car1.getSpeed()==0);
    }

    @Test
    void testAccelerateAddsFive(){
        car1.accelerate();
        assert(car1.getSpeed()==5);
    }

    @Test
    void testToStringReturnsRightFormat(){
        assert(car1.toString().equals("2010 Toyota Prius"));
    }

}
