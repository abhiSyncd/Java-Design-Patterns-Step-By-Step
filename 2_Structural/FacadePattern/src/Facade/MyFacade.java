package Facade;

import SubClasses.OracleConnect;
import SubClasses.SQLConnect;

public class MyFacade {
	
	static SQLConnect sconnect;
	static OracleConnect oconnect;
	
	
	public static void getMyDBConnection(String type){
		
		if(type.equals("SQL")){			
			sconnect.getMySqlDBConnection();
		}
		else{		
			oconnect.getMyOracleDBConnection();	
		}			
	}
	
}

