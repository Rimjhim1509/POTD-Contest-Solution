class Solution {
    public int minDeletionSize(String[] strs) {
        //use matrix traversing
        int rows = strs.length;
        int columns = strs[0].length();
        int count = 0;

        for(int col = 0 ; col< columns; col++){
            for(int row = 0 ; row <rows - 1 ; rows++ ){
                if(strs[row].charAt(col) > strs[row + 1].charAt(col)){
                    count++;
                    break;

                }

            }

        }
        return count ;

    }
}