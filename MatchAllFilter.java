import java.util.*;
import edu.duke.*;
/**
 * This class is part of Assignment 2 requirements.
 * 
 * @author (Abraham Ferrero) 
 * @version (16/NOV/2017)
 */
public class MatchAllFilter implements Filter{
    private ArrayList<Filter> matchAll;
    
    public MatchAllFilter(){
        matchAll = new ArrayList<Filter>();
    }
    
    public void addFilter(Filter fe){
        matchAll.add(fe);
    }
    
    public boolean satisfies(QuakeEntry qe){
        for(Filter fe: matchAll){
            if(!fe.satisfies(qe)){
                return false;
            }
        }
        return true;
    }
    
    public String getName(){
        ArrayList<String> nameAll = new ArrayList<String>();
        for (Filter f : matchAll){
            nameAll.add(f.getName());
        }
        String New = "";
        for (int i=0; i< nameAll.size(); i++){
            New = New + " " + nameAll.get(i);
        }
        return New ;
    }
}
