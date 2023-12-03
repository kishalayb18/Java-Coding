class Solution {
     String longestCommonPrefix(String[] strs) {
        
        String p="", p1="";
        int i=0;
        
        if(strs.length>200 || strs.length<1)
        {
            return "";
        }
        if(strs[0].length()>200 || strs[1].length()>200)
        {
            return "";
        }
        
        int m= Math.min(strs[0].length(), strs[1].length());
        
        
        for(i=0;i<m;i++){
            
            if(strs[0].charAt(i)==strs[1].charAt(i)){
                p=p+strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        
        if(p==""){
            return p;
        }
        
        for(i=2;i<strs.length;i++){
            
            if(strs[i].length()>200)
            {
                return "";
            }
        
            for(int j=0;j<p.length();j++){
                
                if(p==""){
                    return p;
                }

                if(strs[i].charAt(j)==p.charAt(j)){
                    p1=p1+strs[i].charAt(j);
                }
                else{
                    p=p1;
                    p1="";
                }
            }
        }
        return p;
        
    }
}

class LongestPrefix{
	public static void main (String args[]) {
		Solution ob = new Solution();
		String arr[] = {"dog","doracecar","docar"};
		System.out.println (ob.longestCommonPrefix(arr));
	
	}
}