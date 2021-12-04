
package Algorithm;

import Model.Dust;
import Model.Map;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAlgorithm {
    public static void main(String[] args) {
        //int m[][] = {{0,0,0,0},{0,2,0,0},{0,0,2,0},{0,0,0,1},{0,1,0,0}};
        
//        for(int i = 0; i < 5; i++)
//        {
//            System.out.println("");
//            for(int j = 0; j < 5; j++)
//                System.out.print(m[i][j] + " ");
//        }
        
//        BFS spbcbfs = new BFS();
//        List<Point> listBFS = spbcbfs.getShortestPath(m.getM(), new Point(0, 0), new Point(9,9));
//        
//        for(Point p : listBFS) System.out.println(p.toString());
        
//        System.out.println("=======================");
//        
        AStarPathFinding as = new AStarPathFinding();
//        List<Point> listAStar = as.getShortestPath(m.getM(), new Point(0, 0), new Point(9,9));
//        
//        for(Point p : listAStar) System.out.println(p.toString());

//        DustInfo di1 = new DustInfo(0, 0, 5);
//        DustInfo di2 = new DustInfo(0, 0, 3);
//        DustInfo di3 = new DustInfo(0, 0, 7);
//        DustInfo di4 = new DustInfo(0, 0, 1);
//        DustInfo di5 = new DustInfo(0, 0, 10);
//        
//        List<DustInfo> liDI = new ArrayList<>();
//        liDI.add(di1);
//        liDI.add(di2);
//        liDI.add(di3);
//        liDI.add(di4);
//        liDI.add(di5);
//        
//        Collections.sort(liDI, (a, b) -> a.numSteps - b.numSteps);
//        
//        for(DustInfo di : liDI)
//        {
//            System.out.println(di.numSteps);
//        }
        
//        int m[][] = {{0,0,0,0,2},{0,2,0,2,0},{0,0,2,0,0},{0,0,0,2,0},{0,2,0,0,0}};
//
//        AStarPathFinding as = new AStarPathFinding();
//        List<Point> listAStar = as.getShortestPath(m, new Point(3, 4), new Point(0,0));
//        for(Point p : listAStar) System.out.println(p.toString());
        
//        List<Point> listP = new ArrayList<>();
//        listP.add(new Point(0, 0));
//        listP.add(new Point(1, 0));
//        listP.add(new Point(2, 0));
//        listP.add(new Point(3, 0));
//        listP.add(new Point(4, 0));
//        
//        System.out.println(listP.size());


        Map m = Map.getInstance();
        m.createMap(20, 20, 20, 0);
        m.printMap();
        
        System.out.println("======================================");
//        List<Point> listP = new ArrayList<>();
//        
//        for (int i = 0; i < m.getRow(); i++)
//            for (int j = 0; j < m.getCol(); j++)
//                if(m.getM()[i][j] == 1) listP.add(new Point(i, j));
        
        List<Dust> listD = new ArrayList<>();
        listD.add(new Dust(new Point(0,0)));
        
        for(int i = 0; i < m.getRow(); i++)
        {
            for(int j = 0; j < m.getCol(); j++)
            {
                if(m.getM()[i][j] == 1) listD.add(new Dust(new Point(i,j)));
            }
        }

        AStarSchedule ass = new AStarSchedule(listD);
        //ass.getSchedule();
        
        
        List<Point> lp = ass.getSchedule();
        System.out.println("============ LỊCH ==========================");
        for(Point p : lp) System.out.println(p.toString());
    }
    
    
    
    
    
    
}
    
    //
//    static class DustInfo
//    {
//        int x, y;
//        int numSteps;
//
//        public DustInfo(int x, int y, int numSteps) {
//            this.x = x;
//            this.y = y;
//            this.numSteps = numSteps;
//        }
//        
//    }

