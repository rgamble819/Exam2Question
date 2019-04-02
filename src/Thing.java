
public class Thing<T> implements Comparable<T>{

	T jet;
	
	public Thing(T t) 
	{
		this.jet = t;
	}

	@Override
	public int compareTo(T o) {
		if(o.equals(this)) 
		{
			return 1;
		}
		return -1;
	}
}
