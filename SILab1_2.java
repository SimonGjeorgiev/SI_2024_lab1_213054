package Desktop.SI_2024_lab1_213054;

import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom(List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            if (el.length() < minLength) {
                sb.append(el);
            }
        }
        return sb.toString();
    }
}
