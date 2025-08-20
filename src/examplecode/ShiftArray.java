package examplecode;

import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args){
        int[] numbers = new int[]{0,2,1,2,2,1};
        ShiftArray obj = new ShiftArray();
        System.out.println("Output arra =>"+ Arrays.toString(obj.applyOperations(numbers)));
    }

    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int i=0;i<n;i++){
            if(i < n-1 && nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }

            if(nums[i] != 0){
                nums[index] = nums[i];
                if(index != i){
                    nums[i] = 0;
                }
                index++;
            }
        }
        return nums;
    }

}
