package behavior.observer.listener;

import java.util.Calendar;
import java.util.List;

/**
 *  @ Project 	: The Best Practice
 *  @ File Name: NesChannel.java
 *  @ Date 	: 2013-8-21
 *  uthor	: dengxiaotao@gmail.com
 */
public class NewsChannel implements Channel {
	
	List<Listener> listeners;
	
	@Override
	public void register(Listener o) {
		listeners.add(o);
	}

	@Override
	public void detach(Listener o) {
		listeners.remove(o);
	}

	@Override
	public void run() {
		int hour = Calendar.getInstance().get(Calendar.HOUR);
		update(hour);
	}

	@Override
	public void update(int hour) {
		// TODO Auto-generated method stub
		
	}
}