
public class CYOAObject {
	private String name;
	
	public CYOAObject(String n) {
		this.name = n;
	}
	
	public void introScene(){
		System.out.println("Hello " + name + ", how are you? I am the narrator of this story."
				+ "\nI am here to present you scenarios, outcomes and decisions that you will be making in order to proceed with the game. Like this:"
				+ "\n"
				+ "\nWould You Like to continue the game?\n"
				+ "Yes/No");
	}
	
	public void exampleOutcome1() {
		System.out.println("Thank you for playing!");
	}
	
	public void exampleOutcome2() {
		System.out.println("Very well, let us begin...\n"
				+ "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"
				+ "\n"
				+ "\n");
	}
	
	public void scenario1() {
		System.out.println("You find yourself within a Terribly lit room."
				+ "\nYour head hurts, you have no memory of what happened nor who you once were, the only thing you remember is your name…\n"
				+ name);
		System.out.println("You look around the room and you notice that you are in a wooden cabin.\n"
				+ "It's very dark, and you're not sure you're actually in a cabin. Theres a familiar scent in the air, but you can't remember what it is."
				+ "\n"
				+ "You look around and find a lighter, a flashlight, and a protein bar near where you woke up."
				+ "\nWhat would you like to do?"
				+ "\n"
				+ "\nUse flashlight/Use lighter/Eat protein bar/Walk around");
	}
	
	public void outcome1() {
		System.out.println("You pick up the lighter and ignite it. It takes a few tries but you were finally able to light it…"
				+ "\nis what I would say if the cabin didn’t explode upon the first spark."
				+ "\nThat familiar scent turned out to be gasoline, and you just lit the fuse. You die quickly in a ball of flame");
	}
	
	public void outcome2() {
		System.out.println("You pick up the flashlight and you try to turn it on. To your relief, it works just fine."
				+ "\nThe flashlight cuts through the darkness revealing that you are indeed inside a cabin."
				+ "\nYou look around and find a couple of chairs, a table, and a leaking gas tank, that’s what the familiar smell was. Petroleum."
				+ "\nYou also found a set bear trap, you probably could have fallen victim to that trap if you decided to wander around in the dark."
				+ "\nThat wouldn’t have been a pretty sight.");
	}
	
	public void outcome3() {
		System.out.println("You take the protein bar and unwrap its contents."
				+ "\nThe edible looks like it’s been lying around for a while, it’s probably not safe to eat it."
				+ "\nYou eat at the bar anyway thinking \"What's the worst that could happen?\""
				+ "\nThe bar was poisoned. You lay there in writhing agony praying that the pain would end until finally, you die.");
	}
	
	public void outcome4() {
		System.out.println("You decide to get up from where you were and begin to walk around, looking for an exit."
				+ "\nYou go slowly so as to not break something, but within the darkness, you stub your toe on something."
				+ "\nIn your effort to grab your toe, you trip on something and fall towards the floor. Your face lands on a hard metallic surface."
				+ "\nThe moment your face makes contact, the surface sinks and you hear a click sound, almost like a trigger."
				+ "\n"
				+ "\nYou suddenly feel sharp metallic fangs enclose your head with extreme speed and force."
				+ "\nBefore the pain hits, your head is crushed between the metal contractions.");
	}
	
	public void scenario2() {
		System.out.println("You carefully make your way out of the cabin trying not to set off the bear trap,"
				+ "\nand you're also trying to get out of there as fast as you can since the petrol is starting to make you feel nauseous."
				+ "\nAfter getting out of the cabin, you find yourself in a clearing, it’s dark outside, and the only light source is a full moon."
				+ "\n"
				+ "\nYou hear a howling in the distance, but it seems to be getting closer."
				+ "\nYou wave your flashlight around to find the source until you land upon what seems to be a grown man crouched down on the floor."
				+ "\nWhat would you like to do?"
				+ "\n"
				+ "\nAppraoch the man/Turn around/Go back inside/Turn tail and run");
	}
	
	public void outcomeOne(){
		System.out.println("You slowly start your way towards the crouching man, and call out to him asking for directions to the nearest town."
				+ "\nWhen you get to about 5 feet of the man, the figure starts to stand."
				+ "\nThe light of the moon reveals a grotesque figure towering over you by a good 3 feet."
				+ "\nThe man was impossibly tall, and pale. Skinny as if he has never eaten before."
				+ "\nHe was wearing a tuxedo, but that wasn’t the oddest part about him."
				+ "\n"
				+ "\nYou look up to meet this creatures gaze, only to be meet with shock and terror."
				+ "\nThe man had no facial features. No eyes, no mouth, no nose, how can he breathe?"
				+ "\nHow can a being of this stature exist?"
				+ "\n"
				+ "\nBefore you could react, the man leapt at you."
				+ "\nYou let out a bone chilling scream, as the man starts to tear you apart limb from limb, until finally, it’s over."
				+ "\nThe last thing you see before your head is torn off, is the faceless head of the pale man.");
	}
	
	public void outcomeTwo() {
		System.out.println("You decide to not bother the man and you turn around and take your leave."
				+ "\nRight as you do that, you feel a sharp pain pierce your chest."
				+ "\nYou look down and see a large piece of shrapnel sticking out through your torso."
				+ "\nYou turn around to see where the object came from, but you are met with a faceless, pale man, face in front of yours."
				+ "\nThe last thing you hear before you die is…"
				+ "\n"
				+ "\n\"Lets play again\" followed by a sinister laugh");
	}
	
	public void outcomeThree() {
		System.out.println("You decide that it may be safer within the cabin and you turn around to open the door and reenter the shelter."
				+ "\nYou hear a loud snap before you reach the door handle. You turn around and find that the crouching man had disappeared."
				+ "\nThinking you should head inside, you open the door."
				+ "\nAs you pull open the door, and ax swings your way, impaling you through the head, killing you instantly");
	}
	
	public void outcomeFour() {
		System.out.println("You’re filled with immense fear, something about the man fills you with an other worldly terror."
				+ "\nYou turn and run as fast as you could, but in your haste, you drop your flashlight and you run blind, into the nearby woods."
				+ "\nYou hear a sinister, and maniacal laughter behind you."
				+ "\nThe trees block the remaining light from the moon, this causes you to run into a bear, making it angry and it mauls you to death.");
	}
	
	
}
