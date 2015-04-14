import java.util.Scanner;
import java.util.HashMap;

public class BarberryRiceAndChicken { 

	public static void big (String args []){
		Scanner ins= new Scanner(System.in);
		System.out.println("wellcome to our amazing kitchen :)");
		ins.nextLine();
		System.out.println("Today we are here to make something tasty ;)");
		ins.nextLine();
		System.out.println("Our plan is to cook one of the popular Persian dishes together");
		ins.nextLine();
		System.out.println("Lets see what you will need for this food");
		ins.nextLine();
		System.out.println("what do you think will be the first thing you need to make it?");
		Scanner need= ins;
		String pan;
		pan=need.next();
		int wrongs = 0;

		if (pan.equals("pan")){
			System.out.println("  well done!!! ");
			System.out.println("  now I can help you to choose the other ingredience :)");
			ins.nextLine();
			System.out.println("2 cups of rice  ");
			ins.nextLine();
			System.out.println("1 big onion");
			ins.nextLine();
			System.out.println("1 cup of tomato sauce");
			ins.nextLine();
			System.out.println("  2 big chickens ");
			ins.nextLine();
			System.out.println("  1 cup of barberry  ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println("  and finally you will need");
			System.out.println("  1 tbsp sunflower oil and spices ");
		}

		else if (pan.equals("rice")){
			System.out.println(" yaaayy!!! ");
			ins.nextLine();
			System.out.println(" now I can help you to choose the other ingredience :)");
			ins.nextLine();
			System.out.println(" of course you will need a bigpan and");
			ins.nextLine();
			System.out.println(" 1 big onion");
			ins.nextLine();
			System.out.println(" 1 cup of tomato sauce ");
			ins.nextLine();
			System.out.println("2 big chickens");
			ins.nextLine();
			System.out.println("1 cup of barberry");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower and spices ");

		}

		else if (pan.equals("chicken")){
			System.out.println(" wow!!! ");
			ins.nextLine();
			System.out.println(" now I can help you to choose the other ingredience:)");
			ins.nextLine();
			System.out.println(" of course you will need a bigpan and");
			ins.nextLine();
			System.out.println(" 2 cups of rice");
			ins.nextLine();
			System.out.println(" 1 big onion  ");
			ins.nextLine();
			System.out.println("1 cup of barberry");
			ins.nextLine();
			System.out.println(" 1 cup of tomato sauce ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower and spices ");
		}

		else if (pan.equals("onion")){
			System.out.println("  excellent!!! ");
			ins.nextLine();

			System.out.println("  now I can help you to choose the other ingredience :)");
			ins.nextLine();
			System.out.println("  of course you will need a pan and");
			ins.nextLine();
			System.out.println(" 2 cups of rice");
			ins.nextLine();
			System.out.println(" 2 big chickens  ");
			ins.nextLine();
			System.out.println("1 cup of barberry");
			ins.nextLine();
			System.out.println(" 1 cup of tomato sauce ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and at last");
			System.out.println("  1 tbsp sunflower and spices ");
		}

		else if (pan.equals("tomato sauce")){
			System.out.println("  nice!!! ");
			ins.nextLine();

			System.out.println("  now I can help you to choose the other ingredience   :)");
			ins.nextLine();
			System.out.println("  of course you will need a pan and");
			ins.nextLine();
			System.out.println(" 2 cups of rice");
			ins.nextLine();
			System.out.println(" 2 big chickens  ");
			ins.nextLine();
			System.out.println("1 cup of barberry");



			ins.nextLine();
			System.out.println(" 1 big onion ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");
		}

		else if (pan.equals("barberry")){
			System.out.println("  great!!! ");
			ins.nextLine();

			System.out.println("  now I can help you to choose the other ingredience   :)");
			ins.nextLine();
			System.out.println("  of course you will need a pan and");
			ins.nextLine();
			System.out.println(" 2 cups of rice");
			ins.nextLine();
			System.out.println(" 2 big chickens  ");
			ins.nextLine();
			System.out.println("tomato sauce");
			ins.nextLine();
			System.out.println(" 1 big onion ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");
		}
		else   {
			System.out.println("whatchu tryin' to say? :|"); 
			ins.nextLine();

			System.out.println("let me give you all the ingredients:|"); 
			ins.nextLine();
			System.out.println("  of course you will need a pan and");
			ins.nextLine();
			System.out.println(" 2 cups of rice");
			ins.nextLine();
			System.out.println(" 2 big chickens  ");
			ins.nextLine();
			System.out.println("tomato sauce");
			ins.nextLine();
			System.out.println(" 1 big onion ");
			ins.nextLine();
			System.out.println("1/4 tbsp of saffron powder");
			ins.nextLine();
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");


		}



		System.out.println(" Thats all!!!lets start cooking :)"); 
		System.out.println(" what would you do next?");


		Scanner mix= ins;
		int Wrongs=0;
		while(mix.hasNext()){
			String then ;
			then=mix.nextLine();


			if (then.equals("mix")){	
				System.out.println("Good job!!");
				System.out.println("the first and the best choice :) ");
				System.out.println(" ok lets go on!!! :) with " + wrongs + " wrong choises");



			}
			else if (then.equals("heat")){
				System.out.println("You'd better mix the ingredents first");
				new Scanner(System.in).nextLine();
				System.out.println(" ok lets go on!!! :) with " + wrongs + " wrong answers");



			}

			else if (then.equals("cook")){
				System.out.println("maybe you need to do something else first :)");
				new Scanner(System.in).nextLine();
				System.out.println("u dont think mixing would be the first step!!!?");
				System.out.println(" ok lets go on!!! :) with " + wrongs + " wrong choises");



			}	

			else if (then.equals("NOidea")) {
				System.out.println("Its so easy!!just mix them first :)");
				new Scanner(System.in).nextLine();
				System.out.println(" ok lets go on!!!" );




			}
			else
			{

				System.out.println("whatchu tryin' to say man? :| "+ then);
				System.out.println("type * NOidea* if you dont know what to do next");
				//wrongs++;

			}



		}


		if(Wrongs>=4) {
			new Scanner(System.in).nextLine();
			System.out.println(" you had"+ wrongs+"wrong choices"+"you'd better try some cooking book before cooking");
		}


		new Scanner (System.in).nextLine();
		System.out.println("type * tips * if you want  tips or"
				+ " just type * exit * if you know what to do after this");
		Scanner tip = new Scanner(System.in);
		while (tip.hasNext()){
			String tips;
			tips=tip.next();
			if (tips.equals("tips")){
				System.out.println("First heat your pan with sun flower or vegetable oil "); 
				new Scanner (System.in).nextLine();
				System.out.println(" before adding the chicken to the onions cut them into small pieces before roasting it "); 
				new Scanner(System.in).nextLine();
				System.out.println("  Its better to roast the barberries with butter not oil"); 


				new Scanner (System.in).nextLine();
				System.out.println("how would you like to serve your chicken?");
				String next;
				next=nextLine();

				if (next.equals("fry")){
					System.out.println("frying....");
				}
				else if(next.equals("roast")){
					System.out.println("roasting....");
				}

				else if (next.equals("boiled")) {
					System.out.println("boiling...");
				}
				else if (next.equals("help")) {
					System.out.println("You are not an Experienced cook! I am sure at least you know frying is one way to make the chicken");
				}






				System.out.println("Thanks for trying our kitchen.hope to see you soon!!");
				System.out.println("               ,          ,      ,      ,  @@");
				System.out.println("                          ,     ,         {@@@}");
				System.out.println("                ,        ,       '       {@@@}");
				System.out.println("              ,         ,      ,'       {@@@}   <-Spoon ?");
				System.out.println("               ,      ,        ,       {@@@}");
				System.out.println("              ,      ,,        ,      {@@@}");
				System.out.println("                                     {@@@}");
				System.out.println("         ((((((((((((((((()))))))))))))))))))))");
				System.out.println("       oo @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ oo");
				System.out.println("     oo    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    oo");
				System.out.println("    oo      &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&      oo");
				System.out.println("      oo     &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&     oo");
				System.out.println("        oo    ****************************    oo");
				System.out.println("               **************************");
				System.out.println("                (((((((((((())))))))))))"); 
			}
		}
	}






	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}



