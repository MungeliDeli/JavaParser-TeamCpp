package teamcpp;

import com.github.javaparser.JavaParser;
import com.github.javaparser.JavaToken;
import com.github.javaparser.JavaToken.Category;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.io.File;
import java.io.IOException;

public class TokenTypeCounter {

    public static void main(String[] args) {

        // initialize a map to count token types
        Map<Category, Integer> tokenTypeCount = new HashMap<>();

        String sourceDirectory = "C:/Users/user/Desktop/TeamC++/teamcpp/src/main/java/teamcpp/BookLending.java";
        File projectDir = new File(sourceDirectory);

        try {

            JavaParser javaParser = new JavaParser();

            ParseResult<CompilationUnit> parseResult = javaParser.parse(projectDir);

            if (parseResult.isSuccessful()) {
                CompilationUnit cu = parseResult.getResult().get();

                cu.getTokenRange().ifPresent(tokenRange -> {
                    for (JavaToken token : tokenRange) {
                        Category tokenType = token.getCategory();
                        tokenTypeCount.put(tokenType, tokenTypeCount.getOrDefault(tokenType, 0) + 1);
                    }
                });

                for (Entry<Category, Integer> entry : tokenTypeCount.entrySet()) {
                    System.out.println("Token type: " + entry.getKey() + ", Count: " + entry.getValue());
                }

            } else {
                System.err.println("Parsing failed: " + parseResult.getProblems());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
