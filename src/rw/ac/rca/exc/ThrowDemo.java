import java.io.*;

class ThrowDemo {
    static void demoproc() throws FileNotFoundException, IOException {
        String fileName = "example.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            throw e;
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (FileNotFoundException e) {
            System.out.println("Recaught FileNotFoundException: " + e);
        } catch (IOException e) {
            System.out.println("Recaught IOException: " + e);
        } catch (Exception e) {
            System.out.println("Recaught Exception: " + e);
        }
    }
}
