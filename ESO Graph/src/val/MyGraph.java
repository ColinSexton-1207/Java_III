package val;

import java.util.List;
import java.util.ArrayList;

public class MyGraph<V> extends AbstractGraph<V>{
    // Constructs a graph from edges/vertices stored in arrays
    public MyGraph(int[][] edges, V[] vertices) {
        super(vertices, edges);
    }

    public List<List<Integer>> getConnectedComponents() {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> vertexIndices = new ArrayList<>();
        for (int i = 0; i < vertices.size(); i++)
            vertexIndices.add(i);

        while (vertexIndices.size() > 0) {
            SearchTree tree = dfs(vertexIndices.get(0));
            list.add(tree.getSearchOrder());
            vertexIndices.removeAll(tree.getSearchOrder());
        }

        return list;
    }

}
