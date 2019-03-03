package hmJava3.GrokaemAlgoritms.dz.homework7;

public class Main {

    public static void main(String[] args){

        Graph graph = new Graph(10);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(2,6);
        graph.addEdge(3,7);
        graph.addEdge(7,9);
        graph.addEdge(6,8);
        graph.addEdge(8,9);

        System.out.println(graph.getAdjList(1));

        BreadthFirstPath bfp = new BreadthFirstPath(graph,0);

        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));
        System.out.println(bfp.distTo(9));

    }

}
