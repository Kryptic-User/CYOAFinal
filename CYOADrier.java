import java.util.*;

public class CYOADrier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while(con == true) {
			
			System.out.println("Whats your name?");
			String name = scan.next().toLowerCase();
			
			CYOAObject story = new CYOAObject(name);
			story.introScene();
			String choice1 = scan.next().toLowerCase();
			
			
			if(choice1.equalsIgnoreCase("no")) {
				story.exampleOutcome1();
			} else if(choice1.equals("yes")) {
				story.exampleOutcome2();
				
				// Start of the Actual Story
				story.scenario1();
				Scanner scan2 = new Scanner(System.in);
				String choice2 = scan2.nextLine().toLowerCase();
				
				if(choice2.equals("use lighter")) {
					story.outcome1();
				}
				else if(choice2.equals("use flashlight")) {
					story.outcome2();
					story.scenario2();
					String choice3 = scan2.nextLine().toLowerCase();
					
					
					if(choice3.equals("slowly approach the man") || choice3.equals("approach man")) {
						story.outcomeOne();
					}
					else if(choice3.equals("turn around")) {
						story.outcomeTwo();
					}
					else if(choice3.equals("go back inside") || choice3.equals("go inside")) {
						story.outcomeThree();
					}
					else if(choice3.equals("turn tail and run") || choice3.equals("turn and run")) {
						story.outcomeFour();
					}
					
				}
				else if (choice2.equals("eat protein bar")) {
					story.outcome3();
				}
				else if(choice2.equals("walk around in the dark") || choice2.equals("walk around")) {
					story.outcome4();
				}
				
				System.out.println("You Died.");
				}
				
				
				
				System.out.println("Would You Like To Play Again?"
						+ "\n"
						+ "\nYes/No");
				String playerResponse = scan.next().toLowerCase();
				
				if(playerResponse.equals("yes")) {
					con = true;
				}
				else if(playerResponse.equals("no")) {
					con = false;
				}
			
			}
			System.out.println("Thank you for playing");
			
		}
	}
