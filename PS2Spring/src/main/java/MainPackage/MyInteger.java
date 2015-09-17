package MainPackage;

public class MyInteger 
{
	private int value;
	
	public int getValue() 
	{
		return value;
	}
	private void setValue(int value)
	{
		this.value = value;
	}
	
	public MyInteger(int value)
	{
		setValue(value);
	}
	
	public boolean isEven()
	{
		if (this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven(int value)
	{
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isOdd()
	{
		if(this.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int value)
	{
		if(value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isPrime()
	/* Only up to 100**/
	{
		if (this.getValue() % 2 != 0 &&
			this.getValue() % 3 != 0 && 
			this.getValue() % 5 != 0 &&
			this.getValue() % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int value)
	{
		if (value % 2 != 0 &&
			value % 3 != 0 && 
			value % 5 != 0 &&
			value % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(MyInteger myInt)
	{
		if (myInt.getValue() % 2 != 0 &&
			myInt.getValue() % 3 != 0 && 
			myInt.getValue() % 5 != 0 &&
			myInt.getValue() % 7 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(int q)
	{
		if (this.getValue()==q)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean equals(MyInteger myInt,int q)
	{
		if (myInt.getValue()==q)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int parseInt(char[] list)
	{
		int ans = 0;
		for (int i = 0;i<list.length;i++)
		{
			ans = ans + Character.getNumericValue(list[i]);
		}
		return ans;
	}
	public static int parseInt(String s)
	{
		int stoint = Integer.parseInt(s);
		return stoint;
	}
}

