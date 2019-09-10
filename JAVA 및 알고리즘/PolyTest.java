package day8;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());  
		printObjectInfo(new String("������")); 
		printObjectInfo("ABC"); 
		printObjectInfo(new java.io.File("c:\\")); 
		printObjectInfo(new java.util.Date()); 
		printObjectInfo(new int[10]); 
		printObjectInfo(new double[5][3]);
	}
	static void printObjectInfo(Object o) {// java.lang�� �⺻�̶� object �տ� �Ⱥٿ��� ��.
		//�����̸�: java.lang.Object
		if(o instanceof String) { //o �� ���޵� ��ü�� ��Ʈ����ü�ΰ�?
		System.out.println("String��ü�� ���޵�!"+
		o.toString()+"("+((String)o).length()+")");
		// � �ڼ��� �߰� �ƴ��� �� => �θ�������� ���� ����. => object>String�̶�.
		// �θ𿡼� �� o �̴� String���� ����ȯ�� ���� �̷��������.
		}else {
			System.out.println("���޵� ��ü�� Ŭ������ : "+o.getClass().getName());
		}
		// object�� ��� ������ ���� (�ڼ� ��ü�� ���� ����) => object�� ����� �θ�
		// ������Ʈ ��ü�� getclass ȣ�� �� getName ����  
		
	}
}
