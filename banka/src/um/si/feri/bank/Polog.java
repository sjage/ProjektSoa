package um.si.feri.bank;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name="Polog")
@XmlType(propOrder={ "pin", "TRR", "znesek"} )
public class Polog {

	private String TRR;
	private double znesek;
	private int pin;

	public Polog(){ 
		
	}
	
public Polog(String TRR,double znesek, int pin){ 
		this.TRR= TRR;
		this.znesek = znesek;
		this.pin= pin;
	}

@XmlElement(name="TRR")
public String getTRR(){ 
	return TRR;
	
}
public void setTRR(String TRR){ 
	this.TRR= TRR;
	
}

@XmlElement(name="Znesek:")
public double getZnesek(){ 
	return znesek;
}
public void setZnesek( double znesek){ 
	this.znesek = znesek;
}

@XmlElement(name="PIN:")
public int getPin(){ 
	return pin;
}
public void setPin(int pin){ 
	this.pin= pin;
	
}
}
