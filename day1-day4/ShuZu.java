
public class ShuZu {
	public static void main(String[] args){
		//һά��������ۼӺͲ�����
		int[] arr = {10,20,30,40,50};
		int sum = 0; 
		for (int i=0; i<arr.length; i++) {
              //System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("sum= " + sum);
		System.out.println("---------------------");
		//��ά��������ۼӺͲ�����
				int[][] arr2 = { {1,2},{3,4,5},{6,7,8,9,10} };
				int sum2 = 0;
				for (int i=0; i<arr2.length; i++) {
					for (int j=0; j<arr2[i].length; j++) {
		                 //System.out.println(arr2[i][j])
						sum2 += arr2[i][j];
					}
				}
				System.out.println("sum2= "+ sum2);
			}
		}