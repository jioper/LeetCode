import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int desired=target-nums[i];
            if(map.containsKey(desired)){
                return new int[] {map.get(desired),i};
            }else {
                map.put(nums[i],i );
            }
        }
        return new int[2];
    }

}

