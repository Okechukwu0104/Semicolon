

public class Nokia {
static Scanner userInput = new Scanner(System.in);
 
    public static void mainMenu() {
        System.out.print("""
                NOKIA

                MENU

                1-> Phonebook
                2-> Messages
                3-> Chat
                4-> Call Register
                5-> Tones
                6-> Settings
                7-> Call divert
                8-> Games Sections
                9-> Calculator        
                10-> Reminders
                11-> Clock 
                12-> Profiles
                13-> SIM services 
                0-> Exit
                """);

        int menuOptions = userInput.nextInt();
        switch (menuOptions) {
            case 1: phonebookMenu();
		 break;

            case 2: messagesMenu();
		 break;

            case 3: chatMenu();
		 break;

            case 4: callRegisterMenu();
		 break;

            case 5: tonesMenu();
		 break;

            case 6: settingsMenu(); 
		break;
            case 7: callDivertMenu();
		 break;
            case 8: gamesMenu(); 
		break;
            case 9: calculatorMenu();
		 break;
            case 10: reminderMenu();
		 break;
            case 11: clockMenu(); 
		break;
            case 12: profilesMenu(); 
		break;
            case 13: simServicesMenu();
		 break;
            case 0: System.out.print("NOKIA.....Connecting People"); 
		break;
            default: System.out.print("Pls pick a valid number");
		 break;
        }
    }

    public static void phonebookMenu() {
        System.out.print("""
                PHONE BOOK

                1-> Search
                2-> Service Nos.
                3-> Add Name
                4-> Erase
                5-> Edit
                6-> Assign Tone
                7-> Send b'card
                8-> Options
                9-> Speed dials
                10-> Voice tags
                0-> Back
                """);

	Scanner userInput = new Scanner(System.in);
        int phoneBookSection = userInput.nextInt();

        switch (phoneBookSection) {
            case 1: System.out.print("Search...");
		 break;
            case 2: System.out.print("Service Nos...");
		 break;
            case 3: System.out.print("Add name..."); 
		break;
            case 4: System.out.print("Erase...");
		 break;
            case 5: System.out.print("Edit...");
		 break;
            case 6: System.out.print("Assign tone...");
			 break;
            case 7: System.out.print("Send b'card..."); 
			break;
            case 8: caseEight(); 
		break;
            case 9: System.out.println("Speed dials..."); 
		break;
            case 10: System.out.println("Voice tags..."); 
		break;
            case 0: mainMenu(); 
		break;
            default: System.out.println("Pls pick a valid number");
		 break;
        }
    }




    public static void caseEight() {


        System.out.print("""
                1-> Type of view
                2-> Memory status
                0-> Back
                """);

	Scanner userInput = new Scanner(System.in);
        int case8Input = userInput.nextInt();

        switch (case8Input) {
            case 1: System.out.print("Type of view"); break;
            case 2: System.out.println("Memory status"); break;
            case 0: break;
            default: System.out.println("Pls pick a valid number"); break;
        }
    }



    public static void messagesMenu() {
        System.out.print("""
                MESSAGES

                1-> Write messages
                2-> Inbox
                3-> Outbox
                4-> Picture messages
                5-> Templates
                6-> Smileys
                7-> Message settings
                0-> Back
                """);

	Scanner userInput = new Scanner(System.in);
        int messageSubSection = userInput.nextInt();

        switch (messageSubSection) {
            case 1: System.out.print("Write messages...");
			 break;
            case 2: System.out.print("Inbox...");
		 break;
            case 3: System.out.print("Outbox..."); 
		break;
            case 4: System.out.print("Picture messages...");
			 break;
            case 5: System.out.print("Templates..."); 
			break;
            case 6: System.out.print("Smiley..."); 
			break;
            case 7: messageSettingsMenu(); 
		      break;
            case 0: mainMenu(); 
			break;
            default: System.out.println("Pls pick a valid number"); 
			break;
        }
    }




    public static void messageSettingsMenu() {
        System.out.println("""
                MESSAGE SETTINGS

                1-> Set 1
                2-> Common
                0-> Back
                """);
	Scanner userInput = new Scanner(System.in);
        int messageSettingsSection = userInput.nextInt();

        switch (messageSettingsSection) {
            case 1: set1Menu();
		 break;
            case 2: System.out.println("Common..."); 
		break;
            case 0: messagesMenu();
		 break;
            default: System.out.println("Pls pick a valid number"); 
		break;
        }
    }




    public static void set1Menu() {
        System.out.print("""
                1-> Message center number
                2-> Message sent as
                3-> Message validity
                0-> Back
                """);
	Scanner userInput = new Scanner(System.in);
        int set1SubSection = userInput.nextInt();

        switch (set1SubSection) {
            case 1: System.out.print("Message center number...");
		 break;
            case 2: System.out.print("Message sent as...");
		 break;
            case 3: System.out.print("Message validity...");
		 break;
            case 0: messageSettingsMenu();
		 break;
            default: System.out.println("Pls pick a valid number...");
		 break;
        }
    }

    public static void chatMenu() {
        System.out.println("CHATS...");
    }







    public static void callRegisterMenu() {
        System.out.print("""
                CALL REGISTER

                1-> Missed calls
                2-> Received calls
                3-> Dialed Numbers
                4-> Erase recent call lists
                5-> Show call duration
                6-> Show call cost
                7-> Clear counters
                8-> Prepaid credit
                0-> Back
                """);


	Scanner userInput = new Scanner(System.in);
        int callRegisterSections = userInput.nextInt();

        switch (callRegisterSections) {
            case 1: System.out.print("Missed calls..."); 
			break;
            case 2: System.out.print("Received calls..."); 
			break;
            case 3: System.out.print("Dialed Numbers...");
			 break;
            case 4: System.out.print("Erase recent call lists..."); 
			break;
            case 5: callRegisterCaseFive();
			 break;
            case 6: callRegisterCaseSix();
			 break;
            case 7: callRegisterCaseSeven();
			 break;
            case 8: System.out.print("Prepaid credit...");
			 break;
            case 0: mainMenu();
			 break;

            default: System.out.println("Pls pick a valid number...");
			 break;
        }
    }





    public static void callRegisterCaseFive() {
        System.out.println("""
                1-> Last call duration
                2-> All calls' duration
                3-> Received calls' duration
                4-> Dialled calls' duration
                5-> Clear Timers
                0-> Back
                """);
		
		Scanner userInput = new Scanner(System.in);
        int callRegisterSubSection = userInput.nextInt();

        switch (callRegisterSubSection) {
            case 1: System.out.print("Last call duration...");
		 break;
            case 2: System.out.print("All calls' duration...");
		 break;
            case 3: System.out.print("Received calls' duration...");
		 break;
            case 4: System.out.print("Dialled calls' duration..."); 
		
		break;
            case 5: System.out.print("Clear Timers..."); 
		break;
            case 0: callRegisterMenu(); 
		break;
            default: System.out.println("Pls pick a valid number"); break;
        }
    }





    public static void callRegisterCaseSix() {
        System.out.print("""
                1-> Last call cost
                2-> All calls' cost
                3-> Clear counters
                0-> Back
                """);
       Scanner userInput = new Scanner(System.in);
        int callCostsSubSection = userInput.nextInt();

        switch (callCostsSubSection) {
            case 1: System.out.print("Last call cost...");
		 break;
            case 2: System.out.print("All calls' cost...");
		 break;
            case 3: System.out.print("Clear counters...");
		 break;
            case 0: callRegisterMenu();
		 break;
            default: System.out.println("Pls pick a valid number"); 
		break;
        }
    }

    public static void callRegisterCaseSeven() {
        System.out.println("""
                1-> Call cost limit
                2-> Show costs in
                0-> Back
                """);

       	Scanner scanner = new Scanner(System.in);
	int callCostsSettingsSubSection = scanner.nextInt();


        switch (callCostsSettingsSubSection) {
            case 1: System.out.print("Call cost limit...");
		 break;
            case 2: System.out.print("Show costs in...");
		 break;
            case 0: callRegisterMenu();
		 break;
            default: System.out.println("Pls pick a valid number");
		 break;
        }
    }


public static void tonesMenu(){

		System.out.print(""" 

				TONES MENU

				1 -> Ringing Tone
				2 -> Ringing Volume
				3 -> Incoming Call Alert
				4 -> Composer
				5 -> Message Alert Tone
				6 -> Keypad Tones
				7 -> Warning And Games Tones
				8 -> Vibrating Alert
				9 -> Screen Saver
				0 -> Back to Main Menu
			
				""");


		Scanner scanner = new Scanner(System.in);
		int tonesChoice = scanner.nextInt();

		switch(tonesChoice){

			case 1: System.out.println("Ringing Tone");
				 break;
			case 2: System.out.println("Ringing Volume");
				 break;
			case 3: System.out.println("Incoming Call Alert");
				 break;
			case 4: System.out.println("Composer");
				 break;
			case 5: System.out.println("Message Alert Tone");
				 break;
			case 6: System.out.println("Keypad Tones");
				 break;
			case 7: System.out.println("Warning And Games Tones");
				 break;
			case 8: System.out.println("Vibrating Alert");
				 break;
			case 9: System.out.println("Screen Saver");
				 break;
			case 0: mainMenu();
				 break;
	

		}

	}


                    public static void settingsMenu(){

				System.out.print( """ 

				SETTINGS

				1 -> Call Settings
				2 -> Phone Settings
				3 -> Security Settings
				4 -> Restore Factory Settings
				5 -> Back to Main Menu
			
				""";

		
		
		Scanner tonesChoice = new Scanner(System.in);
		int tonesChoice = scanner.nextInt();

		switch(tonesChoice){

			case 1: callSettings(); 
			     break;
			case 2: phoneSettings(); 
			      break;
			case 3: securitySettings();
				 break;
			case 4: System.out.println("Restore Factory Settings");
				 break;
			case 5: mainMenu(); 
			        break;
			default : System.out.println("Pls pick a valid number");
				 break;
	

		}

	}


		public static void securitySettings(){

			 System.out.print(""" 

				SECURITY SETTINGS

				1 -> PIN Code Request
				2 -> Call Barring Service
				3 -> Fixed Dialling 
				4 -> Closed User Group
				5 -> Phone Security
				6 -> Change Access Codes
				7 -> Back to Previous Menu
				8 -> Back to Main Menu
			
				""");

		Scanner userInput = new Scanner(System.in);
		int securitySettingsChoice =userInput.nextInt();

		switch(securitySettingsChoice){

			case 1: System.out.println("PIN Code Request"); 
				break;
			case 2: System.out.println("Call Barring Service");
				 break;
			case 3: System.out.println("Fixed Dialling");
				 break;
			case 4: System.out.println("Closed User Group");
				 break;
			case 5: System.out.println("Phone Security");
				 break;
			case 6: System.out.println("Change Access Codes");
				 break;
			case 7: settings(); 
				break;
			case 8: mainMenu(); 
				break;
			default : System.out.println("Pls pick a valid number");
				 break;
		}

	}





public static void clock(){

			System.out.print( """ 

				Welcome to Clock Settings Menu!

			
				1 -> Alarm Clock
				2 -> Clock Settings
				3 -> Date Settings 
				4 -> Stopwatch
				5 -> Countdown Timer
				6 -> Auto Update Of Date And Time
				7 -> Back to Main Menu
			

				""");

		Scanner scanner = new Scanner(System.in);
		int clockChoice = scanner.nextInt();

		switch(clockChoice){

			case 1: System.out.println("Alarm Clock"); 
				break;
			case 2: System.out.println("Clock Settings");
				 break;
			case 3: System.out.println("Date Settings "); 
				break;
			case 4: System.out.println("Stopwatch");
				 break;
			case 5: System.out.println("Countdown Timer"); 
				break;
			case 6: System.out.println("Auto Update Of Date And Time");
				 break;
			case 7: mainMenu();
				 break;
			default : System.out.println("Pls pick a valid number");
				 break;
		}


	}



	










  }

               
