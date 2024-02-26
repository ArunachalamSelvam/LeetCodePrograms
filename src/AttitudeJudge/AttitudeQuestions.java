package AttitudeJudge;

import java.util.Scanner;

public class AttitudeQuestions {

	static int points = 0;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("....Do You Have A Positive Attitude.... ");
		System.out.println(
				"Check Your Attitude By Responding To The Following Statements And \nChoose The Options Closest To Your Experience. \n\n\t BE HONEST!!!");
		System.out.println();
		System.out.print("Press 1 To Start : ");

		int choice = scanner.nextInt();
		int option=0;
		while (choice == 1) {
			System.out.println();
			System.out.println("1. I Am Under Stress As My Peers Have Achieved More Than I Have.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");
			

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("2. Whenever I Hear Someone Has Been Rewarded, I Do Not Feel Happy.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");
			

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}
			System.out.println();
			System.out.println(
					"3. When My Subordinate Accomplish The Given Task, I Tell Them There Is Still Scope For Improvement.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");
			
			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}
			System.out.println();
			System.out.println("4. I Feel Very Uncomfortable In Situations, Which Demand Change.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("5. I Know The HardWork Never Hurt AnyOne But 'Why Take A Chance.'");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");
			
			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("6. I Am Enthusiastic About The Success Of Others As I Am About My Own.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No :");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 4:
					points += 1;
					break;
				case 3:
					points += 2;
					break;
				case 2:
					points += 3;
					break;
				case 1:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println(
					"7. I Try To Forget The Mistakes Of The Past And Press On To Greater Achievements Of The Future.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No :");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 4:
					points += 1;
					break;
				case 3:
					points += 2;
					break;
				case 2:
					points += 3;
					break;
				case 1:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("8. I Feel UnHappy When There Are No Troubles To Speak Of.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("9. I Look The Glass As Half Empty.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			System.out.println("10. I Feel I Could Have Had More If I Had Put In A Little Extra.");
			System.out.println("\t1. Always \n\t2. Frequently \n\t3. Occasionally \n\t4. Never");
			System.out.print("Enter The Option No : ");

			while (true) {
				option = scanner.nextInt();
				switch (option) {
				case 1:
					points += 1;
					break;
				case 2:
					points += 2;
					break;
				case 3:
					points += 3;
					break;
				case 4:
					points += 4;
					break;
				default:
					System.out.println("Enter The Valid Option!!");
					continue;
				}
				break;
			}

			System.out.println();
			boolean flag = false;
			
	
			System.out.print("Press 1 To Finish .. : ");
			while (true) {
				option = scanner.nextInt();
				if(option==1) {
					display(points);
					break;
				}	
				else {
					System.out.println("Enter The Valid Option..");
					continue;
				}
			}
			System.out.println("points = " + points);
			break;
			}
	}

	public static void display(int points) {
		if (points >= 10 && points <= 22) {
			System.out.println(
					"There Is A Need For A Change In Attitude. Gradually Try To Change Your Mind Set.\nYou Should Make A Conscious Effort To Remain Optimistic If You Want A Successful Life..");
			System.out.println("... All The Best ...");
		} else if (points >= 23 && points <= 31) {
			System.out.println(
					"You Have A Tendency To Feel Dissatisfied With Your Achievements.\nPut In A Little Conscious Effort & You Will Emerge As A Winner.");
			System.out.println(
					"I Hope That The Day You Visit Me Again You got That You Asked For... Until Then Keep Trying..");
		} else if (points >= 32 && points <= 40) {
			System.out.println(
					"Congrats! You Have A Winner's Attitude.. Take Pride In Your Approach To Life & You Will Enjoy Success.");
		}
	}

}
