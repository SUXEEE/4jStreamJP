import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

public class Opencsv {
	 /**
     * CSVファイルからデータを読み込むメソッド .
     * @param fileName 該当ファイルパス
     * @return パースしたJava Beanのリスト
     */
	
    public List<TweetParameter> readFromCsvFile(String fileName) {
        InputStreamReader isr = null;
        List<TweetParameter> list = null;
        try {
            try {
                isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
                CSVReader reader = new CSVReader(isr, ',', '"', 1);
                
                ColumnPositionMappingStrategy start = new ColumnPositionMappingStrategy();
                start.setType(TweetParameter.class);

                String[] columns = new String[]{"userName", "projectName", "isManager"};
                start.setColumnMapping(columns);
                
                CsvToBean csv = new CsvToBean();
                list = csv.parse(start, reader);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } finally {
            try {
                isr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    /**
     * ファイルがExcelファイルかCSVファイルであるか確認するメソッド .
     * @param inputFile 対象ファイル
     * @return Excelファイルか否か
     */
    public boolean isFileValid (String inputFile){
        boolean isValid = false;
        if (inputFile != null) {
            if (inputFile.endsWith("xls") || inputFile.endsWith("xlsx") || inputFile.endsWith("csv")) {
                isValid = true;
            }
        }
        return isValid;
    }

}
