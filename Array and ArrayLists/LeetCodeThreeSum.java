import java.util.*;

public class LeetCodeThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> dup = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int x = 0; x < nums.length; x++) {
            int y = x + 1;
            int z = nums.length - 1;
            while (y < z) {
                int sum = nums[x] + nums[y] + nums[z];
                if (sum == 0) {
                    dup.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    y++;
                    z--;
                } else if (sum < 0) {
                    y++;
                } else {
                    z--;
                }
            }
        }
        res.addAll(dup);
        return res;
    }

    public static void main(String[] args) {
        LeetCodeThreeSum solution = new LeetCodeThreeSum();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println("Triplets that sum up to zero are:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
