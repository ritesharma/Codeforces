package Educational_Cf76;

import java.io.*;
import java.util.*;

public class test {

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static int wt[][];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
	static int dp[];

	public static void main(String[] args) throws IOException {

		int t = 1;//sc.nextInt();
		while (t-- > 0) {

		
	
		ArrayList<Integer>fr=new ArrayList<>();
		ArrayList<Integer>to=new ArrayList<>();
		ArrayList<Integer>wt=new ArrayList<>();
		
		int nod=sc.nextInt();
		int ed=sc.nextInt();
		for(int i=0;i<ed;i++) {
			int f=sc.nextInt();
			int too=sc.nextInt();
			int wet=sc.nextInt();
			
			fr.add(f);
			to.add(too);
			wt.add(wet);
		}
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println(minCostPath(nod,fr,to,wt,x,y));
			
		}
		System.out.println(out);
	}

	static int res = Integer.MAX_VALUE;
	
	public static int minCostPath(int gNodes, ArrayList<Integer> gFrom, ArrayList<Integer> gTo, 
			ArrayList<Integer> gWeight,int x,int y) {
		
		
		int nodes[][]=new int[gFrom.size()][3];
		
		for(int i=0;i<gFrom.size();i++) {
			int fr=gFrom.get(i);
			
			int to=gTo.get(i);
			int wt=gWeight.get(i);
			nodes[i][0]=fr;
			nodes[i][1]=to;
			nodes[i][2]=wt;
			
		}
		
		 int ans=getMinPath(nodes,gNodes,x,y);
		 
		 return ans;
	}

	private static int getMinPath(int[][] nodes, int numOfNodes, int x, int y) {
		res = Integer.MAX_VALUE;
		Set<Integer> visited = new HashSet<>();
		Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
		for(int[] n : nodes) {
			map.putIfAbsent(n[0], new HashMap<>());
			map.putIfAbsent(n[1], new HashMap<>());
			map.get(n[0]).put(n[1], n[2]);
			map.get(n[1]).put(n[0], n[2]);
		}
		dfs(map, visited, x, y, 0, 1,numOfNodes);
		return res;
	}

	private static void dfs(Map<Integer, Map<Integer, Integer>> map, 
			Set<Integer> visited, int x, int y, int tmp, int cur,int nod) {
		if((visited.contains(y) && !visited.contains(x)) || tmp > res)
			return;
		if(cur == nod && visited.contains(x) && visited.contains(y)) {
			res = Math.min(tmp,  res);
			return;
		}
		visited.add(cur);
		for(Map.Entry<Integer, Integer> nei : map.get(cur).entrySet()) {
			if(!visited.contains(nei.getKey())) {
				dfs(map, visited, x, y, tmp + nei.getValue(), nei.getKey(),nod);
			}
		}
		visited.remove(cur);
	}
	
	
}