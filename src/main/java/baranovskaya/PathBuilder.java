package baranovskaya;

import static baranovskaya.FileSystem.root;

public class PathBuilder {
    @org.jetbrains.annotations.Contract(pure = true)
    private PathBuilder() {
    }

    public static void processInput(String input) throws Exception{
        //try {
            String[] parts = input.split("/");
            Folder currentFolder = root;
            for (int i = 0; i < parts.length - 1; i++) {
                if (!currentFolder.getItems().containsKey(parts[i])) {
                    Folder newFolder = new Folder(parts[i]);
                    currentFolder.addItem(newFolder);
                }
                currentFolder = (Folder) currentFolder.getItems().get(parts[i]);
            }
            String[] fileParts = parts[parts.length - 1].split("\\.");
            File file = new File(fileParts[0], fileParts[1]);
            currentFolder.addItem(file);
            System.out.println(root);
        /*} catch(Exception e){
            System.out.println("Некорректный ввод");
        }*/

    }
}
