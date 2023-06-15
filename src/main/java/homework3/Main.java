package homework3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedUnits<String> linkedUnits = new LinkedUnits<>();
        linkedUnits.add("str1");
        linkedUnits.add("str2");
        linkedUnits.add("str3");
        linkedUnits.add("str4");
        linkedUnits.add("str5");
        linkedUnits.add("str6");

        System.out.printf("list size: %d\n", linkedUnits.size());

        System.out.println("---for-each---");
        for (String value : linkedUnits) {
            System.out.println(value);
        }

        System.out.println("---remove-index-3---");
        System.out.println(linkedUnits.remove(3));

        System.out.println("---set-element-index-1--");
        linkedUnits.set("new value", 1);

        System.out.println("---get-elements-by-index---");
        for (int i = 0; i < linkedUnits.size(); i++) {
            System.out.println(linkedUnits.get(i));
        }

        System.out.println("---clear---");
        linkedUnits.clear();
        System.out.printf("list size: %d\n", linkedUnits.size());
    }
}





