package Adapter;

public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter();

        adapter.setDay(1);
        adapter.setMonth(7);
        adapter.setYear(1998);
        adapter.printDate();

        adapter.advanceDays(9947);
        adapter.printDate();
    }
}
