package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        System.out.println(list.contains(765432));
        System.out.println(list);
        list.set(0, 99);

        list.remove(2);

        System.out.println(list);

    }
}
