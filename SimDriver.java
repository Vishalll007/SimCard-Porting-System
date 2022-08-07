import java.util.Scanner;
class SimDriver 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		boolean cond=true;
		SimCard sc=null;
		while(cond)
		{
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1) CREATE A ACCOUNT");
			System.out.println("2) DISPLAY CONTACT NUMBER");
			System.out.println("3) CHANGE SERVICE PROVIDER");
			System.out.println("4) CHNAGE CALL RATE");
			System.out.println("5) VIEW SIM CARD DETAILS");
			System.out.println("6)EXIT");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:
				{
					if(sc==null)
					{
						System.out.println("ENTER SIM CARD NUMBER");
						long num1=s.nextLong();
						System.out.println("ENTER SERVICE PROVIDER");
						String sp=s.next();
						System.out.println("ENTER LOCAL CALL RATE");
						double cr=s.nextDouble();
						sc=new SimCard(num1,sp,cr);
						System.out.println("ACCOUNT CREATED");

					}
					else
					{
						System.out.println("ACCOUNT ALREADY EXISTED");	
					}
				}
					break;
					case 2:
					{
						if(sc!=null)
						{
							System.out.println(sc.getnumber());
						}
						else
						{
							System.out.println("CREATE A ACCOUNT AND BUY SIM CARD");
						}
						
					}
					break;
					case 3:
					{
						if(sc!=null)
						{
							System.out.println("ENTER YOUR  SIM NUMBER");
							long num1=s.nextLong();
							System.out.println("ENTER NEW SERIVECE PROVIDER NAME");
							String sp1=s.next();
							sc.setser_prov(num1, sp1);
							System.out.println("SERVICE PROVIDER CHANGED");

						}
						else
						{
							System.out.println("CREATE A ACCOUNT AND BUY SIM CARD");
						}
					}
						break;
						case 4:
						{
							if(sc!=null)
						{
							System.out.println("ENTER YOUR  SIM NUMBER");
							long num1=s.nextLong();
							System.out.println("ENTER NEW CALL RATE");
							double cr1=s.nextDouble();
							sc.setcall_rate(num1, cr1);
							System.out.println("CALL RATE CHANGED");

						}
						else
						{
							System.out.println("CREATE A ACCOUNT AND BUY SIM CARD");
						}
						}
						break;
						case 5:
							{
								if(sc!=null)
								{
									System.out.println("ENTER YOUR  SIM NUMBER");
							        long num1=s.nextLong();
									sc.printdetails(num1);
								}
								else
								{
								   System.out.println("CREATE A ACCOUNT AND BUY SIM CARD");
								}
								
							}
							break;
							case 6:
							{
								cond=false;
							}
							break;
							default:
							{
								System.out.println("CREATE A ACCOUNT AND BUY SIM CARD");
							}
						
						}
					}

					}
			}
			



		
	

