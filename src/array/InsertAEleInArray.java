package array;

public class InsertAEleInArray {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=2;
		arr[2]=5;
		arr[3]=8;
		
		print(arr);
		print(insert(arr, 20, 0, 5));
	}
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	static int[] insert(int[] arr, int element, int pos, int cap) {
		int n=arr.length-1;
		if(n==cap)
			return arr;
		
		for(int i=n-1; i>=pos; i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=element;
		return arr;
	}
}
