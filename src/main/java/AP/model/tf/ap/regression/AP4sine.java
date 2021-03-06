package AP.model.tf.ap.regression;

import AP.model.tf.ap.APtf;
import org.apache.commons.math3.stat.descriptive.summary.Sum;

/**
 *
 * 4sine problem
 * 
 * @author wiki
 */
public class AP4sine extends APtf {

    double[][] points = new double[][]{{-3.14159,0.},{-3.01336,0.241228},{-2.88514,0.396523},{-2.75691,0.405489},{-2.62868,0.251538},{-2.50045,-0.0323762},{-2.37222,-0.372404},{-2.24399,-0.674671},{-2.11577,-0.852786},{-1.98754,-0.854406},{-1.85931,-0.679317},{-1.73108,-0.383585},{-1.60285,-0.067914},{-1.47463,0.147397},{-1.3464,0.154851},{-1.21817,-0.108797},{-1.08994,-0.640426},{-0.961712,-1.36407},{-0.833484,-2.14261},{-0.705255,-2.80566},{-0.577027,-3.18741},{-0.448799,-3.16557},{-0.320571,-2.69206},{-0.192342,-1.80764},{-0.0641141,-0.636761},{0.0641141,0.636761},{0.192342,1.80764},{0.320571,2.69206},{0.448799,3.16557},{0.577027,3.18741},{0.705255,2.80566},{0.833484,2.14261},{0.961712,1.36407},{1.08994,0.640426},{1.21817,0.108797},{1.3464,-0.154851},{1.47463,-0.147397},{1.60285,0.067914},{1.73108,0.383585},{1.85931,0.679317},{1.98754,0.854406},{2.11577,0.852786},{2.24399,0.674671},{2.37222,0.372404},{2.50045,0.0323762},{2.62868,-0.251538},{2.75691,-0.405489},{2.88514,-0.396523},{3.01336,-0.241228},{3.14159,0.}};
    
    @Override
    protected double getDistance(double[] vector) {

        double sum = 0, a, b;
        double[] distance_array = new double[points.length];
        
        for (int i = 0; i < points.length; i++) {
            a = ap.dsh(vector, new double[]{points[i][0]});
            if(Double.isNaN(a) || Double.isInfinite(a)){
                return Double.MAX_VALUE;
            }
            b = points[i][1];

            distance_array[i] = Math.abs(a-b);
        }
        
        return new Sum().evaluate(distance_array);

    }

    @Override
    public String name() {
        return "AP_4sine_mathematica";
    }

    
}
