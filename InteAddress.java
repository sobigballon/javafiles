package keyWordTest;

import java.net.InetAddress;

public class InteAddress {
	public static void main(String[] args) throws Exception{
		if(args.length!=1) {
			System.err.println("Usage:WhoAmI MachineName");
			System.exit(1);
		}
		InetAddress a=InetAddress.getByName(args[0]);
		System.out.println(a);
	}

}
