package exam3;

import org.springframework.stereotype.Component;

@Component("after")
	public class AfternoonGreetingImpl implements Greeting{

		@Override
		
		public void greet() {
			System.out.println("��ſ� ���ĵǼ���.");
			
		}

	}
