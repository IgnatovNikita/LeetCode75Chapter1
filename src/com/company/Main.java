package com.company;

import java.util.Arrays;

public class Main {
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        if (right == 0) return 0;

        for (int i = 1; i < nums.length; i++){
            left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
	// write your code here
        /*
            Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
            Return the running sum of nums.
        */
        //System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));

        /*
            Given an array of integers nums, calculate the pivot index of this array.
            The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
            If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
            Return the leftmost pivot index. If no such index exists, return -1.
         */
        //System.out.println(pivotIndex(new int[]{2,1,-1}));
      //      IsomorphicStrings is = new IsomorphicStrings();
        //System.out.println(is.isIsomorphic("foo", "bar"));
   /* IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence("abc","ahbgdc"));
        System.out.println(is.isSubsequence("aaaaaa", "bbaaaa"));
    */
          //  ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        /*ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = new MergeTwoSortedLists().mergeTwoLists(null, new ListNode(0));


         */
        /*ListNode res = new ReverseLinkedList().reverseList(list1);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

         */
       // System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
       /* ListNode head = new ListNode(3);
        ListNode cikl = new ListNode(2);
        ListNode cikl2 = new ListNode(0);
        ListNode cikl3 = new ListNode(4);
        head.next = cikl;
        cikl.next = cikl2;
        cikl2.next = cikl3;
        cikl3.next = cikl;
        System.out.println(new LinkedListCycleII().detectCycle(head).val);

        */
       // System.out.println(new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
       // System.out.println(new FirstBadVersion().firstBadVersion(5));
        TreeNode tr = new TreeNode(2, new TreeNode(1), new TreeNode(3));
       // System.out.println(new ValidateBinarySearchTree().isValidBST(tr));
        System.out.println( new LowestCommonAncestorofaBinarySearchTree().lowestCommonAncestor(tr,new TreeNode(1) ,new TreeNode(3)));
        /* tr = new TreeNode(5, new TreeNode(4), new TreeNode( 6, new TreeNode(3), new TreeNode(7)));
        System.out.println(new ValidateBinarySearchTree().isValidBST(tr));

        */
        char[][] grid = {
                {'1','1','1','1','0'},
        {'1','1','0','1','0'},
    {'1','1','0','0','0'},
        {'1','0','1','0','1'}
};
      //  System.out.println(new NumberofIslands().numIslands(grid));
        //System.out.println(new BackspaceStringCompare().backspaceCompare("#bb#c", "ad#c"));
        //System.out.println(new LastStoneWeight().lastStoneWeight(new int[]{1,3}));
        //System.out.println(new BullsandCows().getHint( "1123","0111"));
        System.out.println(new FindAllAnagramsinaString().findAnagrams("abab", "ab"));
        //System.out.println(new BullsandCows().getHint( "1807","7810"));
        //System.out.println(new FibonacciNumber().fib(4));
        //System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        //int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        //System.out.println(Arrays.deepToString(new FloodFill().floodFill(image, 1, 1, 2)));
    }
}
