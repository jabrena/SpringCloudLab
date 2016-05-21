import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class AppMain {

    public static void main(String[] args) {
        TaskServer server = new TaskServer();
        for (int i = 0; i < 50; i++) {
            Task task = new Task("Task " + i);
            server.execute(task);
        }
        server.close();
    }
}
