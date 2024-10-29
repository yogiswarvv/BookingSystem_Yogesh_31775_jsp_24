import java.util.Scanner;
class MainApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookDriverClass b = new BookDriverClass();
		boolean isStart = true;

		while (isStart) {
			System.out.println("Enter the choice : \n 1.To Add the Book \n 2.Display book based on cost and pages \n 3.Display booktitle and cost based on author Id \n 4.display richDadSonBook cost \n 5.update name and cost based on title \n 6.Remove book based on title \n 7.remove book based on author and cost \n8.Exit");
			int choice = s.nextInt();
			s.nextLine();  
			switch (choice) 
				{
				case 1: {
					System.out.println("enter the title");
					String s1 = s.nextLine();
					System.out.println("enter the cost");
					int cost = s.nextInt();
					System.out.println("enter the pages");
					int page = s.nextInt();
					s.nextLine(); 
					System.out.println("enter the author name");
					String s2 = s.nextLine();
					b.add(new Book(s1, cost, page, s2));
				}
				break;
				case 2: {
					System.out.println("enter the cost and pages");
					int cost = s.nextInt();
					int page = s.nextInt();
					b.displayBookPages(cost, page);
				}
				break;
				case 3: {
					System.out.println("enter the author");
					String s2 = s.nextLine();
					b.displayTitlecaost(s2);
				}
				break;
				case 4: {
					String s2 = "RichDadPoorSon";
					b.displaybooktitle(s2);
				}
				break;
				case 5: {
					System.out.println("enter the title");
					String s2 = s.nextLine();
					b.updateAuthorCost(s2);
				}
				break;
				case 6: {
					System.out.println("enter the title");
					String s2 = s.nextLine();
					b.removebasedontitle(s2);
				}
				break;
				case 7: {
					System.out.println("enter the author and cost");
					String s2 = s.nextLine();
					int cost = s.nextInt();
					b.removeBookauthorcost(s2, cost);
				}
				break;
				case 8: {
					isStart = false;
				}
				break;
				default:
					System.out.println("entered invalid choice");
			}
		}
	}
}
