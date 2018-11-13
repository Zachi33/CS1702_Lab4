import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class CS1702_Lab4 {

	public static void main(String Args[])throws Exception
	{
		
//		for(int i=1;i<=100;i++) {compound_condition(i);}
//		four_four(4);
//		four_five(8);
//		four_six_imp();
//		for(int y=1;y<=7;y++) {four_six(y);}
		nested_loops(6);
//		pairs(3);	
//		finch_given();
//		finch_modified();
		
		
		
	}
	static void compound_condition(int input) {
		if(input>0) {
			System.out.print("‘Input: ");
			System.out.println(input);
			
		boolean div2 = (input%2==0);
		boolean div3 = (input%3==0);
		boolean div5 = (input%5==0);
		boolean div7 = (input%7==0);
		boolean div9 = (input%9==0);
		
		if(div2&&div3) {System.out.println("yes, divisible by 2 and 3");}
				  else {System.out.println("no, not divisible by 2 and 3");}
		if(div7||div9) {System.out.println("yes, divisible by 7 or 9");}
				  else {System.out.println("no, not divisible by 7 or 9");}
		if(div2&&div3&&!div5) {System.out.println("yes, divisible by 2 and 3 but not 5");}
				         else {System.out.println("no, doesn't follow the condition: divisible by 2 and 3 but not 5");}
		
		
		
		}
		else if(input<0)System.out.println("not a postive number");
		else if(input==0)System.out.println("input can't be equeal 0");
	}
    static void four_four(int example) {
    	
    	int increment5=1;
    	switch(example) {
    	case(0):{for(int i=0;i<10;++i){System.out.println(i);}break;}
    	case(1):{for(int i=4;i<=11;++i){System.out.println(i);}break;}
    	case(2):{for(int i=10;i<=19;i+=3){System.out.println(i);}break;}
    	case(3):{for(int i=1;i<=16;i+=3){System.out.println(i);}break;}
    	case(4):{for(int i=2;i<=12;i+=2){System.out.println(i);}break;}
    	case(5):{for(int i=1;i<=100;i+=increment5){System.out.println(i);increment5+=2;}break;}
    	case(6):{for(int i=-20;i<=20;i+=5){if(i!=0)System.out.println(i);}break;}
    	
    	
    	}
    	
    	

    }
    static void four_five(int example) {
    	switch(example) {
    	case(0):{for(int i=0;i<10;++i){System.out.print("*");}break;}
    	case(1):{for(int i=0;i<10;++i){System.out.print("+");}break;}
    	case(2):{for(int i=0;i<5;++i){System.out.print("-");}break;}
    	case(3):{for(int i=0;i<5;++i){System.out.print("+-");}break;}
    	case(4):{for(int i=0;i<3;++i){System.out.print("*+-");}break;}
    	case(5):{System.out.print("*");for(int i=0;i<3;++i){System.out.print("+-*");}break;}
    	case(6):{for(int i=1;i<=6;++i){
    		if(i%2!=0)System.out.print("**");
    		else System.out.print("++");}break;}
    	case(7):{for(int i=1;i<=6;++i){
    		if(i%3==0)System.out.print("---");
    		else if((i+1)%3==0)System.out.print("+++");
    		else if((i+2)%3==0)System.out.print("***");
    	}break;}
    	case(8):{for(int i=0;i<=6;++i){
    		if(i%6==0)System.out.print("***");
    		else if((i+5)%6==0)System.out.print("+++");
    		else if((i+4)%6==0)System.out.print("---");
    		else if((i+3)%6==0)System.out.print("---");
    		else if((i+2)%6==0)System.out.print("+++");
    		else if((i+1)%6==0)System.out.print("***");}break;}
    }  
    	
    }
    static void four_six_imp() {
    	//6th
    	System.out.println("6th:");
    	int i=-10;
    	while(i<=10) {System.out.print(i+", ");i+=2;}
    	
    	//7th 
    	System.out.println("");
    	System.out.println("7th:");
    	i=-20;
    	while(i<=20) {if(i!=0)System.out.print(i+", ");i+=5;}}
    static void four_six(int example) {
    	switch(example) {
    	case(1):{System.out.println(HCF(88,26));break;}
    	case(2):{System.out.println(HCF(54,87));break;}
    	case(3):{System.out.println(HCF(16,84));break;}
    	case(4):{System.out.println(HCF(55,25));break;}
    	case(5):{System.out.println(HCF(42,72));break;}
    	case(6):{System.out.println(HCF(77,28));break;}
    	case(7):{System.out.println(HCF(80,88));break;}
    	
    	}
    	
    }
    static int HCF(int a, int b) {
    	do {
    	//one of these integers has to be greater than the other
    	//I want to always make sure that a is greater than b
    	if(b>a) {int aa=a;a=b;b=aa;}
    	//how many times can you fit b in a?
    	int i=0;
    	while(i*b<=a)
    	{i++;}
    	//answer: i-1
    	int r=a-((i-1)*b);
    	a=b;
    	b=r;
    	}while(b>0);
    	return a;
    }
    static void nested_loops(int example) {
    	switch(example) {
    	
    	case(0):{
    		for(int i=1;i<5;++i)
    		{for(int j=1;j<i+1;++j)
    			{System.out.print(i);}}

    		break;
    	}
    	case(1):{
    		for(int i=1;i<=5;++i)
    		{for(int j=1;j<i+1;++j)
    			{System.out.print(i);}}
    		
    		break;
    	}
    	case(2):{
    		for(int i=2;i<=6;++i)
    		{for(int j=1;j<i+1;++j)
    			{System.out.print(i);}}
    		
    		break;
    	}
    	case(3):{
    		for(int i=1;i<=5;++i)
    		{for(int j=1;j<i+1;++j)
    			{if(i!=2&&i!=4)System.out.print(i);}}
    		
    		break;
    	}
    	case(4):{
    		for(int i=1;i<=4;++i)
    		{for(int j=1;j<i+1;++j)
    			switch(i){
    			case(1):{System.out.print(1);break;}
    			case(2):{System.out.print(3);break;}
    			case(3):{System.out.print(5);break;}
    			case(4):{System.out.print(7);break;}
    			}
    			}
    		
    		break;
    	}
    	case(5):{
    		for(int i=5;i>=1;--i)
    		{for(int j=1;j<=i;++j)System.out.print(i);}
    		break;
    	}
    	
    	case(6):{
    		for(int i=5;i>=1;--i)
    		{for(int j=1;j<=6-i;++j)System.out.print(i);}
    		break;
    	}
    	case(7):{
    		for(int i=1;i<=5;++i)
    		{for(int j=1;j<=i;++j)
    			if(i%2==0)
    			System.out.print("*");
    			else{System.out.print("+");}}
    		
    		break;
    	}
    	case(8):{
    		for(int i=2;i<=7;++i)
    		{for(int j=1;j<=i;++j)
    			if((i+1)%3==0)System.out.print("-");
    			else if(i%3==0)System.out.print("*");
    			else if((i-1)%3==0)System.out.print("+");
    			
    		}
    		break;
    	}
    	
    	}
    }
    static void pairs(int example) {
    	switch(example) {
    	case(1):{
    		int k=0;
    		for(int i=1;i<=10;i++) {
    			for(int q=1;q<=10;q++) {
    				k++;
    				System.out.println(k+") "+i+", "+q);
    			}
    		}
    		break;}
    	 case(2):{
    			int k=0;
    			for(int i=1;i<=10;i++) {
    				for(int q=1;q<=10;q++) {
    					//i is x; q is y
    					if(i>q) {
    					k++;
    					System.out.println(k+") "+i+", "+q);}
    				}
    			}
    			break;}
    	 case(3):{
     		int k=0;
     		for(int i=1;i<=4;i++) {
     			for(int q=4;q<=8;q++) {
     				k++;
     				System.out.println(k+") "+i+", "+q);
     			}
     		}
     		break;}
    	 
    	
   
	}
    }
    static void finch_given() throws Exception {
    	Finch myf=new Finch();
		myf.setWheelVelocities(100, 100);
    	//myf.setWheelVelocities(100,100,5000); //the same happens from observer perspective
		long before =System.currentTimeMillis();
		while(System.currentTimeMillis()-before<5000) {
			Thread.sleep(500);
			if(myf.isTapped())break;
			
			
		}
		myf.stopWheels();
		myf.quit();
    }
    static void finch_modified() throws Exception {
    	Finch myf=new Finch();
		//long before =System.currentTimeMillis();
		while(!myf.isObstacle()) {
			myf.setWheelVelocities(100, 100);
		}
		myf.stopWheels();
		myf.quit();
    }
}
 