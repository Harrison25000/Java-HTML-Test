import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bob{
    public static void main(String[] args){
        File f = new File("./test.html");
        String html = "<div><h1>IT'S A ME, MARIO</h1></div>";
        try{
            BufferedWriter bw = new BufferedWriter((new FileWriter(f)));
            bw.write(html);
            bw.close();
        }catch (IOException e){
            System.out.println("Probably can't write new file.");
            e.printStackTrace();
        }
    }

}