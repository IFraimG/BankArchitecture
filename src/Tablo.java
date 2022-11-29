public class Tablo<TypeOfState> extends Section {
    public TypeOfState stateOfQueue;
    public String[] listOfPeoplesID;

    int getTimePeople(int peopleID) {
        // return time of waiting
        return 1;
    }

    void showStateOfQueue() {
        getTimePeople(1);
        // получает напрямую всех людей в очереди

    }
}
