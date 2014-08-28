package behavior.observer.listener;

import java.util.List;

/**
 *  @ Project 	: The Best Practice
 *  @ File Name: VideoChannel.java
 *  @ Date 	: 2013-8-21
 *  @ author	: dengxiaotao@gmail.com
 */
public class VideoChannel implements Channel {
	
	List<Listener> listeners;
	
	@Override
	public void register(Listener o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Listener o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// Update program by time.
		update(20);
	}

	@Override
	public void update(int hour) {
		
	}

	
}
