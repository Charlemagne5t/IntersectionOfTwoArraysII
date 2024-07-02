import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];

        for(int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if(count[nums2[i]] > 0){
                res.add(nums2[i]);
                count[nums2[i]]--;
            }
        }

        int[] result = new int[res.size()];

        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }
}
