package generics;

public class Dog implements Animal{

	private String name;
	private String breed;
    private String owner;
    
    public Dog(String name, String breed, String owner) {
		super();
		this.name = name;
		this.breed = breed;
		this.owner = owner;
	}

    
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", owner=" + owner + "]";
	}


	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "This is a dog eating.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}


	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "This is a dog drinking.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}


	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "This is a dog running.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}


	
	

}
