package lboury;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import java.util.Iterator;
import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
	public int max(int a, int b)
    {
    	return a>b?a:b;
		//return a;//le stagiaire
    }
	
	public static void main( String[] args )
    {
        System.out.println( "Bonjour Monde !" );
        App monApp = new App();
        System.out.println(monApp.max(4,5));
        
        int monmax = 0;
        CSVReader reader = null;
        List<String[]> myEntries = null;
        String[] entree = null;
       	List list       = null;
      	Vector<String> out = null;
        try
        {
            reader = new CSVReader(new FileReader("data.csv"));
        }
        catch (java.io.FileNotFoundException ex)  
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            myEntries = reader.readAll();
        }
        catch (java.io.IOException e)
        {
            System.out.println(e.getMessage());
        }
        Iterator<String[]> iterator = myEntries.iterator();
        iterator.next();
        
                
        while(iterator.hasNext())
        {
           	entree = iterator.next();
           	list       = Arrays.asList(entree);
          	out = new Vector<String>();
           	Predicate predicat = new Predicate()
           	{
           	    public boolean evaluate(Object object)
           	    {
           	    	try
           	    	{
           	    		return Integer.parseInt((String) object) > 50;
           	    	}
           	    	catch (java.lang.NumberFormatException e)
           	    	{
           	    		return false;
           	    	}
           	    }
           	};
           	CollectionUtils.select(list, predicat, out);
            System.out.println("out:" + out);
        }
    }
    
    
}
