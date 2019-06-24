package practice1;
import java.util.*;

// ������ �� �˰Ե� �� : 

// ��å�� ���� ���� �� ����ȭ �� �ڵ� �ۼ��ϴ� ���� ���̵��� �ð��ҿ䰡 ������.

// copyOfRange �޼ҵ带 �˰ԵǴ� �ڵ尡 �� ��������

// �����ε� ������ �޼ҵ带 ����ϰ� ������ Ȱ���ϸ� ���� �ڵ��� �� �����Ŷ� ����	(������ ��Ȯ�� �ƴ� ���� ��)



class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0 ;

        for(int a = 0 ; a < commands.length ; a++)
        {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            // i j k �� ��Ŀ� �ֱ�

            int[] ary = new int[j - i + 1];
            
            

            int b = 0;
            for(int v = i - 1 ; v < j ; v++)
            	ary[b++] = array[v];

         // i���� j ���� �ڸ� ���ڵ��� ���ο� ��Ŀ� ����
            
            Arrays.sort(ary);
            answer[index++] = ary[k-1];
           
         // sort�� ���� �� k�� ° �ִ� ���� answer ��Ŀ� �ֱ�
            // k - 1 �� ����� 0���� ���۵Ǳ� ������.
        }


        return answer;
    }
}




//Arrays.copyOfRange(���� �迭, ������ �����ε���, ������ ���ε���) ����ϸ�?



/*
 * 
 * import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] ary = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            // -1 �ϴ� ���� : ����� 0���� �����ؼ�
            // 3��° �ƱԸ�Ʈ�� -1�� ���ϴ� ���� :  ���޵� �ε��� �ٷ� �������� �迭 ��ұ����� ����Ǿ.
            
            Arrays.sort(ary);
            answer[i] = ary[commands[i][2]-1];
        }

        return answer;
    }
}
 * */

