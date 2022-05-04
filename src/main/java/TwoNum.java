import java.util.Arrays;

public class TwoNum
{
    public static void twoSum(int[] nums, int target)
    {

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i]+ nums[j] == target ) //if sum of i and j equals to target
                {
                   int[] temp= new int[]{i, j};   //store it in temp array
                    System.out.println(Arrays.toString(temp)); //printing temp array
                }
            }
        }

    }

    public static void main(String[] args)
    {
        int[] nums={2,7,11,15};
        int target =9;
        twoSum(nums,target);//calling method
    }
}
