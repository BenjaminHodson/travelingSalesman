
package maps;


public class DistanceMetric implements RoadMetric {

    @Override
    public int getMetric(Road r) {
        return r.length;
    }
    
}
