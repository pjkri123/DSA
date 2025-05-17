class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>(); 
        for(char k:pat.toCharArray()) {
            if(map.containsKey(k)) map.put(k,map.get(k)+1);
            else map.put(k,1);
        }
        
        int count=map.size();
        int start=0;
        int end=0;
        int ans=0;
        while(end<txt.length()) {
            if(map.containsKey(txt.charAt(end))) {
                map.put(txt.charAt(end),map.get(txt.charAt(end))-1);
                if(map.get(txt.charAt(end))==0) count--;
            }
            if(end-start+1<pat.length()) end++;
            else if(end-start+1==pat.length()) {
                if(count==0) ans++;
                if(map.containsKey(txt.charAt(start))) {
                    map.put(txt.charAt(start),map.get(txt.charAt(start))+1);
                    if(map.get(txt.charAt(start))==1) count++;
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}
