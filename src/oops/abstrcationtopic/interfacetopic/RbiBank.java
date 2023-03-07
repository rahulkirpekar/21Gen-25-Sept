package oops.abstrcationtopic.interfacetopic;

public interface RbiBank 
{
	// 1) Constant Variables
		public static final int NO = 10;//public static final
	
	// 2) Abstract methods
		void test1();// public abstract
		public void test2();// abstract
		abstract void test3();// public 
		public abstract void test4();// JVM--
		void test5();// public abstract
		
	// 3) Non-Abstract Methods--[static,default,private]
		// 3) Non-Abstract Methods--[static]
		public static void test6() 
		{
		}
		// 4) Non-Abstract Methods--[default]
		public default void test7() 
		{
			test8();
		}
		// 5) Non-Abstract Methods--[private]
		private void test8() 
		{
			
		}
}
