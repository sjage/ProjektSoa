package um.si.feri.bank.imp;
import um.si.feri.bank.Placanje;
import um.si.feri.bank.PlacanjeResponse;
public class BankImp {

	Placanje plati= new Placanje();
	PlacanjeResponse odgplati = new PlacanjeResponse();
	
	public boolean Placanje(int pin, String TRR1, String TRR2, double iznos){
		int pinSize= 0;
		pinSize= pin;
		plati.setPin(plati.getPin());
		if(pinSize != 4 ){
			odgplati.setStanjePlacanja(false);
			
		}
		else if ( pinSize== 4) 
		odgplati.setStanjePlacanja(true);
		
		if(TRR1 == "SI56xxxxxyyyyyyyyyy")
			return true;
		
		
		
		return true;
	}
	public boolean PlacanjeResponse(boolean stanjePlacanja){
		
		
		return true;
	}
	
}
