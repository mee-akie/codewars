package codewars.kyu7;

/**
 * @name Don't give me five!
 * @rank 7
 * @id 5813d19765d81c592200001a
 * @url https://www.codewars.com/kata/5813d19765d81c592200001a
 */
public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        int cont = 0;
        for(int i = start; i <= end; i++) if(! String.valueOf(i).contains("5")) cont++;
        return cont;
    }
}
