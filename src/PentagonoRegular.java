
public class PentagonoRegular {

	int l;
	// l = lado
	PentagonoRegular(int l)
	{
		this.l = l;
	}
	
	int getLado()
	{
		return l;
	}
	
	void setLado(int l)
	{
		this.l = l;
	}
	
	int getPerimetro()
	{
		return l * 5;
		//calculo de are de un pentagono regular
	}
}
