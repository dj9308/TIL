package answer;
public class RotationMatrix {
	
	/*
	 * ó���� ����� �������� �� if ���� �ϴ� ���ؼ� �Ϸ� ������ �ʹ� �������� �ȵ�

. ������ ��� ������ ���� ����ϴ��� ���� �ٲ���� ���� ������ ���� �پ���� �ϴ°��� �˾� length-1-i�� �����ϰ� ��

. ���Ʒ� �޿������� �������� �ѹ����������� �ϴϱ� �ȵ� �׷��� j������ �������� ������� ��

. ������ ���� �ŵ��Ҽ��� ���� ���� ó���� �� �� ���� ����.

������ �� ����� : 1. �������ǽ��� �ƴ� ����� �迭���� length-i �������� �ϸ� ���� �ݴ�� ���� ���� �� ����
			2. ���̵��� ���ݸ� �������� ������ ������� ���� ������ ���ذ� �ȵǴ� �� ����.
			���̵��� ���� �������� ���� Ǯ����� �迭�� ���� �� ����Ʈ��  �� �����ϰ� �ȵǸ� �ܿ��� �ؾ��� �� ����.
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] arr2 = new int[10][10];
		int count = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = count++;
			}
		}
		System.out.println(arr[0][1]);
		// rotateMatrix testCase
		printMatrix(arr);
		printMatrix(rotateMatrix(arr));
		printMatrix(arr1);
		printMatrix(rotateMatrix(arr1));
		printMatrix(arr2);
		printMatrix(rotateMatrix(arr2));

		// rotateMatrix1 testCase
		printMatrix(arr);
		printMatrix(rotateMatrix1(arr));
		printMatrix(arr1);
		printMatrix(rotateMatrix1(arr1));
		printMatrix(arr2);
		printMatrix(rotateMatrix1(arr2));

	}

	// ���簢�� �迭�� �ð�������� ��ĭ�� �̵�
	// ���⸦ �����ϼ��� :)
	public static int[][] rotateMatrix(int[][] arr) {
		int[][] result = new int[arr.length][arr[0].length];
		int limitIndex = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = i; j < limitIndex - i; j++) {
				if(j==i && i<arr.length-1) {
					result[i][j] =arr[i+1][j];
				}
				else if()
				
			}
		}
		return result;
	}

	// ���簢�� �迭�� Ȧ����° ���� �ݽð����, ¦����° ���� �ð�������� ��ĭ�� �̵�
	// ���⸦ �����ϼ��� :)
	public static int[][] rotateMatrix1(int[][] arr) {
		int[][] result = new int[arr.length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if(i==j && i%2==1) {
					if(i==0) {
						result[i][j]=arr[i+1][0];
					}else if(j<=arr[i].length-1 && j!=0) {
						result[i][j]=arr[i][j-1];
					}
				}
				else if(i%2==0) {
					if(j<arr[i].length-1) {
						result[i][j]=arr[i][j+1];
					}else if(j<=arr[i].length-1) {
						result[i][j]=arr[i][0];
					}
				}
					
			}
		}
		return result;
	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j > 0) {
					System.out.print(" ");
					if (arr[i][j] < 10)
						System.out.print(" ");
				} else if (j == 0 && arr[i][j] < 10)
					System.out.print(" ");
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}