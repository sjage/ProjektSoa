package um.si.feri.bank;
import javax.xml.bind.annotation.XmlElement;

public class Primanje {

	private String TRR;
	private String TRR2;
	private double vnos;
	public Primanje(){ 
		
	}
public Primanje(String TRR,String TRR2, double vnos){ 
		this.TRR= TRR;
		this.vnos= vnos;
		this.TRR2=TRR2;
	}
@XmlElement(name="TRR posiljatelja: ")
public String getTRR(){ 
	return TRR;
	
}
public void setTRR(String TRR){ 
	this.TRR= TRR;
	
}
@XmlElement(name="TRR primatelja: ")
public String getTRR2(){ 
	return TRR2;
	
}
public void setTRR2(String TRR2){ 
	this.TRR2= TRR2;
	
}

@XmlElement(name="iznos placila: ")
public double getVnos(){ 
	return vnos;
}
public void setVnos(double vnos){ 
	this.vnos= vnos;
	
}


}
