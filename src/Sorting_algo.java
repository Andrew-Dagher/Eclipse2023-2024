
public class Sorting_algo {
	
	public static void main (String[] args) {
//	int[] anArray = {1,7,2,5,2,3};
	
//	for (int i = 0; i < anArray.length; i++) {
//		for (int j = i; j < anArray.length; j++) {
//			if (anArray[i] < anArray[j]) {
//				int temp = anArray[i];
//				anArray[i] = anArray[j];
//				anArray[j] = temp;
//			}
//		}
//	}
//	
//	for (int e : anArray) System.out.print(e);

	int[] example = {11,7,22,3,33,5,50, 0, 20, 100};
	
	for (int i = 0; i < example.length; i++) {
		for (int j = i; j < example.length; j++) {
			if (i % 2 == 0 ) continue;
			if (j % 2 == 0) continue;
			if (example[i] < example[j]) {
				int tempVotes = example[i];
				int tempID = example[i-1];
				example[i] = example[j];
				example[i-1] = example[j-1];
				example[j] = tempVotes;
				example[j-1] = tempID       ;
				
			}
			
		}
	}
	
	for (int e : example) System.out.println(e);
	

}
}
