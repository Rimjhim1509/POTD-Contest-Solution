
//  TC : O(n+m)
//SC : O(n+m) in worst Case 
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> store = new HashSet<>();
        for(int nums : a){
            store.add(nums);
        }
        for(int nums : b){
            store.add(nums);
        }
        
        return new ArrayList<>(store) ;
    }
}
