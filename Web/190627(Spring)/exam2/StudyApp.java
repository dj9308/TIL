package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyApp {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("exam2/omg.xml");
		
		Student bean1 = (Student)factory.getBean("st1");
		Student bean2 = (Student)factory.getBean("st2");
		Student bean3 = (Student)factory.getBean("st3");
		
		System.out.println(bean1.getName()+"�� "+bean1.getMyHomework().getHomeworkName()
				+"�� �н��մϴ�.");
		System.out.println(bean2.getName()+"�� "+bean2.getMyHomework().getHomeworkName()
				+"�� �н��մϴ�.");
		System.out.println(bean3.getName()+"�� "+bean3.getMyHomework().getHomeworkName()
				+"�� �н��մϴ�.");
		
	}

}
