package codewars.kyu8;

/**
 * @name Double Char
 * @rank 8
 * @id 56b1f01c247c01db92000076
 * @url https://www.codewars.com/kata/56b1f01c247c01db92000076
 */
public class DoubleChar {
    
    public static String doubleChar(String s) {
        char[] result = new char[s.length() * 2];
        for(int i = 0, j = 0; i < s.length(); i++, j+=2) {
            result[j] = s.charAt(i);
            result[j+1] = s.charAt(i);
        }
        return new String(result);
    }
}
