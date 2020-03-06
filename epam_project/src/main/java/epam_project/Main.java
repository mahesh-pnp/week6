package epam_project;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		CustomList c=new CustomList();
		while(true) {
		System.out.println("Enter Your Choice:\n 1.Add Element \n 2.Remove Element \n 3.Display Elements \n 4.fetch Element \n 5.exit");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter element to insert");
			int i=sc.nextInt();
			c.insert(i);
			break;
		case 2:
			System.out.println("Enter element to delete");
			int i1=sc.nextInt();
			c.delete(i1);
			break;
		case 3:
			c.print();
			 break;
		case 4:
			System.out.println("Enter element to fetch");
			int i11=sc.nextInt();
			System.out.println(c.search(i11));
		case 5:
			System.exit(1);
		}
		}

	}

}
