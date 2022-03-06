package codewars.kyu8;

/**
 * @name Area of a Square
 * @rank 8
 * @id 5748838ce2fab90b86001b1a
 * @url https://www.codewars.com/kata/5748838ce2fab90b86001b1a
 */
public class AreaOfASquare {
    public static double squareArea(double A){
        return Double.parseDouble(String.format("%.2f", Math.pow((A*4) / (2*Math.PI),2)));
    }
}
