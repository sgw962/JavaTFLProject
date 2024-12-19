import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.List;

public class StationDataLoader {
    public List<Station> loadStations(String filePath) {
        List<Station> stations = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            reader.readNext(); // Skip header
            while ((line = reader.readNext()) != null) {
                String name = line[0];
                double latitude = Double.parseDouble(line[1]);
                double longitude = Double.parseDouble(line[2]);
                boolean stepFree = line[3].equalsIgnoreCase("Yes");
                boolean toilets = line[4].equalsIgnoreCase("Yes");
                stations.add(new Station(name, latitude, longitude, stepFree, toilets));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stations;
    }
}