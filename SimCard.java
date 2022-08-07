class SimCard 
{
	private long number;
	private String ser_prov;
	double loc_call_rate;
	SimCard(long num,String sprov,double lcr)
	{
		this.number=num;
		this.ser_prov=sprov;
		this.loc_call_rate=lcr;
	}
	public long getnumber()
	{
		return number;
	}
	public String getser_prov()
	{
		return ser_prov;
	}
	public void setser_prov( long num,String newser_prov)
	{
		if(this.number==num)
		{
			this.ser_prov=newser_prov;
			System.out.println("SERVICE PROVIDER CHANGED");
		}
		else
		{
			System.out.println("ENTER VAILD NUMBER");
		}
	}
	public double getcall_rate()
	{
		return loc_call_rate;
	}
	public void setcall_rate( long num ,double newcall_rate)
	{
		if(this.number==num)
		{
			this.loc_call_rate=newcall_rate;
			System.out.println("CALL RATE SUCESSFULLY CHANGED");
		}
		else
		{
			System.out.println("ENTER VAILD NUMBER");
		}
	}
	public void printdetails(long num)
	{
		if(this.number==num)
		{
		System.out.println("SIM NUMBER IS "+number);
		System.out.println("SIM SERVICE PROVIDER IS "+ser_prov);
		System.out.println("SIM LOCAL CALL RATE IS "+loc_call_rate);
		}
		else
		{
			System.out.println("ENTER VAILD NUMBER");
		}

	}


}
