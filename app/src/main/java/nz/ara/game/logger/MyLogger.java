/**
 * 
 */
package nz.ara.game.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author yac0105
 *
 */
public class MyLogger {
	
	public MyLogger() {
		BasicConfigurator.configure();
	}

	public Logger getLogger(Class<?> clazz) {
		return Logger.getLogger(clazz);
	}
	
}