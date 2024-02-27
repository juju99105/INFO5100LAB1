package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 6, 7, 8, 9, 10 };
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        System.out.print("Array x = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.print("Array y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        ArrayList<String> names = new ArrayList<String>();
        names.add("Alexa");
        names.add("Bjorn");
        names.add("Cathy");
        names.add("David");
        names.add("Eva");
        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.print("Names (switched) = { ");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String switchedName = name.substring(name.length() - 1).toUpperCase() +
                    name.substring(1, name.length() - 1) +
                    name.substring(0, 1).toLowerCase();
            System.out.print(switchedName);
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
