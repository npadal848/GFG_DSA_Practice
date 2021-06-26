package stack;

public class LargestRectangularAreaInAHistogramPart1 {

	public static void main(String[] args) {
		int[] histogram1 = { 6, 2, 5, 4, 1, 5, 6 };
		int[] histogram2 = { 2, 5, 1 };
		
		System.out.println(largestRectangularArea1(histogram1));
		System.out.println(largestRectangularArea1(histogram2));
	}

	static int largestRectangularArea1(int[] histogram) {
		int largestArea = 0;
		for (int i = 0; i < histogram.length; i++) {
			int currArea = histogram[i];
			for (int j = i - 1; j >= 0; j--) {
				if (histogram[j] >= histogram[i])
					currArea += histogram[i];
				else
					break;
			}
			for (int j = i + 1; j < histogram.length; j++) {
				if (histogram[j] >= histogram[i])
					currArea += histogram[i];
				else
					break;
			}
			largestArea = Math.max(largestArea, currArea);
		}
		return largestArea;
	}
}
