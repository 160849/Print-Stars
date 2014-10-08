
public class PrintStars {
	
	public static void printStars(int a){//prints the stars in ascending order using iterations
		for (int i=1; i<=a; i++){
			for (int k = 1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
			}
		}
	
	public static void printStarsB(int a){//prints stars in descending order using iterations.
		for (int i=a; i>=1; i--){
			for (int k = 1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
			}
		}
	static int b = 1;
	
	public static void printStarsRB(int a){//prints stars in descending order using recursions
		if (a==b){
			if (a>=1){
			System.out.println("*");
			b=0;
			printStarsRB(a-1);
			}
		}else{
			if (b!=0){
			System.out.print("*");
			b++;
			printStarsRB(a);
		}
			else {
				b++;
				printStarsRB(a);
			}
		}
		
	}

	static int c=1;
		public static void printStarsR(int a){//prints stars in ascending order using recursions.
		 if (a>c){
			if (b<c){
				System.out.print("*");
				b++;
				printStarsR(a);
			}
			if (b==c){
				System.out.print("*");
				System.out.println();
				c++;
				b=1;
				printStarsR(a);
			}
		}if (a==c){
			if (b<c){
			System.out.print("*");
			b++;
			printStarsR(a);
			}
		}
	}



	public static void main(String[] args){
		printStars(4);
		printStarsB(4);
		System.out.println();
		printStarsR(4);
		printStarsRB(4);
	}

}

