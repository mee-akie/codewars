package kata.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

public class SentenceSmashTest {

    @Test
    public void smashing() {
        assertEquals("hello world this is a test",
            SentenceSmash.smash(new String[]{"hello", "world", "this", "is", "a", "test"}));
    }
    
    @Test
    public void emptyString() {
        assertEquals("", SentenceSmash.smash(new String[]{}));
    }
}
