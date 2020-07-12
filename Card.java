package Week6package;

public class Card {
	public int value;
	public String name;
	public Card (String name, int value) {
		this.name = name; 
		this.value = value; 
	}
	public int getValue () {
		return value; 
}
	public void setValue (int value) {
		this.value = value; 
	}
	public String getname() {
		return name; 
	}
	public void setName (String name) {
		this.name = name;
	}
	public String describe() { 
		return Card.class.getSimpleName() + "Name= " + name + ", value = " + value; 
	}
}


	


