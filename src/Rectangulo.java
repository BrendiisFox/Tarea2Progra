
public class Rectangulo {
	int b;
	int alt;
	
	Rectangulo(int b , int alt)
	{
		this.b = b;
		this.alt = alt;
	}
	
	int getBase()
	{
		return b;
	}
	
	int getAltura()
	{
		return alt;
	}
	
	void setBase( int b)
	{
		this.b = b;
	}
	
	void setAltura( int alt)
	{
		this.alt = alt;
	}
	
	int getPerimetro()
	{
		return ((alt * b) *2);
	}
	
	int getArea()
	{
		return (alt * b);
	}

}
