package sk.catheaven.ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import sk.catheaven.main.Solver;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static org.jooq.impl.DSL.name;

public class MainController implements Initializable {

    private final static Logger log = LogManager.getLogger();
    private final List<Result<Record>> theories;

    @FXML
    VBox contentBox;
    private StackedBarChart chart;
    private int currentTheory = 0;

    public MainController() {
        theories = new Solver().getTheoriesWeeklyEvolution();
        if (theories.isEmpty())
            throw new RuntimeException("EMPTY THEORIES LIST");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayTheory(currentTheory);
    }

    @FXML
    public void getPrevious() {
        try {
            displayTheory(currentTheory - 1);
            currentTheory--;
        } catch (Exception e ) {
            log.error(e.getMessage() + " | " + e.getCause());
        }
    }

    @FXML
    public void getNext() {
        try {
            displayTheory(currentTheory + 1);
            currentTheory++;
        } catch (Exception e ) {
            log.error(e.getMessage() + " | " + e.getCause());
        }
    }

    private void displayTheory(int index) throws IndexOutOfBoundsException {
        Result<Record> theory = theories.get(index);

        CategoryAxis x = new CategoryAxis();        // count, extreme count, neutral count
        NumberAxis y = new NumberAxis();            // number of occurences

        chart = new StackedBarChart<>(x,y);
        chart.setTitle(
                theory.get(0).get(name("name")).toString()
        );

        XYChart.Series<String, Integer> counts = new XYChart.Series<>();
        XYChart.Series<String, Integer> extremes = new XYChart.Series<>();
        XYChart.Series<String, Integer> neutrals = new XYChart.Series<>();
        counts.setName("Count");
        extremes.setName("Extreme");
        neutrals.setName("Neutral");
        for (Record record : theory) {
            counts.getData().add(
                    new XYChart.Data<>(
                        record.get(name("week")).toString(),
                        Integer.valueOf(record.get(name("tweet_count")).toString())
                    )
            );
            extremes.getData().add(
                    new XYChart.Data<>(
                            record.get(name("week")).toString(),
                            Integer.valueOf(record.get(name("tweet_extreme_count")).toString())
                    )
            );
            neutrals.getData().add(
                    new XYChart.Data<>(
                            record.get(name("week")).toString(),
                            Integer.valueOf(record.get(name("tweet_neutral_count")).toString())
                    )
            );
        }
        chart.getData().add(counts);
        chart.getData().add(extremes);
        chart.getData().add(neutrals);
        contentBox.getChildren().clear();
        contentBox.getChildren().add(chart);
    }
}
