public class Graph {
    private int vertices;
    private int[][] adjacency_mat;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to){
        this.adjacency_mat[from][to] = 1;
        this.adjacency_mat[to][from] = 1;
    }

    public void display_matrix(){

        // outer loop to iterate through each row
        for (int i = 0; i< adjacency_mat.length; i++){

            // inner loop to iterate through each column under each row
            for (int j=0; j<adjacency_mat[i].length; j++){
                System.out.print( adjacency_mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Implement the functionality to check the connectedness
    public void connectedness(int from, int to) {
        boolean[] visited = new boolean[vertices];
        int[] queue = new int[vertices];
        int front = 0;
        int rear = 0;

        visited[from] = true;
        queue[rear++] = from;

        while (front < rear) {
            int current = queue[front++];

            if (current == to) {
                System.out.println(from + " and " + to + " are connected.");
                return;
            }

            for (int i = 0; i < vertices; i++) {
                if (adjacency_mat[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }

        System.out.println(from + " and " + to + " are not connected.");
    }

    // Implement the functionality to list the adjacent nodes of a given node
    public void adjacent_nodes(int vertex){
        System.out.print("Adjacent nodes of " + vertex + ": ");

        boolean found = false;

        for (int i = 0; i < vertices; i++) {
            if (adjacency_mat[vertex][i] == 1) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        System.out.println();
    }
}
