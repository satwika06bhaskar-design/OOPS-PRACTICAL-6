package javaprogramming;
import edu.duke.jar;
import org.apache.commons.csv.*;
import java.io.*;

public class ParsingWeatherData {
    
    public CSVRecord coldestHourInFile(CSVParser parser) {
        CSVRecord coldest = null;
        for (CSVRecord record : parser) {
            double temp = Double.parseDouble(record.get("TemperatureF"));
            if (temp == -9999) continue; // ignore invalid values
            if (coldest == null || temp < Double.parseDouble(coldest.get("TemperatureF"))) {
                coldest = record;
            }
        }
        return coldest;
    }
    
    public String fileWithColdestTemperature() {
        CSVRecord coldestSoFar = null;
        String coldestFileName = null;
        
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVRecord coldestInFile = coldestHourInFile(fr.getCSVParser());
            
            if (coldestSoFar == null || 
                Double.parseDouble(coldestInFile.get("TemperatureF")) < 
                Double.parseDouble(coldestSoFar.get("TemperatureF"))) {
                
                coldestSoFar = coldestInFile;
                coldestFileName = f.getName();
            }
        }
        
        System.out.println("Coldest day was in file " + coldestFileName);
        System.out.println("Coldest temperature on that day was " + coldestSoFar.get("TemperatureF"));
        return coldestFileName;
    }
    
    public void testFileWithColdestTemperature() {
        String file = fileWithColdestTemperature();
        System.out.println("Result from file: " + file);
    }
}
