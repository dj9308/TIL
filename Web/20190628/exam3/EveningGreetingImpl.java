package exam3;

import org.springframework.stereotype.Component;

@Component("even")
	public class EveningGreetingImpl implements Greeting{

		@Override
		public void greet() {
			System.out.println("��ſ� ���ĵǼ���.");
			
		}

	}
