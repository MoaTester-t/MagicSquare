package kr.com.moa.magicsquare;

public class OddMagicSquare {

	int magicSquareSize = 0;
	int magicSquare[][] = new int[this.magicSquareSize][this.magicSquareSize];
	
	void setSize(int _n) {
		this.magicSquareSize = _n;
	}
	
	void makeMagicSquare() {
		
		int count = startPoint();
		
		magicSquare[arrI][arrJ] = count++;
		
		while(!isFinish()) {
			if(isMoveEmpty()) {
				count = move();
			}
			else if(isMoveUpEmpty()) {
				break;
			}
			else {
				
				count = moveUp();
			}
//			if (magicSquare[(arrI+1) % magicSquareSize][(arrJ+1) % magicSquareSize] == 0) {
//				
//				arrI = arrI % magicSquareSize;
//				arrJ = arrJ % magicSquareSize;
//				
//				magicSquare[++arrI][++arrJ] = count++;
//			}
//			else {
//				arrI--;
//				if (arrI == -1) {
//					arrI = magicSquareSize - 1;
//				}
//				if(magicSquare[arrI][arrJ] != 0) {
//					break;
//				}
//				magicSquare[arrI][arrJ] = count++;
//			}
		}
		initArr();
		
	}
	
	protected void initArr() {
		
		for (int i= 0; i < this.magicSquareSize; i++) {
			for(int j = 0; j < this.magicSquareSize; j++) {
				this.magicSquare[i][j] = 0;
			}
		}	
	}
	
	private void startPoint() {
		this.arrI = magicSquareSize - 1;
		this.arrJ = magicSquareSize / 2;
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
