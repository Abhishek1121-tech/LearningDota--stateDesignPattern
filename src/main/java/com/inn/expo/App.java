package com.inn.expo;

import com.inn.expo.machine.ATMMachine;

/**
 * state Pattern Example
 *
 */
public class App 
{
	public static void main(String[] args){
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2000);
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
	}
}
