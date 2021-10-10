package sk.catheaven.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Config {
    public static final List<String> hashtags = List.of("DeepstateVirus", "DeepStateVaccine",
                            "DeepStateFauci", "QAnon", "Agenda21", "CCPVirus", "ClimateChangeHoax",
                            "GlobalWarmingHoax", "ChinaLiedPeopleDied", "SorosVirus", "5GCoronavirus", "MAGA",
                            "WWG1WGA", "Chemtrails", "flatEarth", "MoonLandingHoax", "moonhoax", "illuminati",
                            "pizzaGateIsReal", "PedoGateIsReal", "911truth", "911insidejob", "reptilians");

    public static final String SENTIMENT_NEGATIVE = "sentiment_negative";
    public static final String SENTIMENT_NEUTRAL  = "sentiment_neutral";
    public static final String SENTIMENT_POSITIVE = "sentiment_positive";
    public static final String SENTIMENT_COMPOUND = "sentiment_compound";

    private static Map<String, String> theories;
    private static Connection connection;

    public static Map<String, String> getTheories() {
        if (theories == null) {
            theories = new HashMap<>();
            theories.put("DeepstateVirus", "Deep State");
            theories.put("DeepStateVaccine", "Deep State");
            theories.put("DeepStateFauci", "Deep State");
            theories.put("QAnon", "Qanon");
            theories.put("MAGA", "Qanon");
            theories.put("WWG1WGA", "Qanon");
            theories.put("Agenda21", "New world order");
            theories.put("CCPVirus", "The virus escaped from a Chinese lab");
            theories.put("ChinaLiedPeopleDied", "The virus escaped from a Chinese lab");
            theories.put("ClimateChangeHoax", "GLobal Warming is HOAX");
            theories.put("GlobalWarmingHoax", "GLobal Warming is HOAX");
            theories.put("SorosVirus", "COVID19 and microchipping");
            theories.put("MoonLandingHoax", "Moon landing is fake");
            theories.put("moonhoax", "Moon landing is fake");
            theories.put("5GCoronavirus", "COVID19 is preaded by 5G");
            theories.put("911truth", "9/11 was inside job");
            theories.put("911insidejob", "9/11 was inside job");
            theories.put("pizzaGateIsReal", "Pizzagate conspiracy theory");
            theories.put("PedoGateIsReal", "Pizzagate conspiracy theory");
            theories.put("Chemtrails", "Chemtrails");
            theories.put("flatEarth", "FlatEarth");
            theories.put("illuminati", "Illuminati");
            theories.put("reptilians", "Reptilian conspiracy theory");
        }
        return theories;
    }

    public static Connection connectDatabase() {
        if (connection == null) {
            String url = Main.properties.getProperty("jdbc.url");
            String user = Main.properties.getProperty("jdbc.user");
            String password = Main.properties.getProperty("jdbc.password");

            try {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

}
