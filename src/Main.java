public class Main {
    public static void main(String[] args) {

        // Create a class
        Graph g = new Graph (5);

        g.add_edges(0,1);
        g.add_edges(0,3);
        g.add_edges(1,4);
        g.add_edges(0,2);
        g.add_edges(2,3);

        g.display_matrix();
        g.connectedness(0, 4);
        g.connectedness(0, 2);

        g.adjacent_nodes(0);
        g.adjacent_nodes(3);
    }
}
