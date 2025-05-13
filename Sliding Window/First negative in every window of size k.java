class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        
        int start=0;
        int end=0;
        
        while(end<arr.length) {
            if(arr[end]<0) list.add(arr[end]);
            if(end-start+1<k) end++;
            else if(end-start+1==k) {
                if(list.isEmpty()) ans.add(0);
                else {
                    ans.add(list.get(0));
                    if(arr[start]==list.get(0)) list.remove(0);
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}
