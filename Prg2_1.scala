object Prg2_1
{

	def  binary(num:Int)
	{
		var bstr=" ";//binary String
		var rem=0;
		
		var n1=num;
		while(n1>0)
		{
			rem=n1%2;
			n1=n1/2;
			bstr= rem+bstr;
		}

		println("Binary:"+bstr);	
	}				
	def  octal(num:Int)
	{
		var ostr=" ";//binary String
		var rem=0;
			
		var n1=num;
		while(n1>0)
		{
			rem=n1%8;
			n1=n1/8;
			ostr= rem+ostr;
		}

		println("octal:"+ostr);	
	}					

	def main(args:Array[String])
	{

		println("enter five random numer")
       		 for(i<-0 until 5)
       		{
            		var a =Console.readInt 
            		binary(a)
            		octal(a)
		println("\n\n\n")
       		 }	
	}
}
			
