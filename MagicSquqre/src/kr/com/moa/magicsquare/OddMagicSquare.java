package kr.com.moa.magicsquare;

public class OddMagicSquare {

	protected int n;

	protected int magicArray[][];

	/**
	 * 마방진 배열 생성입력 받은 n사이즈 만큼의 배열을 만든다
	 */
	protected void makeMagicSquare() {
		magicArray = new int[this.n][this.n];
		int k = 1;
		for (int i = 0; i < magicArray.length; i++) {
			for (int j = 0; j < magicArray[i].length; j++) {
//				magicArray[i][j] = k++;
				magicArray[i][j] =1;
			}
		}
		magicArray[n-1][n-2]=12;
	}

	/**
	 * 마방진 출력
	 */
	public void printSquare() {
		System.out.println("~~~magic~~~[" + n + "]열  마방진");

		try {
			if (magicArray == null) {
				System.out.println("size is zero");
				return;
			}

			for (int i = 0; i < magicArray.length; i++) {
				for (int j = 0; j < magicArray[i].length; j++) {
					System.out.print(magicArray[i][j] + "\t");
				}
				System.out.println();
			}
		} finally {
			System.out.println("~~~magic~~~");
		}
	}

	public void setSize(int i) {
		this.n = i;
	}

	public boolean isValidate() {

		int index = 0;
		int temp = 0;
		int arr[] = new int[this.n + this.n];
		for (int i = 0; i < this.n; i++) {
			temp = 0;
			for (int j = 0; j < this.n; j++) {

				temp += magicArray[i][j];
			}
			arr[index++] = temp;
		}

		for (int j = 0; j < this.n; j++) {
			temp = 0;
			for (int i = 0; i < this.n; i++) {

				temp += magicArray[j][i];
			}
			arr[index++] = temp;
		}

		for (int i = 1; i < this.n*2; i++) {
			if (arr[i - 1] != arr[i]) {
				return false;
			}
		}
		return true;
	}

}
