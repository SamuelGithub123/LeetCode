package javaCode;

import java.util.ArrayList;
import java.util.List;

public class isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    list1.add(i);
                    list1.add(j);
                    break;
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (t.charAt(i) == t.charAt(j)) {
                    list2.add(i);
                    list2.add(j);
                    break;
                }
            }
        }


        for (int i = 0; i < list1.size(); i += 2) {
            if (t.charAt(list1.get(i)) != t.charAt(list1.get(i + 1))) {
                return false;
            }
        }

        for (int i = 0; i < list2.size(); i += 2) {
            if (s.charAt(list2.get(i)) != s.charAt(list2.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
