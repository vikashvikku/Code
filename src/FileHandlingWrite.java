import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWrite {
    public static void main(String[] args) {
                try{
                    FileWriter filewriter = new FileWriter("new.txt");
                    filewriter.write("in online classes , students are more relaxed");
                    filewriter.close();
                    System.out.println("succesfully wrote to the file");

                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }


}
