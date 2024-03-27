/*
package labwork.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordFinder {
    public int wordFrequency(String name) throws IOException {
        int frequency = 0;
        String file = "text.txt";

        InputStream is = this.getClass().getClassLoader().getResourceAsStream(file);
        if (is == null) {
            throw new IOException("File reading error!");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = br.readLine();
        while (line != null) {
            String[] words = line.split("[^\\p{L}\\p{N}-]+"); // Разделение строки на слова
            for (String w : words) {
                if (w.equalsIgnoreCase(name)) {
                    frequency++;
                }
            }
            line = br.readLine();
        }

        return frequency;
    }
}
*/
