package jicu.genericity;

/*
 * ����ѧϰextends Number�޶�TΪnumber������
 */
public class Gen<T extends Number> {
	 T[] nums;
	 
	 Gen(T[] ob){
		 nums = ob;
	 }
	 double average() {
		 double sum = 0.0;
		 for (int i=0;i<nums.length;i++) {
			 sum+=nums[i].doubleValue();
		 }
		 return sum/nums.length;
	 }
	 //?ͨ������Զ�����2��Gen����Ƚ�����ƽ��ֵ
	 boolean sameAvg(Gen<?> ob) {
		 if(average()==ob.average()) {
			 return true;
		 }
		 return false;
	 }

}
