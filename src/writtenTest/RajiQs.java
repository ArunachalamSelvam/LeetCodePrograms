package writtenTest;

public class RajiQs {
	
	public static void pattern(int row) {
		int odd=1,even=2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i==j) {
					System.out.print(0 +"\t");
				}
				else if(j<i) {
					System.out.print(odd +"\t");
					odd+=2;
				}
				else {
					System.out.print(even + "\t");
					even+=2;
				}
			}
			
			System.out.println();
		}
	}
	
	public static void primeWordLength(String s) {
		String[] sArr = s.split("\\s");
		for(String st : sArr) {
			if(isPrime(st.length())) {
				System.out.println(st);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		pattern(6);
		primeWordLength("This is a Java Programming Language.");
	}

}
