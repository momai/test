public class ConditionalStatement {
	public static void main(String[] args) {
		
		short year = 2018;
		short birthday = 1990;
		char sex = '�';
		float height = 1.75f;
		char name = '�';
		
		int age = year - birthday;
		if(age > 20) {
			System.out.println("20 ���");
		}

		if(sex == '�') {
			System.out.println("���: �������");
		}
		if(sex == '�') {
			System.out.println("���: �������");
		}

		if(height < 1.80) {
			System.out.println("������: ���������");
		} else {
			System.out.println("������: ���������");
		}

		if(name == '�') {
			System.out.println("�����?");
		} else if(name == '�') {
				System.out.println("����?");
		} else {
				System.out.println("�� �� ��� ��� �����");
			}
		}


	}
