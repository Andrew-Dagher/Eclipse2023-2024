import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		
		ArrayList<String> animals  = new ArrayList<>();
		
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		
		animals.remove("Cow");
		animals.remove(0);
		// removing "Cow" will move "Cat" to index 0 and "Dog" to index 1;
		// removing index 0 will then remove "Cat" and bring Dog to index 0;
		

		for (String ANIMALS : animals) {
			
			System.out.println("the animals are: " + ANIMALS);
		}
		
		System.out.println(animals.get(0));
	}

}
