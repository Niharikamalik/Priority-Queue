class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<Integer>();
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            p.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(p.peek()<arr[i]){
                p.poll();
                p.add(arr[i]);
            }
        }
        for(int i=0;i<k;i++){
            al.add(p.poll());
        }
        Collections.sort(al,Collections.reverseOrder());
             return al;
    }
}
// https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1
