package net.ed;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
//        items.add("me");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

    }
}
