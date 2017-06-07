import java.util.ArrayList;
import java.util.List;

public abstract class Animais {
	
	public abstract void avisaDepartamento();
	
	public abstract void geraRelatorio();
	
	public abstract Ave criaAve();
	
	public abstract Reptil criaReptil();
	
	public final void medidasTomadas(){
		
		avisaDepartamento();
		geraRelatorio();
	}
	


}
