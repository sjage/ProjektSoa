package um.si.feri.bank;

import javax.xml.bind.annotation.XmlElement;

public class PologResponse {

	private boolean obvestilo;

	public PologResponse(){ 
		
	}
	
public PologResponse(boolean obvestilo){ 
		this.obvestilo=obvestilo;
	}


public boolean getObvestilo(){ 
	return obvestilo;
	
}
@XmlElement(name="Uspešnost transakcije : ")
public void setObvestilo(boolean obvestilo){ 
	this.obvestilo= obvestilo;
	
}

}
