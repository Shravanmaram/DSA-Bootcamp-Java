
// leetcode
import java.util.*;
public class BuildArrayFromPermutations {
    public static void main(String args[]){
        int[] nums={5,0,1,2,3,4};
        BuildArrayFromPermutations obj=new BuildArrayFromPermutations();
       int[] ans = obj.BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public int[] BuildArray(int[] nums){
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    }

