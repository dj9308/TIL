package algori;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;


/*����Ʈ�ٹ�
���� ����
��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.

���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���ѻ���
genres[i]�� ������ȣ�� i�� �뷡�� �帣�Դϴ�.
plays[i]�� ������ȣ�� i�� �뷡�� ����� Ƚ���Դϴ�.
genres�� plays�� ���̴� ������, �̴� 1 �̻� 10,000 �����Դϴ�.
�帣 ������ 100�� �̸��Դϴ�.
�帣�� ���� ���� �ϳ����, �ϳ��� � �����մϴ�.
��� �帣�� ����� Ƚ���� �ٸ��ϴ�.
*/



class Solution {
    public int[] solution(String[] genres, int[] plays) {
    	
    	HashMap<String, Integer> ary = new HashMap<String, Integer>();
    	ArrayList<Integer> summ = new ArrayList<Integer>();
        int[] answer = {};
    	for(int i=0;i<genres.length;i++) {
    		int sum = 0;
    		for(int j=0;j<genres.length;j++) {
        		if(!genres[i].equals(genres[j]) && i<j){
        			ary.put(genres[i],i);
    		}else if(genres[i].equals(genres[j]) && i<j) {
    			sum+=plays[j];
    			continue;
    			ary.put(genres[i],i);
    		}

    		}
    		summ.add(sum);	
    	}
    	for(int i=0;;)

        return answer;
    }
}