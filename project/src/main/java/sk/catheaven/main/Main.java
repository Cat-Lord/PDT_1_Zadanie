package sk.catheaven.main;

import com.vdurmont.emoji.EmojiManager;
import org.jooq.codegen.GenerationTool;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static Properties properties;

    public static void main(String[] args) throws ClassNotFoundException, Exception {
        // run only when required due to effectiveness
//        GenerationTool.generate(
//                Files.readString(
//                        Paths.get(ClassLoader.getSystemResource("jooq.xml").toURI())
//                )
//        );


        Properties properties = new Properties();
        String resourcesPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String propertiesPath = resourcesPath + "jdbc-config.properties";
        properties.load(new FileInputStream(propertiesPath));
        Main.properties = properties;

        Solver solver = new Solver();
        solver.calculateSentiment();
    }
}
