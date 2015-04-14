import java.util.Scanner;

class Pancake {
	public  void boody  (){

		System.out.println("hellow again!\n");
		new Scanner(System.in).nextLine();
		System.out.println("we will make a simple pancake together \n\n");
		new Scanner(System.in).nextLine();
		System.out.println("what do you think will be the first thing you will need?");
		Scanner need= new Scanner(System.in);
		String pan;
		pan=need.next();

		if (pan.equals("pan")){
			System.out.println("  well done!!! ");
			System.out.println("  now i will tell you what else you will need :)");
			new Scanner(System.in).nextLine();
			System.out.println("  1 cup of flour");
			new Scanner(System.in).nextLine();
			System.out.println("  2 large eggs");
			new Scanner(System.in).nextLine();
			System.out.println("  1.3 cups of milk  ");
			new Scanner(System.in).nextLine();
			System.out.println("  and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying\n ");
			new Scanner(System.in).nextLine();
			
		}
		else if (pan.equals("egg")){
			System.out.println(" well done!!! ");
			new Scanner(System.in).nextLine();
			System.out.println(" now i will tell you what else you will need :)");
			new Scanner(System.in).nextLine();
			System.out.println(" off course you will need a pan and");
			new Scanner(System.in).nextLine();
			System.out.println(" 1 cup of flour");
			new Scanner(System.in).nextLine();
			System.out.println(" 1.3 cups of milk  ");
			new Scanner(System.in).nextLine();
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying\n ");
			new Scanner(System.in).nextLine();
		}
		else if (pan.equals("flour")){
			System.out.println(" well done!!! ");
			new Scanner(System.in).nextLine();
			System.out.println("you will need 1 cup of flour");
			new Scanner(System.in).nextLine();
			System.out.println(" now i will tell you what else you will need :)");
			new Scanner(System.in).nextLine();
			System.out.println(" off course you will need a pan and");
			new Scanner(System.in).nextLine();
			System.out.println(" 2 large eggs");
			new Scanner(System.in).nextLine();
			System.out.println(" 1.3 cups of milk  ");
			new Scanner(System.in).nextLine();
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying\n ");
			new Scanner(System.in).nextLine();
		}
		else if (pan.equals("milk")){
			System.out.println("  well done!!! ");
			new Scanner(System.in).nextLine();

			System.out.println("  now i will tell you what else you will need :)");
			new Scanner(System.in).nextLine();
			System.out.println("  off course you will need a pan and");
			new Scanner(System.in).nextLine();
			System.out.println("  1 cup of flour"); 
			new Scanner(System.in).nextLine();
			System.out.println("  2 large eggs");
			new Scanner(System.in).nextLine();
			System.out.println("  the milk should be 1.3 cups  ");
			new Scanner(System.in).nextLine();
			System.out.println("  and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying\n ");
			new Scanner(System.in).nextLine();
		}
		else if (pan.equals("oil")){
			System.out.println(" well done!!! ");
			System.out.println(" OK lets go to the next part :)");
			System.out.println(" now i will tell you what else you will need :)");
			System.out.println(" off course you will need a pan and");
			System.out.println(" 1 cup of flour");
			System.out.println(" 2 large eggs");
			System.out.println(" 1.3 cups of milk or one cup and a little less than half added to it ");
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying \n");
		}
		else {
			System.out.println(" I dont think you will need what ever that is ");
			new Scanner(System.in).nextLine();
			System.out.println(" i sugest you to go with the ingridents I will give you ");
			new Scanner(System.in).nextLine();
			System.out.println(" off course you will need a pan and");
			new Scanner(System.in).nextLine();
			System.out.println(" 1 cup of flour");
			new Scanner(System.in).nextLine();
			System.out.println(" 2 large eggs");
			new Scanner(System.in).nextLine();
			System.out.println(" 1.3 cups of milk  ");
			new Scanner(System.in).nextLine();
			System.out.println(" and finally you will need");
			System.out.println("  1 tbsp sunflower or vegetable oil, plus a little extra for frying \n");
			new Scanner(System.in).nextLine(); 

		}
		System.out.println(" now that yoy have all the things you need, lets start cooking :)"); 
		System.out.println(" what would you do next?"); 

		Scanner mix= new Scanner(System.in);
		while(mix.hasNext()){
		String thenwt ;
		thenwt=mix.next();


		if (thenwt.equals("mix")){	
			System.out.println("Good job!!");
			System.out.println("that will be the first thing to do.");
			break;
		}
		else if (thenwt.equals("heat")){
			System.out.println("You might need to mix the ingredents first");
			break;
		}
		else if (thenwt.equals("cook")){
			System.out.println("you need a to mix ingredeants first to cook");
			break;

		}
		else if (thenwt.equals("bake")){
			System.out.println("you need a butter to bake. You should mix everything first");
			break;

		}
		else if (thenwt.equals("help")){
			System.out.println("you can mix everything first");
			break;
			
		}
		else {
			System.out.println("I dont know what you mean by "+ " ' " +thenwt + " ' ");
			System.out.println("type *help* if you dont know what to do next.");

		} }
		System.out.println(" whisk all the ingredents to a smooth batter 1 one jar "); 
		new Scanner (System.in).nextLine();
		System.out.println(" you can Set aside for 30 mins to rest if you have time, \n or start cooking straight away");
		new Scanner (System.in).nextLine();
		System.out.println("now you can start making your pancake");
		new Scanner (System.in).nextLine();
		System.out.println("type * tips * if you want  tips or"
				+ " just type * exit * if you know what to do after this");
		Scanner tip = new Scanner(System.in);
		while (tip.hasNext()){
		String tips;
		tips=tip.next();
		if (tips.equals("tips")){
			System.out.println("Heat your pan with a midium heat "); 
			new Scanner (System.in).nextLine();
			System.out.println(" Chocolate, peanut butter & banana fillings are sugested unless you are alergic to any of them "); 
			new Scanner(System.in).nextLine();
			System.out.println(" ENJOI YOUR PANCAKE! "); 
 break;
		}
		else if (tips.equals("exit")){
			System.out.println("ENJOI YOUR PANCAKE!");
			break;

		}


		else {
			System.out.println("Sorry I dont understand what "+ "*"+ tips + "* is");
			System.out.println("Type exit if you want to end this or tips if you want more tips");

            }
		}
		   System.out.println("Thank You for visiting Mama's Kitchin!!");


	}
}
