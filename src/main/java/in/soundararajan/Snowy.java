package in.soundararajan;


import com.algolia.search.APIClient;
import com.algolia.search.ApacheAPIClientBuilder;
import com.algolia.search.Index;
import com.algolia.search.exceptions.AlgoliaException;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.ICSVParser;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.IterableCSVToBean;
import com.opencsv.bean.IterableCSVToBeanBuilder;

import java.io.FileReader;
import java.io.Reader;

public class Snowy {

    private final Reader reader;
    public Snowy(String fileName) throws Exception
    {
        this.reader = new FileReader(fileName);
    }

    public Snowy(Reader reader)
    {
        this.reader = reader;
    }

    private CSVReader csvReader() throws Exception {
        ICSVParser parser = new CSVParser(',',
                ICSVParser.DEFAULT_QUOTE_CHARACTER,
                ICSVParser.DEFAULT_ESCAPE_CHARACTER,
                ICSVParser.DEFAULT_IGNORE_QUOTATIONS,
                ICSVParser.DEFAULT_IGNORE_LEADING_WHITESPACE,
                true);
        int skipHeaderLine = 1;
        CSVReader reader = new CSVReader(this.reader, skipHeaderLine, parser);
        return reader;
    }

    public IterableCSVToBean<ProviderBean> records() throws Exception {

        return new IterableCSVToBeanBuilder<ProviderBean>()
                .withReader(csvReader())
                .withMapper(strategy())
                .build();
    }

    private ColumnPositionMappingStrategy<ProviderBean> strategy() throws Exception {
        ColumnPositionMappingStrategy<ProviderBean> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(ProviderBean.class);
        return strategy;
    }


    public static void main(String[] args) throws Exception {
        // write your code here
        Snowy snowy = new Snowy("/Users/dakshins/Downloads/NPPES_Data_Dissemination_February_2018/xaa");
        snowy.run();
    }

    public void run() throws Exception
    {
        java.security.Security.setProperty("networkaddress.cache.ttl", "60");
        APIClient client = new ApacheAPIClientBuilder("JR8QW57XU4", "b086e93205a8a00c578a63e53525dc27").build();
        Index<ProviderBean> index = client.initIndex("NPPES_Data", ProviderBean.class);

        IterableCSVToBean<ProviderBean> records = records();
            records.forEach(record ->
                    {
                        try {
                            System.out.println("Processing : " + record.NPI);
                            index.addObject(record);
                        } catch (AlgoliaException ex) {
                            System.out.println(ex);
                        }
                    }
            );
    }
}
