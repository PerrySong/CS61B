package note;

public class Student {
	private Name name;
	private int id;
    
	public Student(Name name, int id) {
		this.name = name;
		this.id = id;
    }
		
	public Name getName() {
		return this.name;
	}
	
	public void setLastName() {
		this.name = new Name("ROCK", "you");
	}
    


	public static void main (String[] args) {
		Name n = new Name("Bob", "Jones");
        int id = 1234;
        Student s = new Student(n, id);
        
        //change the last name
        Name curname = s.getName();
        curname.setLast("Smith");
        s.setLastName();
		System.out.println(s.getName().getName());
		System.out.println(n.getName());
	}
}