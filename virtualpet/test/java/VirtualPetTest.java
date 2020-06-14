
import com.wcci.VirtualPet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("Horace the Hippo", 5, 5, 5, 5, 5, 5, 5, 5);
    public int check;

    @Test
    public void shouldReturnName() {
        String check = underTest.getName();
        assertEquals(check, "Horace the Hippo");
    }

    @Test
    public void shouldReturnHunger() {
        int check = underTest.getHunger();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnThirst() {
        int check = underTest.getThirst();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnBoredom() {
        int check = underTest.getBoredom();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnTiredness() {
        int check = underTest.getTired();
        assertEquals(check, 5);
    }

    @Test
    public void shouldReturnPetFed() {
       int check = underTest.feedPet();
        assertEquals(check, 5);
    }

    @Test
    public void shouldRetunPetPayedWith() {
        int check = underTest.playWithPet();
        assertEquals(check, 5);
    }

    @Test
    public void shouldRetunPetRested() {
        int check = underTest.restPet();
        assertEquals(check, 5);
    }
    @Test
    public void shouldRetunPetWatered() {
        int check = underTest.waterPet();
        assertEquals(check, 5);
    }
    @Test
    public void shouldRetunPetBoredom() {
        int check = underTest.boredom();
        assertEquals(check, 9);
    }
}