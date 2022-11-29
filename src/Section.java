import java.util.Date;

public class Section extends Bank {
    // default
    public int numberOfSection = 1;
    Terminal terminal;
    Window windowsList[];
    Tablo tablo;

    public interface PeopleInQueue {
        int numberOfTalon = 0;
        int numberOfWindow = 0;
        Date planningTime = null;
    }

    public Section() {
        // create queue
        // create terminal
        // create windows
        // create tablo
    }
    public Section(int numberOfSection) {}

    protected static class Queue {
        protected PeopleInQueue[] customQueue;
        String typeOfQueue;

        static int updateQueue() {
            // возвращает новый номер в очереди
            return 1;
        }

        PeopleInQueue getPeopleFromQueue(int num) {
            return customQueue[num - 1];
        }

        static void deletePeopleFromQueue(int numberOfTalon) {
            // ...
            updateQueue();
        }
    }

}
