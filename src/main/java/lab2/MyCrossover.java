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
        double[] child1 = new double[p1.length];
        double[] child2 = new double[p1.length];
        if (random.nextDouble() < 0.5) {
            if (random.nextDouble() < 0.5) {
                for (int j = 0; j < (p1.length - 1) / 2; j++) {
                    child1[2 * j] = p1[2 * j];
                    child2[2 * j] = p2[2 * j];
                }
                for (int j = 1; j < p1.length / 2; j++) {
                    child1[2 * j - 1] = p2[2 * j - 1];
                    child2[2 * j - 1] = p1[2 * j - 1];
                }
            } else {
                for (int j = 0; j < (p1.length - 1) / 2; j++) {
                    child2[2 * j] = p1[2 * j];
                    child1[2 * j] = p2[2 * j];
                }
                for (int j = 1; j < p1.length / 2; j++) {
                    child2[2 * j - 1] = p2[2 * j - 1];
                    child1[2 * j - 1] = p1[2 * j - 1];
                }
            }
        } else {
            int remaining = p1.length/2;
            int index = i;
            for (int j = 0 ; j < p1.length ; j++) {
                if (remaining > 0) {
                    child1[index] = p1[index];
                    child2[index] = p2[index];
                } else {
                    child1[index] = p2[index];
                    child2[index] = p1[index];
                }

                index++;
                index = index%p1.length;
                remaining--;
            }
        }
        children.add(child1);
        children.add(child2);
        return children;
    }
}
