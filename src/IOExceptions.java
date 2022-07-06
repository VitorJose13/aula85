import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class IOExceptions {

    public static void main(String[] args) {


        String textLine;


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./files/text.txt"))){

            while( (textLine = bufferedReader.readLine()) != null) {
                System.out.println(textLine);
            }


        }catch(IOException e){

            System.out.println(e);

        }

    }

}