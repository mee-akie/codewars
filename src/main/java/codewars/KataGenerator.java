package codewars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

import codewars.CodewarsApi.ApiType;

public class KataGenerator {

    private String kataId;

    private Map<String, String> apiResult;
    
    public KataGenerator(String kataId) {
        this.kataId = kataId;
        this.apiResult =  new CodewarsApi(ApiType.GET_CODE_CHALLENGE, kataId).getResult();
    }

    public void generate() {
        generateKata();
        generateTest();
        updateReadme();
    }

    private void generateKata() {
        try{
            Scanner fileScanner = new Scanner(new File(""));
            fileScanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private void generateTest() {
        templateEngine("../resources/KataTemplate.java", "", null);
        
    }

    private void updateReadme() {

    }

    /**
     * It works like a template engine, getting a template, replacing
     * its arguments and building the output
     */
    private void templateEngine(String templatePath, String outputPath, Map<String, String> args) {

    }

    private String kataCamelCase() {
        return "";
    }
}
