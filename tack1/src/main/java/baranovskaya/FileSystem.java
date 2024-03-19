package baranovskaya;
import java.util.Scanner;

import static baranovskaya.PathBuilder.processInput;

public class FileSystem {
    public static final Folder root = new Folder("root");

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                processInput(input);
            }
        }
    }
}