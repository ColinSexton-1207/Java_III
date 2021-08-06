package val;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AbstractGraph<V> {
    protected List<V> vertices = new ArrayList<>();
    protected List<List<Edge>> neighbors = new ArrayList<>();

    // Construct a graph from vertices and edges stored in arrays
    public AbstractGraph(V[] vertices, int[][] edges) {
        for(V vertex : vertices) addVertex(vertex);

        createAdjacencyLists(edges, vertices.length);
    }

    // Create an adjacency list for each vertex
    private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
        for(int[] edge : edges) addEdge(edge[0], edge[1]);
    }

    // Create an adjacency list for each vertex
    private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
        for(Edge edge: edges)
            addEdge(edge.u, edge.v);
    }

    // Return the #of vertices in the graph
    public int getSize() { return vertices.size(); }

    // Return the vertices in the graph
    public List<V> getVertices() { return vertices; }

    // Return the object for the specified vertex @index
    public V getVertex(int index) { return vertices.get(index); }

    // Return the index for the specified vertex object
    public int getIndex(V vert) { return vertices.indexOf(vert); }

    // Return the neighbors for the specified vertex object
    public List<Integer> getNeighbors(int index) {
        List<Integer> result = new ArrayList<>();

        for(Edge edg: neighbors.get(index))
            result.add(edg.v);

        return result;
    }

    // Print edges of the graph
    public void printEdges() {
        for(int u=0; u < neighbors.size(); u++) {
            System.out.print(getVertex(u) + " (" + u + "): ");
            for(Edge edg: neighbors.get(u)) {
                System.out.print("(" + getVertex(edg.u) + ", " + getVertex(edg.v) + ") ");
            }
            System.out.println();
        }
    }

    // Add a vertex to the graph
    public boolean addVertex(V vert) {
        if(!vertices.contains(vert)) {
            vertices.add(vert);
            neighbors.add(new ArrayList<Edge>());
            return true;
        }
        else return false;
    }

    // Add an edge to the graph
    protected boolean addEdge(Edge edg) {
        if(edg.u < 0 || edg.u > getSize()-1)
            throw new IllegalArgumentException("No such index: " + edg.u);
        if(edg.v < 0 || edg.v > getSize()-1)
            throw new IllegalArgumentException("No such index: " + edg.v);

        if(!neighbors.get(edg.u).contains(edg)) {
            neighbors.get(edg.u).add(edg);
            return true;
        }
        else return false;
    }

    // Add an edge to the graph
    public boolean addEdge(int u, int v) { return addEdge(new Edge(u, v)); }

    public SearchTree dfs(int v) {
        List<Integer> searchOrder = new ArrayList<>();
        int[] parent = new int[vertices.size()];

        Arrays.fill(parent, -1);

        boolean[] isVisited = new boolean[vertices.size()];

        dfs(v, parent, searchOrder, isVisited);

        return new SearchTree(v, parent, searchOrder);
    }

    public void dfs(int v, int[]parent, List<Integer> searchOrder, boolean[] isVisited) {
        searchOrder.add(v);
        isVisited[v] = true;

        for(Edge e: neighbors.get(v)) {
            int w = e.v;
            if(isVisited[w]) {
                parent[w] = v;
                dfs(w, parent, searchOrder, isVisited);
            }
        }
    }

    public class SearchTree {
        private int root;
        private int[]parent;
        private List<Integer> searchOrder;

        public SearchTree(int root, int[] parent, List<Integer> searchOrder) {
            this.root = root;
            this.parent = parent;
            this.searchOrder = searchOrder;
        }

        public int getRoot() { return root; }

        public int getParent(int v) { return parent[v]; }

        public List<Integer> getSearchOrder() { return searchOrder; }

        public int getNumberOfVerticesFound() { return searchOrder.size(); }

        public List<V> getPath(int index) {
            ArrayList<V> path = new ArrayList<>();

            do {
                path.add(vertices.get(index));
                index = parent[index];
            } while(index != -1);

            return path;
        }

        public void printPath(int index) {
            List<V> path = getPath(index);
            System.out.print("A path from " + vertices.get(root) + " to " + vertices.get(index) + ": ");

            for(int i = path.size() -1; i >= 0; i--) {
                System.out.print(path.get(i) + " ");
            }
        }
    }
}
