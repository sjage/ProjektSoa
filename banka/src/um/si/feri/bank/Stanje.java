package um.si.feri.bank;
import javax.xml.bind.annotation.XmlElement;

public class Stanje {

	private String TRR;
	private int pin;

	public Stanje(){ 
		
	}
public Stanje(String TRR, int pin){ 
		this.TRR= TRR;
		this.pin= pin;
	}
@XmlElement(name="TRR: ")
public String getTRR(){ 
	return TRR;
	
}
public void setTRR(String TRR){ 
	this.TRR= TRR;
	
}
@XmlElement(name="Pin: ")
public int getPin(){ 
	return pin;
}
public void setPin(int pin){ 
	this.pin= pin;
	
}
}
