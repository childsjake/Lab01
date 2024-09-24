import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SafeInputObjTest {
    String p1;
    @BeforeEach
    void setUp() {
    Scanner pipe = new Scanner(System.in);
    String p1 = "Hello World";
    }

    @Test
    void getNonZeroLenString() {
        assertEquals("", SafeInputObj.getNonZeroLenString());
    }

    @Test
    void getRangedInt() {
    }

    @Test
    void getInt() {
    }

    @Test
    void getRangedDouble() {
    }

    @Test
    void getDouble() {
    }

    @Test
    void getYNConfirm() {
    }

    @Test
    void getRegExString() {
    }
}