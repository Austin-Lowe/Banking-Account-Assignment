/** Name: Austin Lowe
 Course: CNT 4714 Spring 2018
 Assignment title: Project 2 – Synchronized, Cooperating Threads Under Locking
 Due Date: February 11, 2018
**/
package common;

/**
 * @author Austin
 *
 */
public interface Account {
	public void deposit(int value,String threadName );
	public void deduct(int value, String threadName);
}
