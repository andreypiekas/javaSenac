package fundamentos;

public class For {
	public static void main(String[] args) {
		/*
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for(int i = 9; i > 0; i--) {
			System.out.println(i);
		}
		*/
		
		//FOR EM CADEIA
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				//System.out.print("[ "+i+" "+j+" ]");
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
			
		}

	}

}
