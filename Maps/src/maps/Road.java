
package maps;


public class Road {

    City StartCity;
    City EndCity;
    int length;
    int time;
    String name;
    
    public Road(String name, City start, City end, int len, int time){
        this.name = name;
        StartCity = start;
        EndCity = end;
        length = len;
        this.time = time;
        
    }

    public String toString() {
        return "  " +name + " goes to " + EndCity.name + " (" + length + " miles, " + time + " minutes)";
    }

}
