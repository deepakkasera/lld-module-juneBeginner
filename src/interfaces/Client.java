package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
