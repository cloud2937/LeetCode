import java.util.*;

//方法一：哈希表
class Solution{
    public int majorityElement(int[] nums){
        Map<Integer,Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
            if(counts.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}

//方法二：Boyer-Moore投票算法
public int majorityElement(int[] nums){
    int count = 0;
    int candidate = 0;
    for(int num : nums){
        if(count == 0){
            candidate = num;
        }
        count += (num==candidate)?1:-1;
    }
    return candidate;
}
