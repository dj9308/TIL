package exam3;

import org.springframework.stereotype.Component;

@Component("morn")
	public class MorningGreetingImpl implements Greeting{

		@Override
		public void greet() {
			System.out.println("������ ��ħ�Դϴ�.");
			
		}

	}
