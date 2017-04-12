package lboury;

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
        
        int monmax=0;
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        List<String[]> myEntries = reader.readAll();
        
        
    }
    
    
}
