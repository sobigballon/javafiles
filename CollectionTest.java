package projecttest;

public class CollectionTest {
	
	public static void main(String[] args) {
		Student[] students=new Student[3];
		
		for (int x = 0; x < students.length; x++) {
			System.out.println(students[x]);
		}
		
		// ����ѧ������Ԫ��
	
		Student s1 = new Student("����ϼ",28);
		Student s2 = new Student("������",31);
		Student s3 = new Student("��־��",18);
		
    	students[0]= s1;
		students[1]=s2;
		students[2]=s3;
		
	
		// ��ֵ���ѧ������
		for (int x = 0; x < students.length; x++) {
			// System.out.println(students[x]);
			Student s = students[x];
			System.out.println(s.getName() + "---" + s.getAge());
			}
		
	}
}

