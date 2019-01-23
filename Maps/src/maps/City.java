
package maps;

import java.util.ArrayList;


public class City implements Comparable<City> {

    String name;
    int x;
    int y;
    public ArrayList<Road> Roads = new ArrayList<>();
    int idnum;
    public City previous;
    public double minDistance = Double.POSITIVE_INFINITY;

    public City(String SetName, int SetX, int SetY, int id) {
        name = SetName.trim();
        x = SetX;
        y = SetY;
        idnum = id;

    }
    
    public void addRoad(Road road){
        Roads.add(road);
    }

    /**
     *
     * @return
     * Returns the ArrayList of roads in the constructor.
     */
    public ArrayList<Road> getRoads(){
        return Roads;
    }

   public void PrintRoads(){
       for(int i = 0; i < Roads.size();i++){
           System.out.println(Roads.get(i).toString());
           
       }
   }

    public String toString() {
        return name + " is at (" + x +", " + y + ")";
    }
    
    public String getName(){
        return name;
    }
    public int compareTo(City other){
        return Double.compare(minDistance, other.minDistance);
    }

}
