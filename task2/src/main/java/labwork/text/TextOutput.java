package labwork.text;

import java.io.*;

public class TextOutput {
    public String textOutput(int lines) throws IOException {
        String file = "text.txt";
        String text = "";

        InputStream is = this.getClass().getClassLoader().getResourceAsStream(file);
        if (is == null) {
            throw new IOException("File reading error!");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        for (int i = 0; i < lines; i++) {
            String line = br.readLine();
            if (line != null) {
                text += line + "<br>";
            } else break;
        }

        return text;
    }
}
