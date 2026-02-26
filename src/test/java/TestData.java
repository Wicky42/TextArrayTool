public class TestData {

    private TestData() {} // verhindert Instanziierung

    public static final String[] VALID_STRINGS = {
            "ABC123",
            "XYZ789",
            "HELLO",
            "TEST_001"
    };

    public static final String[] INVALID_STRINGS = {
            "",
            " ",
            null,
            "!!!",
            "abc@123"
    };
}
