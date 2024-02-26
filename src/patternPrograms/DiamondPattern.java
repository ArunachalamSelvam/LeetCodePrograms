package patternPrograms;

public class DiamondPattern {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<=n;j++) {
			
				if(i+j>n && i<=n) {
					System.out.print("* ");
				}
				else if(i>n && i-j<=n) {
					System.out.print("* ");
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				
				if(i+j==n/2 || i+j <= n-1 && j>i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		 // Upper Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        // Lower Triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
