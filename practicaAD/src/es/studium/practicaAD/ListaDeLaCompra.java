package es.studium.practicaAD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//Creo los atributos
	
	private String nombreLista;
	private ArrayList<ArticuloAComprar> listaDeLaCompra = new ArrayList<ArticuloAComprar>();
	
		
	//Creo los constructores vacíos, por parámetros y los getters y setters
	
	public ListaDeLaCompra() {
		
		nombreLista="";
	}
	
	public ListaDeLaCompra(String nombreLista) {
		
		this.nombreLista=nombreLista;
	}
	
	public String getNombreLista() {
		
		return nombreLista;
	}
	
	public void setNombreLista(String nombreLista) {
		
		this.nombreLista=nombreLista;
	}
	
	//Creo los métodos
	
	public void agregarProductoAComprar(ArticuloAComprar articulo) {
		
		listaDeLaCompra.add(articulo);
	}
	
	public void eliminarArticulo(String descripcionArticulo) {
		
		for (int i=0;i<listaDeLaCompra.size();i++)
			borrarSi(descripcionArticulo, listaDeLaCompra.get(i));
	}
	
	private void borrarSi(String descripcionArticulo, ArticuloAComprar articulo) {
		
		if (articulo.getDescripcion().equals(descripcionArticulo))
			listaDeLaCompra.remove(articulo);
	}
	
	
	public List<ArticuloAComprar> getArticulos() {
		
		return listaDeLaCompra;
	}
	
	
	public void guardarListaDeCompra() {
		try {
				File articulosLista=new File(".\\"+nombreLista+".dat");
				FileOutputStream a=new FileOutputStream(articulosLista);
				ObjectOutputStream salida=new ObjectOutputStream(a);
				salida.writeObject(this);
				salida.close();
				a.close();
		}
		catch (Exception e) {
			e.getStackTrace();
			e.getMessage();
			System.out.println("Error.");
		}
	}
	
	
	public static ListaDeLaCompra salidaListaComprar(String archivo) {
		ListaDeLaCompra salidaLista=new ListaDeLaCompra (archivo);
		
		try {
			File salidaArchivo=new File(".\\"+archivo+".dat");
			FileInputStream b=new FileInputStream(salidaArchivo);
			ObjectInputStream entrada=new ObjectInputStream(b);
			salidaLista=(ListaDeLaCompra) entrada.readObject();
			entrada.close();
			b.close();
		}
		catch(Exception e) {
			e.getStackTrace();
			e.getMessage();
			System.out.println("Error.");
			
		}
		
		return salidaLista;
	}
}	
