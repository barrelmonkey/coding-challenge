import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CSVParser {


    public <T> List<T> readCsvToBeanList(String csvName, Class clazz, List<T> list) throws Exception {
        HeaderColumnNameMappingStrategy ms = new HeaderColumnNameMappingStrategy();
        ms.setType(clazz);

        URL fileURL = ClassLoader.getSystemResource(csvName);
        if(fileURL == null){
            throw new FileNotFoundException("Unable to find file "+ csvName);
        }
        Path path = Paths.get(fileURL.toURI());

        try (Reader reader = Files.newBufferedReader(path)) {
            CsvToBean cb = new CsvToBeanBuilder(reader)
                    .withType(clazz)
                    .withMappingStrategy(ms)
                    .build();

            list = cb.parse();
        }
        return list;
    }
}
