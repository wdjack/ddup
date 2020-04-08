package jicu.genericity;

/*
 * 泛型学习extends Number限定T为number的子类
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
	 //?通配符可以对任意2个Gen对象比较他们平均值
	 boolean sameAvg(Gen<?> ob) {
		 if(average()==ob.average()) {
			 return true;
		 }
		 return false;
	 }

}
