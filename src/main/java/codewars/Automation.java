package codewars;

public class Automation {
    
    public static void main(String[] args) {
        String kataId = args[0];
        new KataGenerator(kataId).generate();
    }
}
