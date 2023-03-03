package Calculator1;

public class Calciop {
		//create a method for addition of two number
		public static int addNum(int Num1,int Num2)
		{
			return Num1+Num2;//add the Num1 and Num2 
		}
		//create a method for substraction of two number
		public static int subNum(int Num1,int Num2)
		{
			return Num1-Num2;//perform Substract operation  
		}
		//create a method for multiplication of two number
		public static int mulNum(int Num1,int Num2)
		{
			return Num1*Num2;//perform multiplication operation 
		}
		//create a method for division of two number
		public static int divNum(int Num1,int Num2)
		{
			try//use the try and catch block becouse of handle the exception
			{
			return Num1/Num2;//perform division opeartion
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return Num2;
		}
		
		
}
