
public class Students implements Comparable<Students> {

	
String name;
int rollNo;
	
	public Students(String name,int rollNo) {
		
		this.name=name;
		this.rollNo=rollNo;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	
	/*Generate HashCode and Equals*/
	
	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
/*Comparable Interface = CompareTo function compare value next to it*/
	@Override
	public int compareTo(Students that) {
		// TODO Auto-generated method stub
	
		//return this.rollNo - that.rollNo;
	/*this will sort name*/
	return this.name.compareTo(that.name);
	}
	
	
	

}
