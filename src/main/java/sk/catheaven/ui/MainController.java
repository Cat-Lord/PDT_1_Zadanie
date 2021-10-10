package sk.catheaven.ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Record;
import org.jooq.Result;
import sk.catheaven.main.Solver;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private final static Logger log = LogManager.getLogger();
    private final List<Result<Record>> theories;

    @FXML
    private StackedBarChart chart;
    private int currentTheory = 0;

    public MainController() {
        theories = new Solver().getTheoriesWeeklyEvolution();
        if (theories.isEmpty())
            throw new RuntimeException("EMPTY THEORIES LIST");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CategoryAxis x = new CategoryAxis();

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
        Result<Record> currentTheory = theories.get(index);

    }
}
