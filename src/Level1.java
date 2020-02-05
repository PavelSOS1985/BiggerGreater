import java.util.*;

public class Level1 {
    public static String BiggerGreater(String input) {
        char[] inputToChar = input.toCharArray();
        int indexForSort = 0;
        boolean chance = false;
        first:
        for (int i = inputToChar.length - 1; i >= 0; i--) {
            char tempChar = inputToChar[i];
            for (int j = i - 1; j >= 0; j--) {
                if (inputToChar[i] > inputToChar[j]) {
                    inputToChar[i] = inputToChar[j];
                    inputToChar[j] = tempChar;
                    indexForSort = j;
                    chance = true;
                    break first;
                }
            }
        }
        if (!chance) return "";
        Arrays.sort(inputToChar, indexForSort + 1, inputToChar.length);
        return new String(inputToChar);
    }
}