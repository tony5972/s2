object Prg2_2
{
	def main(args:Array[String])
	{
		var n1=0;
		var n2=0;
		var count=0;
		var pcount=0;
		var sum=0;
		var prime=" "; 
		println("Enter two numbers:");
		n1=Console.readInt();
		n2=Console.readInt();
		println("prime numbers from :"+n1+"to"+n2+"are");
		
		for(i<-n1 to n2)
		{
			count=0;
			for(j<-1 to i )
			{
				if(i%j==0)
				{
						count=count+1;
							
				}
			}
			if(count==2)
			{	
				println(i);		
				pcount=pcount+1;
				sum=sum+i;
			}							
		}
		
		println("average:"+sum/pcount);
	}
}			
