package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        double MUTATION_RATE = 0.25;

        for (double[] individual : population
             ) {
            for (int i = 0; i < individual.length; i++) {
                if (random.nextDouble() < MUTATION_RATE) {
                    double numToAdd = random.nextDouble();
                    individual[0] += numToAdd - 0.5;
                    if (individual[i] < -5) {
                        individual[i] = -5;
                    }
                    if (individual[i] > 5) {
                        individual[i] = 5;
                    }
                }
            }
        }

        // your implementation:

        //result population
        return population;
    }
}
