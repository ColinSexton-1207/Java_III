package val;

public interface Graph<V> {
    public int getSize(); // Return the #of vertices in the graph
    public java.util.List<V> getVertices(); // Return the vertices in the graph
    public V getVertex(int index); // Return the object for the specified vertex @index
    public int getIndex(V vert); // Return the index for the specified vertex object
    public java.util.List<Integer> getNeighbors(int index); // Return the neighbors for the specified vertex object
    public void printEdges(); // Print edges of the graph
    public boolean addVertex(V vert); // Add a vertex to the graph
    public boolean addEdge(int u, int v); // Add an edge to the graph
    public boolean addEdge(Edge edg); // Add an edge to the graph
}
