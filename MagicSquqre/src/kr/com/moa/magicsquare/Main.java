package kr.com.moa.magicsquare;

public class Main {

	public static void main(String[] args) {

		OddMagicSquare magicSquare=new OddMagicSquare();
	
		magicSquare.setSize(9);
		
		magicSquare.makeMagicSquare();
		
		magicSquare.printSquare();
		
		boolean isT=magicSquare.isValidate();
		
		System.out.println("validate:"+isT);
		
		
	}

}
