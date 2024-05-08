// 506. Relative Ranks

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCodeRelativeRanks {
    public static void main(String[] args) {
        int[] score = { 10, 3, 8, 9, 4 };

        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        ArrayList<Integer> list = new ArrayList<>();
        String[] ranks = new String[len];

        for (int num : score) {
            list.add(num);
        }
        // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < len; i++) {
            int pos = list.indexOf(score[i]) + 1;

            switch (pos) {
                case 1:
                    ranks[i] = "Gold Medal";
                    break;
                case 2:
                    ranks[i] = "Silver Medal";
                    break;
                case 3:
                    ranks[i] = "Bronze Medal";
                    break;
                default:
                    ranks[i] = String.valueOf(pos);
            }
        }
        return ranks;
    }

}
