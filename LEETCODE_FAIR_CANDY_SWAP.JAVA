/*
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
*/
/*
Basically we need to equal the sum of these two arrays by swapping one of element from both array,
Lets's Suppose sum of aliceSizes is SumA and sum of bobSizes is SumB
So we have to do the follow
    SumA-x+y = SumB +x-y
    
    where x is candies given by alice
    and y is candies given by bob
    
    As it is mentioned in question that they both have to excahnge some thing in order to have equal balance , Hence x and y always exists in the ans
   **SumA -x +y = SumB +x-y
   SumA-SumB = 2x - 2y
  (SumA-SumB)/2 = x-y ------------------------- equation 1
   ** 
    Now problem is reduced to finding x and y where they follow eq. 1
*/
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sa=0,sb=0;
        for(int i=0;i<A.length;i++)
            sa+=A[i];
        for(int i=0;i<B.length;i++)
            sb+=B[i];
        int diff=(sa-sb)/2;
        for(int i=0;i<A.length;i++)
            for(int j=0;j<B.length;j++)
                if(A[i]-B[j]==diff)
                    return new int[]{A[i],B[j]};
        return null;
    }
}
