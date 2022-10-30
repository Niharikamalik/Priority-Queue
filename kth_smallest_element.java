class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
        }
        for(int i=0 ; i<k-1;i++){
            p.poll();
        }
        return p.peek();
    } 
}
// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
