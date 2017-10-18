
public class Project {
	
	String [][] str;

	public Project(String[][] str) {
		this.str= str;
		
	}

	public boolean isWellSorted(String[] sequence){ 
		if (sequence.length <= 3 ){return false;}
		
		for (int i=1; i<sequence.length - 1; i++){ 
		          if (sequence[i].compareTo(sequence[i+1]) >= 0) return false; 
		} 
		return true; 
		  } 
}