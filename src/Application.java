import model.Path;

import java.util.ArrayList;

public class Application {

    public static void main(String args[]) {
        MinCostMaxFlow flow = new MinCostMaxFlow();
        int capacity[][] = {
                {0, 50, 0, 0, 100, 0},
                {0, 0, 70, 30, 0, 0},
                {0, 0, 0, 0, 0, 100},
                {0, 0, 0, 0, 0, 80},
                {0, 0, 0, 0, 0, 100},
                {0, 0, 0, 0, 0, 0}};

        int costWithinCapacity[][] = {
                {0, 10, 0, 0, 30, 0},
                {0, 0, 20, 10, 0, 0},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 40},
                {0, 0, 0, 0, 0, 0}};

        ArrayList<Path> paths = flow.getPaths(capacity, costWithinCapacity, 0, 5);
        for (Path path : paths) {
            path.print(costWithinCapacity);
            System.out.println("--------");
        }

    }
}
