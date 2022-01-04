import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class affichagelistagent {

   
    public static String AffichageListAgent() throws IOException{
        String initialiser ="";
        Path filepath = Path.of("./staff.txt"); 
        List<String> lines = Files.readAllLines(filepath); 
        for (String string : lines) {
            StringBuffer sb = new StringBuffer() ;
            sb.append(string); 
            sb.insert(1,"");
            System.out.println(sb);
        }
        return initialiser; 
        }
    }
    
