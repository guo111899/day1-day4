
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random(); 
		// �õ�0-100��Χ�ڵ���������������������������ֵ��i����
		int i = r.nextInt(100); 
		//�õ�0.0-1.0��Χ�ڵ����С���������������С����ֵ��d����
		double d = r.nextDouble(); 
		System.out.println(i); 	
		System.out.println(d); 
	}
}