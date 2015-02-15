
public class Rectangulo {
	int b;
	int alt;
	*// b= base alt= altura
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
		*//Calculo el perimetro de un rectangulo
	}
	
	int getArea()
	{
		return (alt * b);
		*//Calculo el area de un rectagulo
	}

}
