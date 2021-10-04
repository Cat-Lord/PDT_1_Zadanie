package sk.catheaven.main;

import org.jooq.codegen.GenerationTool;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        // this is how we generated db classes
        GenerationTool.generate(
                Files.readString(
                        Paths.get(ClassLoader.getSystemResource("jooq.xml").toURI())
                )
        );
    }
}
