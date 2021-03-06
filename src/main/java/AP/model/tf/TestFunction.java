package AP.model.tf;

import AP.model.AP_Individual;

/**
 * Basic interface for test functions.
 * TODO: Can be changed if needed.
 * Created by jakub on 27/10/15.
 */
public interface TestFunction {

    double fitness(AP_Individual individual);

    /**
     * Convenience override for fitness(Individiual individual)
     *
     * @param vector
     * @return fitness for given vector
     */
    double fitness(double[] vector);

    void constrain(AP_Individual individual);

    double[] generateTrial(int dim);

    double fixedAccLevel();

    double optimum();

    double max(int dim);

    double min(int dim);
    
    String name();

}
