package behavior.observer.listener;

/**
 *  @ Project 	: The Best Practice
 *  @ File Name: MrB.java
 *  @ Date 	: 2013-8-21
 *  uthor	: dengxiaotao@gmail.com
 */
public class MrB implements Listener {
	
	@Override
	public void update(String program) {
		if(program.equals("NBA")){
			//Update my program and notify me.
		}
	}

	@Override
	public void listen(Channel channel) {
		channel.register(this);
	}
}
