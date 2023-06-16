package org.example;

import org.apache.commons.lang3.ArrayUtils;
import java.util.*;

public class FancyPantsArrays {
    public static void main(String[] args) {
        int[] elevens = new int[7];
        Arrays.fill(elevens, 1, elevens.length - 1, 11);
        System.out.println(Arrays.toString(elevens));
        Arrays.sort(elevens); //Collections.sort(for arrayLists)
        System.out.println(Arrays.toString(elevens));
        ArrayUtils.reverse(elevens);
        System.out.println(Arrays.toString(elevens));

        int[] with12 = ArrayUtils.add(elevens, 12);
        System.out.println(Arrays.toString(with12));

        //lexicographical (fancy alphabetical but with the ascii table)

        String[] tricky = {"abc", "aaa", "AAA", "ZYX"};
        Arrays.sort(tricky);
        System.out.println(Arrays.toString(tricky));

        int[] without11s = ArrayUtils.removeAllOccurences(elevens, 11);
        System.out.println(Arrays.toString(without11s));





    }

    public static int[] shiftLeft(int[] nums){
        int saved = nums[0];
        int[] withoutFirst = ArrayUtils.remove(nums, 0);
        int[] rotated = ArrayUtils.add(withoutFirst, saved);
        return rotated;
    }
    
}
