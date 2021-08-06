package val;

public class Edge {
    int u; // Starting vertex of the edge
    int v; // Ending vertex of the edge

    // Construct an edge for (u,v)
    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public boolean equals(Object o) { return u == ((Edge)o).u && v == ((Edge)o).v; }
}
