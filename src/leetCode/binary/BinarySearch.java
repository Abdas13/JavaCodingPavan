package leetCode.binary;

public class BinarySearch {
    public static int findByBinary(int[] nums, int target){
        int left =0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;      //(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (target>nums[mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 34, 35,
                36, 37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 48, 49, 50, 51, 52,
                53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68,
                69, 70, 71, 72, 73, 74, 75, 76,
                77, 78, 79, 80, 81, 82, 83, 84,
                86, 87, 88, 89, 90, 91, 92, 93,
                94, 95, 97, 98, 99, 100};
        System.out.println(findByBinary(nums, 11));
        System.out.println(findByBinary(nums, 100));
        System.out.println(binarySearchInSortedArray(nums,11));
    }
    public static int binarySearchInSortedArray(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (target==nums[mid])
                return mid;
            if (target>nums[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
