import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



class ReadResourceFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("/Users/bisasonkhanal/eclipse-workspace/com.inputoutputjavafilereader/src/main/resources/textfileforread");
            int c;
            String inputData = "";

            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
                inputData = inputData + (char)c;
            }
            inputData = inputData.trim();
            inputData = inputData + ", How are you?";
            System.out.println("input Data ::" +inputData);
            fileOutputStream = new FileOutputStream("/Users/bisasonkhanal/eclipse-workspace/com.inputoutputjavafilereader/src/main/resources/textfileforread");
            fileOutputStream.write(inputData.getBytes());
            System.out.println("File updated successfully...");

            File file = new File("/Users/bisasonkhanal/eclipse-workspace/com.inputoutputjavafilereader/src/main/resources/textfileforread");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(inputData.getBytes());
            System.out.println("File updated successfully in new location...");
        } catch (Exception e) {
            System.err.println("Error Message :: " + e.getMessage());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}