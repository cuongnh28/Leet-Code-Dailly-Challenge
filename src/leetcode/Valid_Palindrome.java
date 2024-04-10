package leetcode;

class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String res= "";
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='a' && str.charAt(i)<= 'z') || (str.charAt(i)>= '0' && str.charAt(i)<= '9') )
            {
                res += str.charAt(i);
            }
        }
        for(int i=0 ; i<(res.length()/2) ;i++)
        {
            if(res.charAt(i) != res.charAt(res.length()-1-i))
                return false;

        }
        return true;
    }
}