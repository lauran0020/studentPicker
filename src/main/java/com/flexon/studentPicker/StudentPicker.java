package com.flexon.studentPicker;

import java.util.Random;

public class StudentPicker {

    public String[] getName(String[] names) {
        Random random = new Random();
        int idx = random.nextInt(names.length);
        while (names[idx].equals("")) {
            idx = random.nextInt(names.length);
        }

        
        return new String[] {names[idx], String.valueOf(idx)};
    }
}