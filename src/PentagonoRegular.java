
public class PentagonoRegular {

	int l;
	*// l = lado
	PentagonoRegular(int lado)
	{
		this.l = lado;
	}
	
	int getLado()
	{
		return l;
	}
	
	void setLado(int lado)
	{
		this.l = lado;
	}
	
	int getPerimetro()
	{
		return l * 5;
		*//calculo de are de un pentagono regular
	}
}
