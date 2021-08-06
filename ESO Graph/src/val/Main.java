package val;

/*
    Author: Colin Sexton
    Project: Lab 7 (Ch. 28 Graphs and Applications)
    To Do:
        Add a vertex - "Murkmire"
        Add two edges - To/From "Murkmire" and "Vulkhel Guard"
 */

public class Main {

    public static void main(String[] args) {

        // Vertices Array (Locations available for paths to exist to/from)
        // Referred to by their index (i.e. vertices[1] = Daggerfall)
        String[] vertices = {"Stros M'Kai", "Daggerfall", "Bleakrock Isle", "Davon's Watch",
                "Khenarthi's Roost", "Vulkhel Guard", "Gold Coast"};

        // Edge Array (available paths between vertices)
        // Referred path by two vertices index (i.e {2,3} = edge of Bleakrock Isle and Davon's Watch)
        int[][] edges ={
                {0,1}, // SM->DF
                {1,0}, {1,3}, {1,5}, {1,6}, // DF->SM, DF->DW, DF->VG, DF->GC
                {2,3}, // BI->DW
                {3,1}, {3,2}, {3,5}, {3,6}, // DW->DF, DW->BI, DW->VG, DW->GC
                {4,5}, // KR->VG
                {5,1}, {5,3}, {5,4}, {5,6}, // VG->DF, VG->DW, VG->KR, VG->GC
                {6,1}, {6,3}, {6,5} // GC->DF, GC->DW, GC->VG
        };

        // Initialize graph of ESO ports and where they connect
        AbstractGraph<String> ESO = new AbstractGraph<>(vertices, edges);

        System.out.println("Number of vertices in the graph: " + ESO.getSize());
        System.out.println("The vertex with index 1 is: " + ESO.getVertex(1));
        System.out.println("The index for Vulkhel Guard is: " + ESO.getIndex("Vulkhel Guard"));
        System.out.println("The edges for the graph:");
            ESO.printEdges();

        MyGraph<String> graph = new MyGraph<>(edges, vertices);
        System.out.println(graph.getConnectedComponents());
    }
}
