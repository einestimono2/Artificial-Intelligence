
package Algorithm;

import Model.Dust;

public class Node implements Comparable<Node>{

    public int[] path;
    public int gCost, fCost;
    public Dust d;
    public int index;

    public Node(int[] path, int gCost, int fCost, Dust d, int index) {
        this.path = path;
        this.gCost = gCost;
        this.fCost = fCost;
        this.d = d;
        this.index = index;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.fCost, o.fCost);
    }
    
    
    
    
}
