import java.util.Dictionary;
import java.util.Scanner;



public class Barby {
	private /**static*/ final int Input = 0;


	int WrongCount = 0;
	boolean isFirstAction = true;
	int CookCount = 0;
	int HeatCount = 0 ;
	int MixCount = 0;
	int NOideaCount = 0;
	int ingredients = 2;
	int amountoffoods = 0;
	boolean done = false;

	/*public void Barby(){


		int WrongCount = 0;
		boolean isFirstAction = true;
		int CookCount = 0;
		int HeatCount = 0 ;
		int MixCount = 0;
		int NOideaCount = 0;
		int ingredients = 2;
		int amountoffoods = 0;
		boolean done = false;
	}*/

		public void amount () {
			
			int amountofingredients = 0 ;
			//int amountoffoods ;
			//boolean done = false;
			System.out.println("For how many people are you planning to cook?");

			Scanner s = new Scanner (System.in);
			while(s.hasNextInt()){
				int number = s.nextInt();
				System.out.print("You invited "+ number +" people.");

				if(!done && number>=1){
					amountoffoods = number * amountofingredients;
					done = true;

					System.out.println("So you're gonna cook " + number +"peole's foods");
					System.out.println("You need to prepare "+amountoffoods + " Iranian food ingredients." );
					intro();
					
				}else{
					System.out.println("You typed incorrectly. Can you type again?");
				}

			
			}
		


				//intro();


			}


			public static void intro(){


				Scanner ins = new Scanner (System.in);
				System.out.println("Welcome to our amazing kitchen :)");
				System.out.println("Today we are here to make something tasty ;)");
				System.out.println("Our plan is to cook one of the popular Persian dishes together! the taste is fantastic!");
				System.out.println("Lets see what you will need for this food");
				System.out.println("What do you think will be the first thing you need to make it?");

				//ask first gridient
				askFirstGriddient();


				askFirstGriddient();
				System.out.println(" Thats all!!!lets start cooking :)"); 
				System.out.println(" what would you do next?");
				System.out.println("Actions: Cook,Heat,Mix,NoIdea,Tips");
				actions();
				Scanner need= ins;



			}
		


	public static void askFirstGriddient (){

		Scanner ins =  new Scanner (System.in);
		String input;

		input=ins.next();
		input = input.toLowerCase();
		boolean foundInput = false;
		if (input.equals("pan")){
			System.out.println("  well done!!! ");
			System.out.println("  now I can help you to choose the other ingredience :)");
			System.out.println("2 cups of rice  ");
			System.out.println("1 big onion");
			System.out.println("1 cup of tomato sauce");
			System.out.println("  2 big chickens ");
			System.out.println("  1 cup of barberry  ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println("  and finally you will need");
			System.out.println("  1 tbsp sunflower oil and spices ");
			foundInput = true;
		}

		else if (input.equals("rice")){
			System.out.println(" yaaayy!!! ");
			System.out.println(" now I can help you to choose the other ingredience :)");
			System.out.println(" of course you will need a bigpan and");
			System.out.println(" 1 big onion");
			System.out.println(" 1 cup of tomato sauce ");
			System.out.println("2 big chickens");
			System.out.println("1 cup of barberry");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower and spices ");
			foundInput = true;
		}

		else if (input.equals("chicken")){
			System.out.println(" wow!!! ");
			System.out.println(" now I can help you to choose the other ingredience:)");
			System.out.println(" of course you will need a bigpan and");
			System.out.println(" 2 cups of rice");
			System.out.println(" 1 big onion  ");
			System.out.println("1 cup of barberry");
			System.out.println(" 1 cup of tomato sauce ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower and spices ");
			foundInput = true;
		}

		else if (input.equals("onion")){
			System.out.println("  excellent!!! ");

			System.out.println("  now I can help you to choose the other ingredience :)");
			System.out.println("  of course you will need a pan and");
			System.out.println(" 2 cups of rice");
			System.out.println(" 2 big chickens  ");
			System.out.println("1 cup of barberry");
			System.out.println(" 1 cup of tomato sauce ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and at last");
			System.out.println("  1 tbsp sunflower and spices ");
			foundInput = true;
		}

		else if (input.equals("tomato sauce")){
			System.out.println("  nice!!! ");

			System.out.println("  now I can help you to choose the other ingredience   :)");
			System.out.println("  of course you will need a pan and");
			System.out.println(" 2 cups of rice");
			System.out.println(" 2 big chickens  ");
			System.out.println("1 cup of barberry");


			System.out.println(" 1 big onion ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");
			foundInput = true;
		}

		else if (input.equals("barberry")){
			System.out.println("  great!!! ");

			System.out.println("  now I can help you to choose the other ingredience   :)");

			System.out.println("  of course you will need a pan and");
			System.out.println(" 2 cups of rice");
			System.out.println(" 2 big chickens  ");
			System.out.println("tomato sauce");
			System.out.println(" 1 big onion ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");
			foundInput = true;
		}

		if(!foundInput)
		{
			System.out.println("whatchu tryin' to say? :|"); 
			System.out.println("let me give you all the ingredients:|"); 
			System.out.println("  of course you will need a pan and");
			System.out.println(" 2 big chickens  ");
			System.out.println("tomato sauce");
			System.out.println(" 1 big onion ");
			System.out.println("1/4 tbsp of saffron powder");
			System.out.println(" and finally ");
			System.out.println("  1 tbsp sunflower and spices ");
		}
	}
	public static void actions () {

		Scanner sc= new Scanner (System.in);
		int Wrongs=0;
		boolean mix = false;
		while(!mix){
			String then ;
			then=sc.nextLine();



			if (then.equals("mix")){	
				System.out.println("Good job!!");
				System.out.println("the first and the best choice :) ");
				//System.out.println(" ok lets go on!!! :) with " + wrongs + " wrong choises");
				mix = true;


			}
			else if (then.equals("heat")){
				System.out.println("You'd better mix the ingredents first");


			}

			else if (then.equals("cook")){
				System.out.println("maybe you need to do something else first :)");



			}
			else if (then.equals("NOidea")) {
				System.out.println("come on!! you have all the actions!just think more ");
				//new Scanner(System.in).nextLine();
				//System.out.println(" ok lets go on!!!" );


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
					new Scanner(System.in).nextLine();
					System.out.println("you can add 2 spoonful of sugar to the barberries if you like them to be alittle sweet");


					new Scanner (System.in).nextLine();
					System.out.println("how would you like to serve your chicken?");
					String next;
					next=sc.nextLine();

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


				}
			}


		}
	}

	public void amountofingredients() {
		// TODO Auto-generated method stub

	}


	public void amountoffoods() {
		// TODO Auto-generated method stub

	}
}



