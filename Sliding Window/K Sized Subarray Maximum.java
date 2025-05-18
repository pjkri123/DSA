class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> deque=new ArrayDeque<>();
        int start=0;
        int end=0;
        if(k>arr.length) {
            int max=Integer.MIN_VALUE;
            for(int i:arr) max=Math.max(max,i);
            ans.add(max);
            return ans;
        }
        while(end<arr.length) {
            while(deque.size()>0 && deque.peekLast()<arr[end]) deque.pollLast();
            deque.addLast(arr[end]);
            if(end-start+1<k) end++;
            else if(end-start+1==k) {
                ans.add(deque.peekFirst());
                if(deque.peekFirst()==arr[start]) deque.pollFirst();
                start++;
                end++;
            }
        }
        return ans;
    }
}
