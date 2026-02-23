// Input: text1 = "abcde", text2 = "ace" 
// Output: 3


    // dekho ham dono string me traverse karenge or check karenge ki kya dono character same he hi ki nhi 
    // agar character same he to ham i+1 and j+1  ke liye call karenge warna maximum of dusre character ke liye check 
// ********************************Recursion******************************************
    // public int longestCommonSubsequence(String text1, String text2) {
    //     return lcs(text1,text2,0,0); 

    // }
    // private int lcs(String a,String b, int i,int j){
    //     if(i==a.length() || j== b.length()){
    //         return 0;
    //     }
    //     if(a.charAt(i) == b.charAt(j)){
    //         return 1+ lcs(a,b,i+1,j+1);
    //     }
    //     return Math.max(lcs(a,b,i+1,j), lcs(a,b,i,j+1));
    // } 

// ****************************Memoization**************************************************
//Rule 1 :: hamare jitne variable change honge ham utne dimension ka array banayenge apna result store karne ke liye 
    
//     public class Solution {
//     private int[][] t;

//     public int LCS(String s1, String s2, int m, int n) {
//         if (m == 0 || n == 0)
//             return t[m][n] = 0;

//         if (t[m][n] != -1)
//             return t[m][n];

//         if (s1.charAt(m - 1) == s2.charAt(n - 1))
//             return t[m][n] = 1 + LCS(s1, s2, m - 1, n - 1);

//         return t[m][n] = Math.max(LCS(s1, s2, m, n - 1), LCS(s1, s2, m - 1, n));
//     }

//     public int longestCommonSubsequence(String text1, String text2) {
//         int m = text1.length();
//         int n = text2.length();

//         t = new int[m + 1][n + 1];
//         for (int[] row : t) {
//             Arrays.fill(row, -1);
//         }

//         return LCS(text1, text2, m, n);
//     }
// }
// ******************************Botton-Up******************************************************
class Solution{
    public int longestCommonSubsequence(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i =1 ; i<= m ; i++){
            for(int j = 1 ; j<= n ; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1] ;
                }
                else{
                     dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
