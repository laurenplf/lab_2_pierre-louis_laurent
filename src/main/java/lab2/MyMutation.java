package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        double MUTATION_RATE = 0.01;
        for (double[] individual : population
             ) {
            for (int i = 0; i < individual.length; i++) {
                if (random.nextDouble() < MUTATION_RATE) {
                    individual[i] = (random.nextDouble() - 0.5)*10;
                }
            }
        }

        // your implementation:

        //result population
        return population;
    }
}
