import java.util.*;
public class Graph {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 3));
        graph[1].add(new Edge(1, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[3].add(new Edge(3, 0, 0));
        // graph[2].add(new Edge(2, 1, 10));
        // graph[3].add(new Edge(3, 1, 0));
        // graph[3].add(new Edge(3, 2, -1));
    }
    //Graph traversal -->
    //1. BFS(Breadth first search)
    public static void BFS(ArrayList<Edge> graph[],int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;
                //add all neighbours of curr in queue -->
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    //DFS(Depth First Search) -->
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, e.dest, vis);
            }
        }
    }
    //QU : Print all paths from src to dest -->
    public static void printAllPaths(ArrayList<Edge> graph[],boolean[] vis,int curr,String path,int tar){
        if(curr == tar ){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printAllPaths(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    //QU : Detect Cycle -->
    public static boolean isCycleDirected(ArrayList<Edge> graph[],int curr,boolean[] vis,boolean[] rec){
        vis[curr] = true;
        rec[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleDirected(graph, e.dest, vis, rec)){
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String args[]){
        int v = 4;//no. of vertex
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        //print all neighbours of 2 -->
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest + " " + e.wt);
        // } 
        //print all neighbours of 1 -->
        // for(int i=0;i<graph[1].size();i++){
        //     Edge e = graph[1].get(i);
        //     System.out.println(e.dest + " " + e.wt);
        // } 
        //BFS -->
        // BFS(graph, v);
        //DFS -->
        boolean vis[] = new boolean[v];
        // dfs(graph, 0, vis);
        int src = 0,tar = 3;
        // printAllPaths(graph, vis, src, " "+src, tar);

        //for directed graph -->
        // System.out.println(isCycleDirected(graph, 0, new boolean[v], new boolean[v] ));
        //For undirected graph -->
        boolean[] rec = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(isCycleDirected(graph, 0, vis, rec)){
                    System.out.println("true");
                    break;
                } 
                else{
                    System.out.println("false");
                }
            }
        }
    }
}
