
public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.issueCard("Pariwesh");
		bank.issueCard("Geetika");
		System.out.println(bank.cards);
	}
}
