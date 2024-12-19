import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Load the data
        StationDataLoader loader = new StationDataLoader();
        List<Station> stations = loader.loadStations("stations.csv");

        // Analyze the data
        DataAnalyser analyzer = new DataAnalyser();
        double stepFreePercentage = analyzer.calculateStepFreePercentage(stations);

        // Visualize the results
        DataVisualizer visualizer = new DataVisualizer();
        visualizer.displayStepFreeChart(stepFreePercentage);
    }
}