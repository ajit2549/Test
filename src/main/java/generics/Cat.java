package generics;

public class Cat implements Animal{
    private String name;
	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", owner=" + owner + "]";
	}

	private String breed;
    private String owner;
    
    public Cat(String name, String breed, String owner) {
		super();
		this.name = name;
		this.breed = breed;
		this.owner = owner;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "This is a cat eating.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "This is a cat drinking.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "This is a cat running.Name: "+this.name+",Breed: "+this.breed+",Owner: "+this.owner;
	}

   

}
