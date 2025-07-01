

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlayerCharacterTest {
    @BeforeEach
    public void intitial1(){
         PlayerCharacter pc = new  PlayerCharacter();
         PlayerCharacter.intitial();
    }

    @Test
    void     testInitialXIsZero() {
         PlayerCharacter pc = new  PlayerCharacter();
        assertEquals(0, pc.getX(), "Initial X coordinate should be 0");
    }
    @Test
    void testInitialYIsZero() {
         PlayerCharacter pc = new  PlayerCharacter();
        assertEquals(0, pc.getY(), "Initial Y coordinate should be 0");
    }

    @Test
    void testMoveWIncreasesYByOne() {
         PlayerCharacter pc = new  PlayerCharacter();
        // PlayerCharacter.intitial();
        int[] newPosition = pc.move("W");
        assertArrayEquals(new int[]{0, 1}, newPosition, "Moving 'W' should increase Y by 1");
    }
    @Test
    void testMoveWIncreasesXByOne() {
         PlayerCharacter pc = new  PlayerCharacter();
        //  PlayerCharacter.intitial();
        int[] newPosition = pc.move("D");
        assertArrayEquals(new int[]{1, 0}, newPosition, "Moving 'D' should increase X by 1");
    }
    @Test
    void testSequenceSDA() {
         PlayerCharacter pc = new  PlayerCharacter();
        int[] s = pc.move("S");// [0, -1]
        int[] pos1 = pc.move("D"); // [1, -1]
        assertArrayEquals(new int[]{1, -1}, pos1, "After 'S' then 'D', position should be [1, -1]");
        int[] pos2 = pc.move("A"); // [0, -1]
        assertArrayEquals(new int[]{0, -1}, pos2, "After 'S', 'D', 'A', position should be [0, -1]");
    }
}