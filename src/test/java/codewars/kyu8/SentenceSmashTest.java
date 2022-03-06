package codewars.kyu8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @name Sentence Smash
 * @rank 8
 * @id 53dc23c68a0c93699800041d
 * @url https://www.codewars.com/kata/53dc23c68a0c93699800041d
 */
public class SentenceSmashTest {
    
    @Test
    public void testEmptyString() {
        assertEquals("", SentenceSmash.smash(new String[]{}));
    }

    @Test
    public void testSimpleString() {
        assertEquals("hello world", SentenceSmash.smash(new String[]{"hello", "world"}));
    }
}
