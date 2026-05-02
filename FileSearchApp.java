import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task for searching files
class FileSearchTask implements Runnable {
    private File directory;
    private String fileName;

    public FileSearchTask(File directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        search(directory);
    }

    private void search(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                // Recursive search in subdirectory
                search(file);
            } else {
                if (file.getName().equalsIgnoreCase(fileName)) {
                    System.out.println("Found: " + file.getAbsolutePath());
                }
            }
        }
    }
}

// Main Class
public class FileSearchApp {
    public static void main(String[] args) {

        String folderPath = "D:\\Meena"; // change your path
        String searchFile = "test.txt";  // file to search

        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid directory!");
            return;
        }

        int threads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threads);

        System.out.println("Searching using " + threads + " threads...\n");

        executor.execute(new FileSearchTask(folder, searchFile));

        executor.shutdown();
    }
}