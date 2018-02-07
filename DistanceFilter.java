/**
 * Class created as a requirement for Assignment 1. We'll basically create a filter for distance
 * to be applied later on. 
 * 
 * @author (Abraham Ferrero) 
 * @version (16/NOV/2017)
 */
public class DistanceFilter implements Filter 
{
    private Location loc;
    private double disMax;
    
    public DistanceFilter(double lat, double lon, double max){
        loc = new Location(lat,lon);
        disMax = max;
    }
    
    public boolean satisfies(QuakeEntry qe){
        return qe.getLocation().distanceTo(loc) <= disMax;
    }
    
    public String getName(){
        return "DistanceFilter";
    }
}
