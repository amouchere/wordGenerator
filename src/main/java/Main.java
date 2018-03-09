import com.mifmif.common.regex.Generex;
import com.mifmif.common.regex.util.Iterator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter("word.txt", "UTF-8");

        String regex = "[0-9]{0,4}";
        Generex generex = new Generex(regex);
        Iterator iterator = generex.iterator();
        while (iterator.hasNext()) {
            writer.println(iterator.next());
        }

        writer.close();

    }
}
