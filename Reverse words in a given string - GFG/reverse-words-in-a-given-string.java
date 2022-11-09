//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
       String[] strArray = S.split("\\.");
        String s2="";
        int count = 0;
         for(int i = 0; i < S.length(); i++) {    
            if(S.charAt(i) =='.' ){
                count++;    
            }
        }   
        
        int n =0;
        for(int i = (strArray.length)-1 ; i>=0; i--){
            
        s2=s2+strArray[i];
        if(n<count){
        s2 = s2 + ".";
        n = n +1;
        }
        
        }

        

        return s2;
    }
}