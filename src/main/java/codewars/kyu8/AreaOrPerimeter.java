package codewars.kyu8;

/**
 * @name Area or Perimeter
 * @rank 8
 * @id 5ab6538b379d20ad880000ab
 * @url https://www.codewars.com/kata/5ab6538b379d20ad880000ab
 */
public class AreaOrPerimeter {

    public static int areaOrPerimeter(int l, int w) {
        return (l == w) ? l*w : 2*l + 2*w;
    }
}
