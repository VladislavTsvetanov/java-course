package exceptions;

public class Main {

	public static void main(String[] args) throws NegativeMoneyException {
		try {
			PersonalAccount a = new PersonalAccount(500.0, "vasi", 654321321);
			CoorporativeAccount b = new CoorporativeAccount(153212.56, "BlaBla", 198726465);
			checkForInstance(a);
			checkForInstance(b);
		} catch (InvalidAccountException exp) {
			System.out.println("The exception is caught" + exp);
		}
	}

	public static void checkForInstance(Account object) throws InvalidAccountException {
		if (!(object instanceof Account)) {
			throw new InvalidAccountException();
		}
		if (object instanceof PersonalAccount) {
			System.out.printf("PersonalID: %d\n", ((PersonalAccount) object).getPersonalID());

		} else if (object instanceof CoorporativeAccount) {
			System.out.printf("BULSTAT: %d\n", ((CoorporativeAccount) object).getBulstat());

		}
	}

}
