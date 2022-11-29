public class Terminal extends Section {

    public interface TypeOfTalon {
        int talonID = 1;
        String typeOfGoalOfVisiting = "credit";
    }
    private TypeOfTalon talon;

    public Terminal() {
        super();
    }

    TypeOfTalon createTalon(String[] data) {
        return null;
    }

    void getCredit() {
        if (modeIsAfterDinner) {}
    }
    void getCards() {
        if (modeIsAfterDinner) {}
    }

    void getEquaringLicenses() {
        if (modeIsAfterDinner) {}
    }

    void getDocuments() {
        if (!modeIsAfterDinner) {}
    }

    TypeOfTalon getTalon() {
        return this.talon;
    }

    void chooseTheGoalOfVisiting() {
        this.getTalon();
        Queue.updateQueue();
        // check type and call getCredit, getCards, getEquaringLicenses or getDocuments
    }

}
