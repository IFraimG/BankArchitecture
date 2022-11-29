

public class Window<TypeOfButton> extends Section {
    private TypeOfButton button;

    public int num;

    public Window() {
        super();
    }

    int getWindowNum() {
        return num;
    }


    static void callPeople(PeopleInQueue people) {
        Queue.deletePeopleFromQueue(people.numberOfTalon);
        // ...
    }
}
