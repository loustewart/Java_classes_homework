import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;


    @Before
    public void Before() {
        waterBottle = new WaterBottle(100);
        }

    @Test
    public void volume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void empty() {
        waterBottle.empty();
        assertEquals( 0, waterBottle.getVolume());
    }

    @Test
    public void fill() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
