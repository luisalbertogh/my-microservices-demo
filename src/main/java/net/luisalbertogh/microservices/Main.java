/**
 * Main class. Launch all (registration service (Eureka), microservices and client app).
 */
package net.luisalbertogh.microservices;

import net.luisalbertogh.microservices.client.ClientApp;
import net.luisalbertogh.microservices.registration.ServiceRegistrationServer;
import net.luisalbertogh.microservices.riders.RidersServer;

/**
 * @author loga
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		String serverName = "NO-VALUE";

		/* Up to the passed arguments... */
		switch (args.length) {
			case 2:
				// Optionally set the HTTP port to listen on, overrides
				// value in the <server-name>-server.yml file
				System.setProperty("server.port", args[1]);
				// Fall through into ..
	
			case 1:
				serverName = args[0].toLowerCase();
				break;
	
			default:
				usage();
				return;
		}

		/* Registration service (Eureka) */
		if (serverName.equals("registration") || serverName.equals("reg")) {
			ServiceRegistrationServer.main(args);
		} 
		/* Microservices */
		else if (serverName.equals("services")) {
			RidersServer.main(args);
		} 
		/* Client app */
		else if (serverName.equals("client")) {
			ClientApp.main(args);
		}  
		/* Unknown */
		else {
			System.out.println("Unknown server type: " + serverName);
			usage();
		}
	}
	
	/**
	 * Usage info.
	 */
	private static void usage() {
		System.err.println("Usage: java -jar ... <server-name> [server-port]");
		System.err.println(
				"     where server-name is 'reg', 'registration', " + "'accounts' or 'web' and server-port > 1024");
	}

}
