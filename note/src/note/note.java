package note;

public class note {
	Name[] names = new Name[5];//have a class: Name //create 5 space but no Name object.
	
	names[0] = new Name("Bob", "Smith");
	System.out.printLn(names[0].getFirstName());
	names[1] = new Name("Bob1", "Smith1");
	names[2] = new Name("Bob2", "Smith2");
	names[3] = new Name("Bob3", "Smith3");
	names[4] = new Name("Bob4", "Smith4");
	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i].getFirstName());
	}
}

public class NumberList {
	private int[] numbers;
	private int count;
	
	public NumberList() {
		this.numbers = new int[10];
		this.count = 0;
	}
	public void addFirst(int newNumber) {
		//if list is full, resize
		if(count == numbers.length) {
			
		}
		//creat a new array of twice the size and copy over all items.
		
		private void resize() {
			//create a new array of twice the size of original
			int[] newArray = new int[count*2];
			
			//copy everything from original into new
			
			for(int i = 0; i < count; i++) {
				newArray[i] = this.numbers[i];
				
			}
			//move numbers reference to this new array
			
		}
		//move all existing items down one slat.
		for(int i = count; i > 0; i--) {
			numbers[i] = numbers[i - 1];
			
		}
		
		//add new item at beginning of the list.
		numbers[0] = newNumber;
		count++;
		
	}
}