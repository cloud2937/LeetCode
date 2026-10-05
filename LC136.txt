//LeetCode.136.只出现一次的数字——用位运算：异或（^），a ^ a = 0，a ^ 0 = a
public class Solution{
        public int searchSingle(int[ ] nums){
                   int answer = 0;
                   for(int i = 0: i < nums.length - 1; i++){
                          answer ^= nums[i];
                   }
                   return answer;
         }
  }