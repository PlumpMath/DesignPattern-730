package behavior.observer.listener;

/**
 *  @ Project 	: The Best Practice
 *  @ File Name: Subject.java
 *  @ Date 	: 2013-8-21
 *  uthor	: dengxiaotao@gmail.com
 */
public interface Channel extends Runnable{
	
	public void register(Listener o);
	
	public void detach(Listener o);
	
	public void update(int hour);
}
