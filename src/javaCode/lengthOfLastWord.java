package javaCode;

public class lengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int counter = 0;

        if (s == null) {
            return 0;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                counter++;

                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) != ' ') {
                        counter++;
                    }
                    else {
                        break;
                    }
                }
                break;
            }
        }
        return counter;
    }
}
