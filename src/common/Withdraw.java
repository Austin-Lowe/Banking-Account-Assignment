/** Name: Austin Lowe
 Course: CNT 4714 Spring 2018
 Assignment title: Project 2 – Synchronized, Cooperating Threads Under Locking
 Due Date: February 11, 2018
**/
package common;

import java.util.Random;

/**
 * @author Austin
 *
 */
public class Withdraw extends Transactions{
	
	private static Random rand = new Random();
	private Account thisAccount;
	private int deduction;
	private String threadName;
	
	public Withdraw(Account bank)
	{
		thisAccount = bank;
	}
	
	public void run()
	{
		threadName = Thread.currentThread().getName();
		
		while(true)
		{
			deduction = rand.nextInt(49) + 1;
			if(deduction % 2 != 0 )
			{
				deduction++;
			}
			thisAccount.deduct(deduction, threadName);
			Thread.yield();
			try {
				Thread.sleep(rand.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Error: " + e.getMessage());
			}
		}
	}

	@Override
	public void printMessage() {
		System.err.printf("%s withdrew\n", threadName);

	}

}
