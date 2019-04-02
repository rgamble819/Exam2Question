
public class ExamQDriver {
	
	public static void main(String[] args) 
	{
		Thing<Integer> g = new Thing<Integer>(new Integer(1));
		System.out.print(g.compareTo(new Integer(4)));
	}
	
	
}