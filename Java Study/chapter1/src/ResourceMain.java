
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ResourceMain {

    public class ResourceMainEncoding {
        
        static Properties loadUtf8Properties(String resourceName) throws IOException {
            
        try (InputStream is = ResourceMainEncoding.class.getResourceAsStream(resourceName);
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader reader = new BufferedReader(isr)) {
        
        Properties result = new Properties();
        
         // Properties#load() で渡す Reader オブジェクトを UTF-8 エンコーディング指定して生成した
         // InputStreamReader オブジェクトにする
        result.load(reader);
        
        return result;
        }
        }
        
//    public static void main(String[] args) {
//        // TODO 自動生成されたメソッド・スタブ
//        ResourceBundle bundle = ResourceBundle.getBundle("test");
//        String value = bundle.getString("name");
//        System.out.println(value);
//    }
    
    public static void main(String[] args) throws IOException {
        Properties Properties = loadUtf8Properties("/test.properties");
        System.out.println(Properties.getProperty("name"));
        
        }

    }
}