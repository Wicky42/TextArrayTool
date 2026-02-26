import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void containsEmptyStrings_shouldReturnFalse_whenArrayIsFilledWithValidStrings(){
        //GIVEN
        String[] validData = TestData.VALID_STRINGS;
        boolean expected = false;
        //WHEN
        boolean actual = Main.containsEmptyStrings(validData);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void containsEmptyStrings_shouldReturnTrue_whenCalledWithInvalidStrings(){
        assertTrue(Main.containsEmptyStrings(TestData.INVALID_STRINGS));
    }

    @Test
    void countCharsTotal_shouldReturnCorrectly_WhenCalledWithValidData(){
        //GIVEN
        String[] data = TestData.VALID_STRINGS;
        int expetedCount = 25;

        assertEquals(expetedCount, Main.countCharsTotal(data));
    }

}