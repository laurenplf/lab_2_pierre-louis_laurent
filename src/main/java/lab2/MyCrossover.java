package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        // your implementation:
        double[] child1 = new double[2];
        double[] child2 = new double[2];
        child1[0] = p1[0];
        child1[1] = p2[1];
        child2[0] = p2[0];
        child2[1] = p1[1];
        children.add(child1);
        children.add(child2);
        return children;
    }
}
