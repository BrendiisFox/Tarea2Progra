
public class PentagonoRegular {

	int l;
	
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
	}
}
