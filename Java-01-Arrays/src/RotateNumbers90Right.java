import java.util.Arrays;

public class RotateNumbers90Right {

    public static void main(String[] args) {
        int nums[][] =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.deepToString(rotate(nums)));
    }

    static int[][] rotate(int[][] nums){
        int length = nums.length;
        for (int i = 0; i < length; i++){
            for (int j = i; j < length; j++){
                int temp = nums[j][i];
                nums[j][i] = nums[i][j];
                nums[i][j] = temp;
            }
        }

        for (int i = 0; i < length; i++){
            for (int j = 0; j < length/2; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][length - j - 1];
                nums[i][length - j - 1] = temp;
            }
        }
        return nums;
    }
}
