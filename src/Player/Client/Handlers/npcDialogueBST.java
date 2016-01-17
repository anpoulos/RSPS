import java.util.LinkedList;
import java.util.Queue;

	public class npcDialogueBST{
		
		private Node root;
		private Node current;
		
		private class Node{
			public String name;
			int data; //ID connected to the NPC
			private String[] lines;
			Node left;
			Node right;
			public Node(int j, String n, String ... l){
				data = j;
				name = n;
				lines = l;
			}
			
			public String getName(){
				return name;
			}
			
			public String[] getLines(){
				return lines;
			}
			
		}
				
		/**
		 * @return The current Node's NPC Name
		 */
		public String getName(){
			return current.getName();
		}
		
		/**
		 * @return The current Node's dialogue lines
		 */
		public String[] getLines(){
			return current.getLines();
		}
		
		public String GetNpcName(int npcID) {
			if(server.npcHandler.npcList2.exists(npcID))
				return server.npcHandler.npcList2.getName();
			System.out.println("NPC Name for "+npcID+" not found.");
			return null;
		}
		
		public npcDialogueBST(){
			generateLists();
		}
		
		/**
		 * Generates all the NPC information
		 */
		public void generateLists(){			
			//System.out.println("npcDialogueBST : Loading NPC Dialogue lists ... ");
			//long starting = System.currentTimeMillis();
			add(243,"Have you seen Arthur, our King?");
			add(239,"Have you seen Arthur, our King?");
			add(246,"Have you seen Arthur, our King?");
			add(240,"Have you seen Arthur, our King?");
			add(241,"Have you seen Arthur, our King?");
			add(242,"Have you seen Arthur, our King?");
			add(244,"Have you seen Arthur, our King?");
			add(245,"Have you seen Arthur, our King?");
			add(251,"Me and the boys are playing a friendly","game of hide and seek.","Get out of here!");
			add(806,"I'm sorry sir.","The Sinclairs are currently away","on vacation.");
			add(2180,"We've only had... er... no accidents.");
			add(388,"My favorite color is white.");
			add(731,"It's hard running a bar in a town like this.");
			add(680,"Unfortunately, the tanner's broken.");
			add(683,"Please, take a look at what I am selling.","I boast of nothing but the best","craftsmanship.");
			add(682,"This stuff's good for the light stuff, don't","expect to take a spear and be fine.");
			add(679, "Afternoon.");
			add(1799,"I really really really like rusty swords.");
			add(479,"Those Khazard bastards have been sieging us","for months now.");
			add(480,"They may seem like the stronger enemy, but what","we lack in strength, we make up for","with intelligence.");
			add(279,"Welcome to the Monastery!","Strange to build such a holy","place just north of the Fight Arena, eh?");
			add(281,"Bless you.");
			add(259,"No Khazard armor, no beer.");
			add(2332,"Mighty fine lookin hops patch, isn't it?");
			add(669,"Many years ago, I helped design","the Grand Tree... The structure"," and monument to my peoples.");
			add(3109,"Talk to tha' hand coz thish face ain't lishtnin.");
			add(593,"You call yourself a cook?");
			add(878,"Yanille needs to be heavily fortified and watched","at all times. The threats of","undead ogres lurk just West of us.",
					"That Wizard thinks his magic can save","this town? No way, it's through","strength in arms that we survive.");
			add(3108, "I've found some weird stuff in my","Sandbox before...");
			add(732,"People tend to just and drink","away their memories.");
			add(462,"Welcome to the Wizard's Guild!","I do hope you enjoy your stay.");
			add(461,"I do enjoy runes so much.");
			add(2059,"The Watchtower Wizard always brags","about his accomplishments. But, between","you and I, it wouldn't have","been possible without my research.",
					"I risked my life killing Zogres to","learn about their magical abilities.");
			add(872,"If it was not for me, we'd all be dead.","I helped the Ogres in Gu'Tanoth","by creating a defensive crystal","which protects their city from the Zogres.",
					"Now, if I did not do that, they would","have been overrun. We would","have easily been next.");
			add(852,"The lands West of here are where","a great battle happened between Ogres.","Some foul wizard has cursed that area,","bringing to life all undead ogres.");
			add(873,"Do not be shy, take a look","at what I am selling.");			
			add(874,"By being so large I can usually","bargain for the right price.");
			add(875,"Can I help you?");
			add(876,"Your weapons are so tiny.");
			add(858,"I like when humans look up to me.");
			add(859,"No funny stuff, okay?");
			add(860,"I eat animals larger than you.");
			add(861,"Mind the other guards, some of them","can be rather mean.");
			add(857, "I make sure the Gnome pilot does not get attacked","by any of the surrounding Jogres.");
			add(1526,"I'm sorry, but at the moment","we just can't afford","to run the Castle Wars game.");
			add(1704,"I used to captain one of the finer vessels","that ported here.");
			add(1042,"Some of these folks here look rather strange.","Rumor has it, they have fangs for teeth.",
			"But, me personally, I ain't seen any.");
			add(1038, "Fresh, dank, meat.");
			add(1041,"I hate the smell of the swamp.");
			add(1039, "Please take a look at my fine wares.");
			add(1054,"They gave me a big responsibility,","to make sure this gate is guarded.");
			add(1701,"Strange how we died and could not rest,","yet, the cows do it year after year.");
			add(1703,"'Ere I watch the waters for eternity.");
			add(1699, "Are you scared of Ghosts?");
			add(1700,"Greetings, care for a room?","Or, are you here to fix the roof?");
			add(1697, "I don't remember dying.");
			add(1686, "We worship the Ectofuntus.");
			add(1685, "I've been protesting for so long","that I've forgotten why I am protesting.");
			add(1684,"Do you like what I've built?","It's glorious... I call it the Ectofuntus...");
			add(1385,"Far East of here lies the compounds of","the demigods for the God Wars.","Kill their minions to gain entrance to their","domain.",
					"The demigods may be found in the pass","which stretches through Death Plateau.","The more kills you have of their minions","means the rewards will be greater.");
			add(1284,"A stout is all I've ever needed.");
			add(1301,"Fancy a fancy cloak?");
			add(1281,"Sometimes the creatures from East wander","towards our village. That's when","it becomes my responsibility","to protect this town.");
			add(1288,"You wouldn't take away an","old man's walking-stick,","would you?");
			add(1282,"Wish to have a fish?");
			add(1286, "I once was an adventurer like you.");
			add(1300, "Care for a pint?");
			add(1265,"Let me sing you a tune.");
			add(1294,"East of here lies the hoards of monsters","from those foresakened demigods.");
			
			add(792,"I am Grip... I think.");
			add(1595, "If you're going down there,","make sure you have a hatchet.","it is required to navigate.");
			add(846,"You're not from around here.");
			add(510,"Normally I could send you wherever","you wanted to go in this cart.","Unfortunately, the cart's broken","and is under construction for now.");
			add(2330,"I'm usually watching over","the farming patches. However,","I just wanted to relax today.");
			add(588,"Need any accessories?");
			
			add(1171,"I hate young whippersnappers.","You wouldn't happen to be one of them?");
			
			add(3110,"I like sand.");
			
			add(933, "You can buy a shovel from my shop.","Use a shovel on a mound to","enter that tomb. Killing a brother","will add their gear",
					"as a possible reward to","the reward chest. You can","enter the crypts below by","opening a brother's Sarcophagus.");
			
			add(793,"Would you like a beer?");
			add(794,"Careful back here!","I'm dealing with plenty of hot meals.");
			
			add(717,"If you are not from here then","it would be in your best interest","to stay far away from this place.");
			add(718,"If you notice any sores or welts,","then you might be infected.");
			add(719,"We treat those who have plague.");
			
			add(711, "Welcome to the slums, my slums.","I am the Warder of this city.");
			
			add(2650,"I try to document everything with my camera.");
			add(2649,"People tend to take advantage of us.");
			add(2406,"You may have seen me around before.","I represent the Gnome kingdom","and its army.");
			add(485,"I'm half your height and","half as scared.");
			add(484,"Probably the first time someone","has looked up to you.");
			add(720,"We train the finest here.");
			add(367,"After working with chemicals for","so long... I have","started to see things...");
			add(343,"And what do you know of war?");
			add(342,"Rumour has it that there is a","great battle going on outside","the city walls.");
			add(364,"Welcome to my city, adventurer.");
			add(570,"Many of these are incredibly valuable.");
			add(574,"I sell only the finest wares.");
			add(571, "Hands off my food.");
			add(289, "You look healthy.");
			add(844, "Northwest of here is the Gnome","Stronghold. Those little","runts can be clever.");
			add(845, "Please do not bother Handelmort,","he hates outsiders.");
			add(673, "The Zoo may look empty now,","but just wait until we","fill it up.");

			add(366, "Outsiders are always sick.");
			add(714,"Mind the garden please.");
			
			add(1304, "There's fishing spots lining the shore South of here.");
			add(2369, "Outside the Tent is PVP.");
			
			add(1185, "The city is off-limits.");
			add(2358, "We don't usually see humans in these parts.");
			add(2367, "You look suspicious.");
			add(2364, "You remind me of the last Tyras","Spy that we caught.");

			
			add(2354, "Welcome to the bank.");
			add(2355, "Welcome to the bank.");
			add(2353,  "I sell clothes.");
			add(2352,  "I hope you enjoy my General Store.");
			add(2363, "I don't trust outsiders like you.");
			add(2365, "If you follow the Western Path, the wilds","open up and allow PVP.");		
			add(2366, "Beyond this point, the environment", "is player vs. player.");		
			add(1210,  "North, beyond this point, the environment", "is player vs. player.");		
			
			
			add(1216, "Pete", "Weather's hot and sticky up here.", "At least the poor structure of my", "house offers a breeze.");
			
			add("Banker", 494, "I can assist you with banking.");
			add("Banker", 495, "I can assist you with banking.");
			add("Banker", 496, "I can assist you with banking.");
			add("Banker", 2619, "I can assist you with banking.");

			add("Hickton", 575, "Haha, welcome to the 99 guild.", "Right across the bridge are", "many things that might interest", "an adventurer like yourself.");
	
			add("Guard", 925, "Follow the rules and avoid", "being beaten.");
			add( "Chancy",338, "This portal leads to the Kalphite Queen.", "Good luck my friend.");
			add("Guild Master", 198, "The area outside of the bank is", "a pking zone.", "This means players can attack you", "if you step outside this building.");
			add("Flynn", 580, "My shop has necessary items for", "your survival.");
			add("Cassie", 577, "When you have 100 PK points or more,", "you can trade me for", "special items.");
			add("Cave Monk",656,  "Be careful brother.","Once you have entered those","caves there is no exit back","to this location.");
			add("Reldo", 647, "The open sea warms my heart...");
			add("Ragnar", 1379, "I left my violent life to", "live in peace.");
			add("Shipyard Worker",675,  "You should talk to the captain", "if you feel like leaving", "the island.");
			add("Farmer", 1357, "I reside in the most peaceful island,","how could I not be happy?");
			add( "Gardener",1377, "This garden just won't grow...");
			add("Resident",663,  "Please do not bring violence to", "this peaceful sanctuary.");
			add("Monk", 657, "Many blessing upon you.");
			add("Monk", 658, "May you walk with god", "on this peaceful day.");
			add("Professor", 488, "The windws appear to be good", "for sailing this afternoon.");
			add("Wanderer", 2005, "All dead... all of them...");
			add("Rasolo", 1972, "I'm sorry, I can't maintain a shop out here.", "The conditions are too severe.");
			add("Neil", 1784, "Make your way south to Mort'ton for shelter.");
			add("Robert", 2639, "Hunting in these parts are excilerating!");
			add("Gossip",813,  "This path leads to Mort'ton");
			add("Svidi",1809,  "Beware the dangers of these parts.");
			add( "Jokul",1810, "Men in shining armor enter the", "dreaded tombs and do not return.");
			add("Ruantun",1916,  "Every night before I got to sleep I can", "hear the screams from the graveyard.");
			add( "Ospak", 1274,"We border the dreaded tombs of the brothers.");
			add("Claus", 886, "You seem like quite the cook yourself.");
			add("Peksa", 538, "Find yer' outfits her");
			add("Dommik", 545, "I sell supplies.");
			add("Bob", 519, "Get your basic weapons here.");
			add("Game Keeper", 276, "To enter the dragon's lair, you", "must have a shiny key in your", "inventory, which can be found in", "a chest somewhere in this maze.");
			add("Game Keeper", 1048, "The King Black Dragon can be found", "in this portal.");
			add("Game Keeper",1050, "God Wars Minigame is in this portal.");
			add("Scavvo", 537, "Mastered a skill? I sell", "the legendary 99 hoods.", "", "");
			add("Agility Instructor", 1662, "What the hell you looking at?!", "Start running that course!", 
					"", "");
			add("Agility Instructur", 1661, "Hop those hurdles!");
			add("Agility Instructor", 1660, "Get moving!");
			
			add("Luthas", 379, "The monks have a ship that goes", "to entrana, but you can only", "go with up to four items", "in your inventory.");
			
			add("RedBeard Frank", 375, "Treasure... Rumors...");
			add("Lorris", 377, "Trust me, I'm quite aware my", "name has the word seaman", "in it. Try not to laugh.");
			add( "Thresnor", 378,"Always work to be done", "when you're part of a crew.");
			add("Customs Officer",380,  "Regulating the imports", "is one of the hardest", "jobs in this town.");
			
			add("Galahad",218,  "Hello traveller!", "There's nothing more pleasent", "then the imported bannannas", "from Karamja.");
			
			add( "Strange Caretaker",2024, "I can feel their presence...");
			add("Town Local", 214, "Port Sarim is one of the largest", "ports in the land... it's", "pretty sad...");
			add("Shop Owner",531,  "Welcome to my store.");
			
			//System.out.println("npcDialogueBST : NPC Dialogue Lists loaded in "+(System.currentTimeMillis()-starting)+" ms");
		}
				
		/**
		 * Will search for a node by its ID value, and set that node to current if it exists.
		 * @param value ID to search for
		 * @return True if the node exists, false otherwise
		 */
		public boolean exists(int value){
			Node temp = findValue(value, root);
			if(temp != null){
				current = temp;
				return true;
			}
			return false;
		}
		
		/**
		 * Private recursive search method
		 * @param numb Number to search for
		 * @param r Root to start searching from
		 * @return The node containing the value, or Null if the value was not found
		 */
		private Node findValue(int numb, Node r){
			if(r == null) return null;
			if(numb < r.data){ //search left
				if(r.left != null)
					return findValue(numb, r.left);
				return null; //means it was not found
			}
			if(numb > r.data){ //search right
				if(r.right != null)
					return findValue(numb, r.right);
				return null; //means it was not found
			}
			if(numb == r.data)
				return r;
			return null;
		}
		
		/**
		 * Private recursive helper method for add method
		 * Finds the correct Node that the numb should be inserted after
		 */
		public Node findNode(int numb, Node r){
			if(numb < r.data){ //search left
				if(r.left != null)
					return findNode(numb, r.left);
				else return r;
			}
			if(numb > r.data){ //search right
				if(r.right != null)
					return findNode(numb, r.right);
				else return r;
			}
			
			return null; //if same entry found
			
		}	
		
		public void add (int numb, String ... lines){
			add( GetNpcName(numb),numb, lines);
		}
		
		public void add(String n, int numb, String ... lines){
			
			if(root == null){
				root = new Node(numb, n, lines);
				return;
			}
						
			Node temp = findNode(numb, root); //will get the correct node to insert
			if(temp == null){ //means a duplicate was found
				System.out.println(getClass().toString()+" [ERROR] - While adding to BST, duplicate found of "+numb);
				return;
			}
			
			if(numb < temp.data){ //place to the left
				temp.left = new Node(numb, n, lines);
			}
			if(numb > temp.data){ //place to the right
				temp.right = new Node(numb, n, lines);
			}
			
		}
		
	}