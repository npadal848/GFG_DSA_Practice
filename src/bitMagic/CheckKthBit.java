package bitMagic;

public class CheckKthBit {

	public static void main(String[] args) {

		/*
		 * 011 &100 ==== 100
		 * 
		 */
		int n = 7;
		int k = 3;

//		Method-1
//		if ((n & (1 << (k - 1))) != 0) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}

		/*
		 * 011 -> 000
		 * 		  001
		 * 		=====
		 * 			0
		 * 
		 */
//		Method-2
		if (((n >> (k - 1)) & 1) != 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
