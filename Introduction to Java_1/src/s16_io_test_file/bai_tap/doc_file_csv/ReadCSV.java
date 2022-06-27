package s16_io_test_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static List<Nation> readNationFileCSV(String pathFile){
        List<Nation> nationList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line="";
        String[]array = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                array = line.split(",");
                Nation nation = new Nation(Integer.parseInt(array[0]),array[1],array[2]);
                nationList.add(nation);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
     return nationList;
    }

    public static void main(String[] args) {
        List<Nation> nationList = readNationFileCSV("src/s16_io_test_file/bai_tap/doc_file_csv/text3.txt");
        for (int i = 0; i < nationList.size(); i++) {
            System.out.println(nationList.get(i).getName());
        }
    }
}
