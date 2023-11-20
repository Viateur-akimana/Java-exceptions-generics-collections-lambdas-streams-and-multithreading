import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Objects {
    public static void main(String[] args) throws IOException {
        Scanner s= null;
        FileWriter outputStream = null;
        try {
            s= new Scanner(new File("/home/akimana/IdeaProjects/Advanced concepts/src/io/districts.txt")).useDelimiter(",|\\n");
            outputStream = new FileWriter("output.txt");

            while (s.hasNext()) {
                String districtCode = s.next();
                String districtName = s.next();
                String provinceCode = s.next();
                String provinceName = s.next();

                outputStream.write("District Code: " + districtCode + "\n");
                outputStream.write("District Name: " + districtName + "\n");
                outputStream.write("Province Code: " + provinceCode + "\n");
                outputStream.write("Province Name: " + provinceName + "\n\n");
                if (s.hasNextLine()) {
                    s.nextLine();
                }
            }

            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
