package Testpackage;

import java.util.ArrayList;
import java.util.ListIterator;
public class MonthsListwithIterator {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        System.out.println("Months of the Year (Forward):");
        ListIterator<String> iterator = months.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nMonths of the Year (Backward):");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() );
        }
    }
}
