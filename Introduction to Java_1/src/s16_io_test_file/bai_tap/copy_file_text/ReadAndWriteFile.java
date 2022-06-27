package s16_io_test_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> arrayNumbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine()) != null) {
                arrayNumbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
        return arrayNumbers;
    }
    public static void writeArrayList(List<Integer> arrayNumbers,String filePath){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < arrayNumbers.size(); i++) {
                bufferedWriter.write(arrayNumbers.get(i)+ "");
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String link1 = "src/s16_io_test_file/bai_tap/copy_file_text/Text1.txt";
        String link2 = "src/s16_io_test_file/bai_tap/copy_file_text/Text2.txt";
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> arrayNumbers = readAndWriteFile.readFile(link1);
        writeArrayList(arrayNumbers,link2);
    }
}
