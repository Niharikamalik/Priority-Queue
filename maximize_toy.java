class Solution{
    static int toyCount(int N, int k, int arr[])
    {
        // code here
          PriorityQueue<Integer> p = new PriorityQueue<>();
          for(int i=0 ; i<N;i++){
              p.add(arr[i]);
          }
          int res = 0;
          while(k>0&& p.isEmpty()== false && p.peek()<=k){
              k = k-p.poll();
              res++;
          }
          return res;
    }
}
