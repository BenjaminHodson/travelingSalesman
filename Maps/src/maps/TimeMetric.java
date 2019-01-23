
package maps;


public class TimeMetric implements RoadMetric {

    @Override
    public int getMetric(Road r) {
        return r.time;
    }
    
}
