/**
 * Class created as a requirement for Assignment 1. We'll basically create a filter for depth
 * to be applied later on. 
 * 
 * @author (Abraham Ferrero) 
 * @version (16/NOV/2017)
 */
public class DepthFilter implements Filter 
{
    private double depthMin;
    private double depthMax;
    
    public DepthFilter(double min, double max){
        depthMin = min;
        depthMax = max;
    }
    
    public boolean satisfies(QuakeEntry qe){
        return qe.getDepth() >= depthMin && qe.getDepth() <= depthMax;
    }
    
    public String getName(){
        return "DepthFilter";
    }
}