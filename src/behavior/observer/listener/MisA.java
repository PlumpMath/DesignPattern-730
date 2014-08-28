package behavior.observer.listener;

import java.util.Calendar;

/**
 *  @ Project 	: The Best Practice
 *  @ File Name: MisA.java
 *  @ Date 	: 2013-8-21
 *  uthor	: dengxiaotao@gmail.com
 */
public class MisA implements Listener {

	@Override
	public void update(String program) {
		// My Logic
		int hour = Calendar.getInstance().get(Calendar.HOUR);
		
		if(hour < 24){
			//update my program channel.
		}
	}

	@Override
	public void listen(Channel channel) {
		channel.register(this);
	}

}
