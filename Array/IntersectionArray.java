nums1={ 4,9,5}    =n
nums2={9,4,9,8,4}  =m

Brute force Approach :-
  Search every element of nums[1] searching it in second nums[2] array so TC =o(n*m)

  we can use binary search but for applying it we have to sort an array so why not sort the smallest one  O(logn)
  now it will iterate on nums2 and check that n element in second array which is of size m  O(mlogn)

                                                                      TC =O(nogn)+O(mlogn)  

  Two-pointer Approach- 

  My search operation should be fast so use HashSet or HashMap
  if elements should be unique so us HashSet 
  
Convert both the arrays into set1 and set2 and lastly convert set into array
  iterating over second will be O(M) 
  inserting into array is O(1) o(N+m)
  Space Complexity = O( min(n,m))*2
  Most Optimal Solution :- 
    if(m<n)
  swap(nums2,nums1)


  class Solution 
  {
    public int intersection (int []nums1, int []nums2)
    {     
      Set<Integer> set1 = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();

      int n=nums1.length;
      int m=nums2.length;
 for(int i=0;i<n;i++)
    {
        set1.add(nums1[i]);
    }
    for(int i=0;i<m;i++)
    {  if(set1.contains(nums2[i]))
      {
        set2.add(nums2[i]);
    }
        }
        int [] res = new int [set2.size()];
      int i=0;
      for(Integer num: set2)
      {
        res[i++] = num;
      }
      return res;
    }
}
  
