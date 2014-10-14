
public class asd {

	public static int someFun(int n){
		if (n<=0){
			return 2;
		}
		else{
			return someFun(n-1) * someFun(n-1);
		}
	}
	
	public static void main(String[] args){
		System.out.println("1");
		System.out.println(someFun(0));
		System.out.println(someFun(1));
		System.out.println(someFun(2));
		System.out.println(someFun(3));
		System.out.println(someFun(4));
	}
}
