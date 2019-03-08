import java.util.Arrays;

public class SortedArray1 {
	private int[] a;

	public SortedArray1(int b[]) {
		a = new int[b.length];
		for (int i = 0; i < b.length; i++)
			a[i] = b[i];

	}

	public void sort() {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}

	@Override
	public String toString() {
		return Arrays.toString(a);
	}
}
