
/**
 * Class created as a requirement for Assignment 1.
 * 
 * @author (Abraham Ferrero) 
 * @version (16/NOV/2017)
 */
public class MagnitudeFilter implements Filter 
{
    private double magMin;
    private double magMax;
    
    public MagnitudeFilter(double min, double max){
        magMin = min;
        magMax = max;
    }
    
    public boolean satisfies(QuakeEntry qe){
        return qe.getMagnitude() >= magMin && qe.getMagnitude() <= magMax;
    }
    
    public String getName(){
        return "MagnitudeFilter";
    }
}
