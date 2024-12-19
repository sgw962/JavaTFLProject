public class DataAnalyser {
    public double calculateStepFreePercentage(List<Station> stations) {
        long count = stations.stream().filter(Station::hasStepFreeAccess).count();
        return (double) count / stations.size() * 100;
    }
}
