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

}