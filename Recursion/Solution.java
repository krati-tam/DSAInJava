package recursion;
        import java.util.ArrayList;
		import java.util.List;

		    class Main {
		        static class Solution {
		            List<String> finalList=new ArrayList<>();
		            List<Character> curList=new ArrayList<>();

		            public void recur(int index, int n,int sum){
		                if(index==n){
		                    if(sum==0){
		                        finalList.add(curList.toString());
		                        return;
		                    }
		                }
		                curList.add('(');
		                recur(index+1,n,sum+1);
		                int curListIndex=curList.size()-1;
		                curList.remove(curListIndex);

		                if(sum>0){
		                    curList.add(')');

		                    recur(index+1,n,sum-1);
		                    int curListIndexB=curList.size()-1;
		                    curList.remove(curListIndexB);
		                }
		            }
		            public List<String> generateParenthesis(int n) {
		                recur(0,n,0);
		                return finalList;
		            }
		        }

		        public static void main(String args[]) {
		            Solution solution = new Solution();
		            System.out.println(solution.generateParenthesis(3));
		        }
		    }

