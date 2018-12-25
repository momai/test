public class ConditionalStatement {
	public static void main(String[] args) {
		
		short year = 2018;
		short birthday = 1990;
		char sex = 'М';
		float height = 1.75f;
		char name = 'А';
		
		int age = year - birthday;
		if(age > 20) {
			System.out.println("20 лет");
		}

		if(sex == 'М') {
			System.out.println("пол: мужской");
		}
		if(sex == 'Ж') {
			System.out.println("пол: женский");
		}

		if(height < 1.80) {
			System.out.println("подвид: Коротышка");
		} else {
			System.out.println("подвид: Длинноног");
		}

		if(name == 'М') {
			System.out.println("Морти?");
		} else if(name == 'И') {
				System.out.println("Илон?");
		} else {
				System.out.println("Ты не тот кто нужен");
			}
		}


	}
