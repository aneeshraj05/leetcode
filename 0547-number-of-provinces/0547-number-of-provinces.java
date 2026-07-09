class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;

        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    list.get(i).add(j);

                }
            }
        }
        int province=0;
        boolean visited[]=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(visited,list,i);
                province++;
            }
        }

        return province;

        
    }

    public static void dfs(boolean[] visited,List<List<Integer>> list,int city){
        visited[city]=true;
        for(int node:list.get(city)){
            if(!visited[node]){
                            dfs(visited,list,node);

            }
        }
    }
}