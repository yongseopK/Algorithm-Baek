class Solution {
    public int solution(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int strC = Integer.parseInt(strA.concat(strB));
        int strD = Integer.parseInt(strB.concat(strA));
        
        if(strC < strD) {
            return strD;
        } else {
            return strC;
        }
        
    }
}