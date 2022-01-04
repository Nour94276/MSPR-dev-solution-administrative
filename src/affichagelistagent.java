import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class affichagelistagent {

   
    public static String AffichageListAgent() throws IOException{
        String initialiser ="";
        Path filepath = Path.of("./staff.txt"); 
        List<String> linest = Files.readAllLines(filepath); 
        
        List<String> lines = ListeOrdonne(linest); 
        for (String string : lines) {
            StringBuffer sb = new StringBuffer() ;
            sb.append(string); 
            sb.insert(1," ");
            System.out.println(sb);
        }
        return initialiser; 
        }
    
        public static List<String>  ListeOrdonne(List<String> _List)
        {
           for(int i=0 ; i < _List.size(); i++)
           {
               for(int j=i+1 ; j < _List.size(); j++)
               {
                   char ichar = _List.get(i).charAt(0); 
                   byte ibyte =(byte)ichar; 
                   char jchar = _List.get(j).charAt(0); 
                   byte jbyte =(byte)jchar; 
                  if(ibyte > jbyte)
                  {
                    var tmp = _List.get(i); 
                    _List.set(i,_List.get(j)); 
                    _List.set(j,tmp); 
                  }
                  byte _ibyte = (byte) _List.get(i).charAt(1); 
                  byte _jbyte =(byte) _List.get(j).charAt(1); 
                 if(ibyte == jbyte)
                 {
                    if(_ibyte > _jbyte)
                    {
                        var tmp = _List.get(i); 
                        _List.set(i,_List.get(j)); 
                        _List.set(j,tmp); 
                    }
                 }
               }
           }
           return _List; 
        }    
   
 }
    
