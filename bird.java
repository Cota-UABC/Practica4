import java.util.Scanner;
import java.util.*;

public class bird{
	public static void main(String[] args) {
		int f=0, num;
		
		Personaje arregloPersonaje [] = new Personaje[3];
        arregloPersonaje[0]=new Personaje("Red","Rojo","ninguna","Cicular",50,"Ninguno");
        arregloPersonaje[1]=new Personaje("Blue","Azul","Separarse en tres","Cicular",30,"Hielo");
		arregloPersonaje[2]=new Personaje("Yellow","Amarillo","Ganar velocidad","Triangular",70,"Madera");
	
		Scanner sc= new Scanner(System.in);
		
		do{
			System.out.print("Que deseas hacer:"+
								"\n1.Ver atributos de Red"+
								"\n2.Ver atributos de Yellow"+
								"\n3.Ver atributos de Blue" +
								"\n4.Salir"+
								"\n\nIngresa numero: ");
								num = sc.nextInt();
								
								switch(num){
									case 1: arregloPersonaje[0].imprimir();
										break;
									case 2: arregloPersonaje[1].imprimir();
										break;
									case 3: arregloPersonaje[2].imprimir();
										break;
									case 4: f=1;
										break;
									default: System.out.println("\n-Ingresa una de las opciones--\n");
								}
		}while(f==0);
	//System.out.println("" + num);


	}
}

class Pajaro{
	int vida;
	String nombre,color,abilidad,shape,bloqueVentaja;
	
	public Pajaro(String nombre,String color,String abilidad,String shape,int vida,String bloqueVentaja){
			this.nombre = nombre;
			this.color = color;
			this.abilidad = abilidad;
			this.shape = shape;
			this.vida = vida;
			this.bloqueVentaja = bloqueVentaja;
	}

	
	public String getNombre() { 
		return nombre; 
	}
		
	public String getColor() { 
		return color; 
	}	
		
	public String getAbilidad() { 
		return abilidad; 
	}
		
	public String getShape() { 
		return shape; 
	}
	
	public int getVida() { 
		return vida; 
	}
	
	public String getBloque() { 
		return bloqueVentaja; 
	}
}

class Personaje extends Pajaro{
	
	public Personaje(String nombre,String color,String abilidad,String shape,int vida,String bloqueVentaja){
		super(nombre,color,abilidad,shape,vida,bloqueVentaja);
	}
	
	public void imprimir(){
		System.out.println("\n--Atributos del personaje--");
		System.out.println("Nombre: "+nombre);
		System.out.println("Color: "+color);
		System.out.println("Abilidad: "+abilidad);
		System.out.println("Forma: "+shape);
		System.out.println("Vida: "+vida);
		System.out.println("Bloque que destruye facilmente: "+bloqueVentaja+ "\n");
	}
}
