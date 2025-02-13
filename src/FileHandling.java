import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File file = new File("new.txt");

// file created..
// else file is not created..
            if(file.createNewFile()){
                System.out.println("the file is created");
            }
            else{
                System.out.println("the file is not created");
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
