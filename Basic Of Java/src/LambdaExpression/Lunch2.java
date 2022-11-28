package LambdaExpression;
// // WAP to compute length of String

@FunctionalInterface
interface CLS
{
	int getLength(String str);
}

class LOS implements CLS
{
	public int getLength(String str)
	{
		int length= str.length();
		return length;
	}
}


public class Lunch2 {

	public static void main(String[] args) {

//		LOS  l = new LOS();
//		System.out.println(l.getLength("Ineuron.ai"));
//		CLS cls = new CLS() {
//			public int getLength(String str)
//			{
//				return  str.length();
//			}
//		};
//		System.out.println(cls.getLength("ineuron.ai"));
		CLS cls1= str->str.length();
		System.out.println(cls1.getLength("ineuron.ai"));
	}

}
