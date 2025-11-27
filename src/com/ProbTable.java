package com;
import java.util.HashMap;

public class ProbTable {
    // Hashmap instantiated
    HashMap<Integer, Double> probTable = new HashMap<>();

    // Variables to help tweak table
    int dayKey;
    Double probValue;

    // Constructor
    public ProbTable() {
        // 29 days worth of possibilities
        // (KEY, VALUE) => (INTEGER, DOUBLE) => (day, prob)
        probTable.put(0, 0.01);
        probTable.put(1, 0.05);
        probTable.put(2, 0.09);
        probTable.put(3, 0.15);
        probTable.put(4, 0.19);
        probTable.put(5, 0.23);
        probTable.put(6, 0.29);
        probTable.put(7, 0.35);
        probTable.put(8, 0.45);
        probTable.put(9, 0.55);
        probTable.put(10, 0.65);
        probTable.put(11, 0.75);
        probTable.put(12, 0.85);
        probTable.put(13, 0.88);
        probTable.put(14, 0.92);
        probTable.put(15, 0.99);
        probTable.put(16, 0.92);
        probTable.put(17, 0.88);
        probTable.put(18, 0.85);
        probTable.put(19, 0.75);
        probTable.put(20, 0.65);
        probTable.put(21, 0.55);
        probTable.put(22, 0.45);
        probTable.put(23, 0.35);
        probTable.put(24, 0.29);
        probTable.put(25, 0.23);
        probTable.put(26, 0.19);
        probTable.put(27, 0.15);
        probTable.put(28, 0.09);
        probTable.put(29, 0.05);
    } // ProbTable Constructor 

    // Methods

    // Key access 
    public Double getPercent(int day) {
        return probTable.get(day);
    }


} // ProbTable Class
