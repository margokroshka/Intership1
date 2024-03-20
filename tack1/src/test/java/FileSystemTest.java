import baranovskaya.File;
import baranovskaya.Folder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static baranovskaya.FileSystem.root;
import static baranovskaya.PathBuilder.processInput;
import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {
    @Test
    void testProcessInput_ShouldOutputTheFilesystem_WhenTheUserEntersValidValue() throws Exception {
        String input = "folder1/folder2/file.txt";
        processInput(input);
        Assertions.assertTrue(root.getItems().containsKey("folder1"));
        Folder folder1 = (Folder) root.getItems().get("folder1");
        Assertions.assertTrue(folder1.getItems().containsKey("folder2"));
    }

    /*@Test
     void testProcessInput_OutputShouldBeRejected_WhenTheUserEntersInvalidValue() throws Exception {
        String input = "folder1//folder2/file";
        Throwable thrown = assertThrows(Exception.class, () -> {
           processInput(input);
        });
        assertNotNull(thrown.getMessage());
    }*/

    @Test
     void testAddFolder_ShouldBeAdded_WhenTheUserEntersValue() {
        Folder folder = new Folder("testFolder");
        assertNotNull(folder);
        assertEquals("testFolder", folder.getName());
    }

    @Test
     void testAddFile_ShouldBeAdded_WhenTheUserEntersValue() {
        File file = new File("testFile", "txt");
        assertNotNull(file);
        assertEquals("testFile.txt", file.toString());
    }

    @Test
     void testAddItemToFolder_ShouldBeAdded_WhenTheUserEntersValue() {
        Folder folder = new Folder("testFolder");
        File file = new File("testFile", "txt");
        folder.addItem(file);
        assertTrue(folder.getItems().containsKey("testFile"));
        assertEquals(file, folder.getItems().get("testFile"));
    }

}