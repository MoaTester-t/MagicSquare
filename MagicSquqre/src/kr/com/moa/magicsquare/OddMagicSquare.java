package kr.com.moa.magicsquare;

public class OddMagicSquare {

	int magicSquareSize = 0;
	int magicSquare[][] = new int[this.magicSquareSize][this.magicSquareSize];
	
	void setSize(int _n) {
		this.magicSquareSize = _n;
	}
	
	void makeMagicSquare() {
		
		int arrI = magicSquareSize - 1;
		int arrJ = magicSquareSize / 2;
		int count = 1;
		
		magicSquare[arrI][arrJ] = count++;
		
		while(true) {
			if (magicSquare[arrI+1][arrJ+1] == 0) {
				magicSquare[++arrI][++arrJ] = count++;
			}
			else {
				arrI--;
				if (arrI == -1) {
					arrI = magicSquareSize - 1;
				}
				if(magicSquare[arrI][arrJ] != 0) {
					break;
				}
				magicSquare[arrI][arrJ] = count++;
			}
		}
		initArr();
		
	}
	
	void initArr() {
		
		for (int i= 0; i < this.magicSquareSize; i++) {
			for(int j = 0; j < this.magicSquareSize; j++) {
				this.magicSquare[i][j] = 0;
			}
		}	
	}
	
	void printArr() {
		for (int i= 0; i < this.magicSquareSize; i++) {
			for(int j = 0; j < this.magicSquareSize; j++) {
				System.out.println(magicSquare[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
