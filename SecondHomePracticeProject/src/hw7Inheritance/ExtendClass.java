package hw7Inheritance;

public class ExtendClass {
	// File: Dog.java (Updated)
	
	public class Dog extends Mammal {
	    public void dogInfo() {
	        System.out.println("This method is from Dog Class");
	    }
	}

	// File: BullDog.java (Updated)
	
	public class BullDog extends Dog {
	    public void bullDogInfo() {
	        System.out.println("This method is from BullDog Class");
	    }
	}

	// File: Snake.java (Updated)
	
	public class Snake extends Reptile {
	    public void snakeInfo() {
	        System.out.println("This method is from Snake Class");
	    }
	}

	// File: Cobra.java (Updated)
	
	public class Cobra extends Snake {
	    public void cobraInfo() {
	        System.out.println("This method is from Cobra Class");
	    }
	}

	// File: Birds.java (Updated)
	
	public class Birds extends Animal {
	    public void birdsInfo() {
	        System.out.println("This method is from Birds Class");
	    }
	}

	// File: Robin.java (Updated)
	
	public class Robin extends Birds {
	    public void robinInfo() {
	        System.out.println("This method is from Robin Class");
	    }
	}

	// File: Mammal.java (Updated)
	

	public class Mammal extends Animal {
	    public void mammalInfo() {
	        System.out.println("This method is from Mammal Class");
	    }
	}

	// File: Reptile.java (Updated)
	
	public class Reptile extends Animal {
	    public void reptileInfo() {
	        System.out.println("This method is from Reptile Class");
	    }
	}
}