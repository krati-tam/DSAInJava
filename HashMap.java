import java.util.*;



public class DesignHashmap<K> {

	static class HashMap <K,V> {
		private class Node {
			K key;
			V value;
			
	private Node(K key, V value)		
	{
		this.key =key;   
		this.value= value;
	}
		}
		
		private int n;		//n -nodes
		private int N;		//N-buckets
private LinkedList <Node> buckets [];   // N= buckets.length

@SuppressWarnings("unchecked")
public HashMap()
{
	this.N=4;
	this.buckets = new LinkedList[4];
	for(int i=0;i<4;i++) {
		this.buckets[i]= new LinkedList<>(); 
	}
}
private int hashFunction(K key) {     // 0 to N-1
	int bi= key.hashCode();
	return Math.abs(bi) %N ;
}

private int searchInLL(K key, int bi) {
	LinkedList <Node> linkedList=buckets[bi];
	int di=0;
	for(int i=0;i<linkedList.size();i++)
	{
	if(linkedList.get(i).key == key) {
			return i;
		}
	}
	return -1;
}

private void rehash() {
	LinkedList <Node> oldBucket[] = buckets;
	buckets = new LinkedList[N*2];
	
	for(int i=0;i<N*2;i++)
	{ 
	   buckets[i] = new LinkedList<>();
	}
	for(int i=0;i<oldBucket.length;i++)
	{
		LinkedList<Node> linkedList= oldBucket[i];
		for(int j=0;j<linkedList.size();j++)
		{
		Node node = linkedList.get(j);
		put(node.key, node.value);
	}
}
}

public void put (K key, V value) {
	int bi= hashFunction(key);
	int di= searchInLL(key,bi);
	
	if(di==-1) {      //key doesn't exist 
		buckets[bi].add(new Node(key, value));
		n++;
	}
	else {
		Node node = buckets[bi].get(di);
		//data.value = value;
		return node.value;	
		}
	double lambda = (double)n/N;
	if(lambda>2.0) {
	 rehash();	//rehashing 
	}
	}

public V remove(K key)
		{
		int bi= hashFunction(key);
		int di= searchInLL(key,bi);
	
	if(di==-1) 
	{  
	return null;
	}
	  else{
		Node node = buckets[bi].remove(di);
		 return node.value;
              }
	}	
  public V get(K key) {
	int bi= hashFunction(key);
	int di= searchInLL(key,bi);
	
	if(di==-1) 
	{  
	return null;
	}
	  else{
		  Node node = buckets[bi].get(di);
		  return node.value;
              }
        }
		
       public ArrayList<K> keySet(){
		ArrayList<K> keys = new ArrayList<>();
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> linkedList = buckets[i];
			for(int j=0;j<linkedList.size();j++)
			{
				 Node node = linkedList.get(j);
						 keys.add(node.key);
				
			}
		}
	
	
	public boolean isEmpty()
{
		return  n==0;
		}
}
	
public boolean containsKey(K key){
	int bi= hashFunction(key);
	int di= searchInLL(key,bi);
	
	if(di==-1) {      //key doesn't exist 
	return false;
	}
	else
	{
	return true;	//key exists 
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map= new HashMap<>();
map.put("India", 140);
map.put("China", 280);
map.put("USA", 70);
ArrayList<String > keys = map.keySet();
for(int i=0;i<keys.size();i++)
	{
		System.out.println(keys.get(i)+"" +map.get(keys.get(i)));
		
	}
     map.remove(key:"India");
	System.out.println(map.get(key:"India"));	
}
