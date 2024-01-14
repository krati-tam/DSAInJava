https://leetcode.com/contest/weekly-contest-380/problems/find-beautiful-indices-in-the-given-array-i/

/*Example 1:

Input: s = "isawsquirrelnearmysquirrelhouseohmy", a = "my", b = "squirrel", k = 15
Output: [16,33]
Explanation: There are 2 beautiful indices: [16,33].
- The index 16 is beautiful as s[16..17] == "my" and there exists an index 4 with s[4..11] == "squirrel" and |16 - 4| <= 15.
- The index 33 is beautiful as s[33..34] == "my" and there exists an index 18 with s[18..25] == "squirrel" and |33 - 18| <= 15.
Thus we return [16,33] as the result.
*/

1. brute force approach - by sorting the elemnets of array 
Suppose example - arr[]= {1,3,2,4,9,10}
                output = 4     Because 1, 2, 3, 4 are in consecutive order and make the largest subsequence.
class Solution {
	public int longestConsecutive(int[] nums) {
		// Your code goes here
     Arrays.sort(nums);
     int res=1;
     int curr =1;
     for(int i=1;i< nums.length;i++)
     {
         if( nums[i]== nums[i-1]+1)
         curr ++;
         else if ( nums[i] !=  nums[i-1])
         {
             res= Math.max(res,curr);
             curr =1;
         }                                                                                                        
     }
return Math.max(res,curr);
	}
}

Time Complexity = O(nlogn)   coz using sorting

2. Hashing Approach 
Set<Integer> h = new HashSet<>();
for(int x:nums)
h.add(x);
int res =1;
for(Integer x:h)
{
    if(h.contains(x-1)==false)
    {
        int curr=1;
        while(h.contains(x+curr))
        curr++;
        res= Math.max(res,curr);
    }
}
return res;
	}                                                                  // There are always 2n(size of array) lookups for at most.
 }                                                                     time c= o(n)
                                                                      space comp =o(n)
