package codewars;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

/**
 * This class gets result from the CodewarsApi
 */
public class CodewarsApi {

    /**
     * List of Codewars API types and it's sources (with arguments
     * like user, challenge, ...)
     */
    public enum ApiType {
        
        GET_USER("https://www.codewars.com/api/v1/users/{user}"),
        LIST_COMPLETED_CHALLENGES("https://www.codewars.com/api/v1/users/{user}/code-challenges/completed?page={page}"),
        LIST_AUTHORED_CHALLENGES("https://www.codewars.com/api/v1/users/{user}/code-challenges/authored"),
        GET_CODE_CHALLENGE("https://www.codewars.com/api/v1/code-challenges/{challenge}");

        private String source;
        
        private ApiType(String source) {
            this.source = source;
        }

        /**
         * Returns the API source with it's embedded arguments
         */
        public String getSourceFor(String... args) {
            String sourceResult = source;
            for (String arg : args) {
                sourceResult = sourceResult.replaceFirst("{.*}", arg);
            }
            return sourceResult;
        }
    }

    private String apiSource;

    public CodewarsApi(ApiType apiType, String... args) {
        this.apiSource = apiType.getSourceFor(args);
    }
    
    public Map<String, String> getResult() {
        try {
            return new ObjectMapper().readValue(apiSource,
                new TypeReference<Map<String, String>>() {});
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
