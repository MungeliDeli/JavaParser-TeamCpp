package teamcpp;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.printer.DotPrinter;
import com.github.javaparser.printer.YamlPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AbstractSyntaxPrinter {

    public static final String PATH = "C:/Users/user/Desktop/TeamC++/teamcpp/src/main/java/teamcpp/BookLending.java";

    public static void main(String[] args) throws Exception {
        File path = new File(PATH);
        CompilationUnit cu = StaticJavaParser.parse(path);

        // This method outputs the AST using pretty printing hence just like the written
        // program
        // System.out.println(cu);

        // This prints the entire AST
        // YamlPrinter printer = new YamlPrinter(true);
        // System.out.println(printer.output(cu));

        // Iterate through all classes/interfaces in the compilation unit
        for (ClassOrInterfaceDeclaration classOrInterface : cu.findAll(ClassOrInterfaceDeclaration.class)) {

            String className = classOrInterface.getNameAsString();

            System.out.println("AST for class/interface: " + className);

            YamlPrinter printer = new YamlPrinter(true);

            System.out.println(printer.output(classOrInterface));

            System.out.println(); // newline

            // This is the cool way to print thee AST.
            // it outputs a separate AST file for each class as a dot file which can be
            // visualized as a graph with
            // Graphviz
            String astFileName = className + ".dot";

            DotPrinter astPrinter = new DotPrinter(true);

            try (FileWriter fileWriter = new FileWriter(astFileName);

                    PrintWriter printWriter = new PrintWriter(fileWriter)) {

                printWriter.print(astPrinter.output(classOrInterface));
            }
            System.out.println("AST saved to file: " + astFileName);
        }
    }
}
