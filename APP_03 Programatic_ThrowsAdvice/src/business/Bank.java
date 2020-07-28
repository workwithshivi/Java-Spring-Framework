package business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {

	private int amount = 5000;
	private String accNo = "sbi123";

	public int deposit(int amount, String accNo) {
		if (accNo.equals(this.accNo)) {

			Log log = LogFactory.getLog(Bank.class);
			log.info("diposit method***");
			
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AccountNoNotFoundException();
		}

	}

}
