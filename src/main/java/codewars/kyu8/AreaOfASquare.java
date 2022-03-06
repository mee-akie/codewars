package codewars.kyu8;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * @name Area of a Square
 * @rank 8
 * @id 5748838ce2fab90b86001b1a
 * @url https://www.codewars.com/kata/5748838ce2fab90b86001b1a
 */
public class AreaOfASquare {

    public static double squareArea(double A) {
        double radius = (A * 2) / Math.PI;
        return Double.parseDouble(String.format(Locale.US, "%.2f", radius * radius));
    }
}
