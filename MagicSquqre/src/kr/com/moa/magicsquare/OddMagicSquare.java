package kr.com.moa.magicsquare;

public class OddMagicSquare {

	
	protected int n;

	protected int magicArray[][];
	
	/**
	 * 마방진 배열 생성입력 받은 n사이즈 만큼의 배열을 만든다
	 */
	protected void makeMagicSquare() {
		magicArray=new int[this.n][this.n];
		int k=1;
		for (int i = 0; i < magicArray.length; i++) {
			for (int j = 0; j < magicArray[i].length; j++) {
				magicArray[i][j]=k++;
			}
		}
	}
	/**
	 * 마방진 출력
	 */
	public void printSquare() {
		System.out.println("~~~magic~~~["+n+"]열  마방진");

		try {
			if(magicArray==null) {
				System.out.println("size is zero");
				return;
			}
			
			for (int i = 0; i < magicArray.length; i++) {
				for (int j = 0; j < magicArray[i].length; j++) {
					System.out.print(magicArray[i][j]+"\t");
				}
				System.out.println();
			}
		}finally {
			System.out.println("~~~magic~~~");
		}
	}

	public void setSize(int i) {
		this.n=i;
	}
	public boolean isValidate() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
