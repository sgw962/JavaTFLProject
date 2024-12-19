import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;

public class DataVisualizer {
    public void displayStepFreeChart(double stepFreePercentage) {
        PieChart chart = new PieChartBuilder().width(800).height(600).title("Step-Free Access in London Stations").build();
        chart.addSeries("Step-Free Access", stepFreePercentage);
        chart.addSeries("No Step-Free Access", 100 - stepFreePercentage);
        new SwingWrapper<>(chart).displayChart();
    }
}
