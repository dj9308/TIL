
package practice;
// ���� : ���ڿ��� ÷���� ������̴� ���� ������ ���� ���ÿ�.

// ����Լ��� ���ǿ� �뵵�� ����� �˰� ������ Ǫ�� ���� �����ϰ� ������  Ǯ �� �־��� �� ����.
// �� �� ���� �� : ����Լ��� ���빰 ��ü�� �ҷ��� �Լ� ��ü�� �ٿ�����.
// 





class network {

    public int solution(int n, int[][] computers) {

        int answer = 0;

        for(int i=0;i<n;i++){
                repeat(computers,i);
                answer++;
        }


        return answer;
    }

    private static void repeat(int[][] computers, int i) {


        for(int j=0;j<computers.length;j++){
            if(computers[i][j]==1 && i!=j){
                repeat(computers,j);
            }
        }
    }
}

