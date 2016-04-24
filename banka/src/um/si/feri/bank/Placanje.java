package um.si.feri.bank;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Placanje")
@XmlType(propOrder={"pin", "TRR1", "TRR2", "iznos"} )

public class Placanje {

	 
	  private String TRR1;
	private String TRR2;
	private int pin;
	private double iznos;

	public Placanje(){ 
		
	}
public Placanje(int pin, String TRR1, String TRR2, double iznos){ 
	this.iznos=iznos;
	this.TRR1= TRR1;
	this.TRR2= TRR2;
	this.pin= pin;
		
	}

public String getTRR2(){ 
	return TRR2;
	
}
public void setTRR2(String TRR2){ 
	this.TRR2= TRR2;
	
}
@XmlElement(name="Iznos placanja")
public double getIznos(){ 
	return iznos;
	
}
public void setIznos(double iznos){ 
	this.iznos= iznos;
	
}
@XmlElement(name="TRR platitelja")
public String getTRR1(){ 
	return TRR1;
	
}
public void setTRR1(String TRR1){ 
	this.TRR1= TRR1;
	
}
@XmlElement(name="Unesi pin")
public int getPin(){ 
	return pin;
}
public void setPin(int pin){ 
	this.pin= pin;
	
}
}
