package um.si.feri.bank;

import javax.xml.bind.annotation.XmlElement;

public class PrimanjeResponse {

	private double novostanje;

	public PrimanjeResponse(){ 
		
	}
public PrimanjeResponse(double novostanje){ 
		this.novostanje = novostanje;
	}
public double getNovoStanje(){ 
	return novostanje;
	
}
@XmlElement(name="TRR primatelja: ")
public void setTRR(double novostanje){ 
	this.novostanje= novostanje;
	
}

}
