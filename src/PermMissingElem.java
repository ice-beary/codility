import java.util.Arrays;

public class PermMissingElem {
	public int solution(int[] A) {
		if (A == null || A.length == 0) {
			return 1;
		}

		Arrays.sort(A);

		if (A[0] != 1) {
			return 1;
		}

		if (A[A.length - 1] != A.length + 1) {
			return A.length + 1;
		}

		for (int i = 0, cnt = A.length; i < cnt; i++) {
			if (i < cnt - 1 && A[i] + 1 != A[i + 1]) {
				return A[i] + 1;
			}
		}

		return A.length + 1;
	}
}
