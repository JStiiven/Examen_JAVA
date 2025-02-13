import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		 // Creacion de ArrayList.
		 
		ArrayList<String> productoInventario = new ArrayList<String>();
		ArrayList<Integer> cantidadProducto = new ArrayList<Integer>();
		
		// Inicializacion de variables
		String nombreProducto ="";
		int cantInicialProducto=0, actualizarCant=0;
		int menuP=0;
		
		
		// menu de opciones
		do {
			String menu = "Menu de opciones!\n";
			menu+="\n1. Agregar pruducto";
			menu+="\n2. Buscar Producto por nombre";
			menu+="\n3. Actualizar cantidad de producto";
			menu+="\n4. Eliminar producto";
			menu+="\n5. Mostrar inventario";
			menu+="\n6. Salir";
			
			// se imprime el menu
			menuP=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			// funcionamiento de las opciones del menu
			switch (menuP) {
			case 1:
				// permite agregar un producto y su cantidad
				nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto");
				
				productoInventario.add(nombreProducto);
				
				cantInicialProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial"));
				cantidadProducto.add(cantInicialProducto);
				
				break;
			case 2:
				
				// Busca el nombre del producto si esta o no
				nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto que desea buscar");
				
				if (productoInventario.contains(nombreProducto)) {
					for (int i = 0; i < productoInventario.size(); i++) {
							JOptionPane.showMessageDialog(null, "El producto "+nombreProducto+ " esta!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "No existe el producto "+nombreProducto);
				}
				break;
			case 3:
				// "actualiza" la cantidad del producto ingresado
				nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto que desea actualizar");
				if (productoInventario.contains(nombreProducto)) {
					
					actualizarCant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto"));
					
					cantidadProducto.add(actualizarCant);
					
					JOptionPane.showMessageDialog(null, "Producto actualizado!\n"+nombreProducto +" y su nueva cantidad: "+actualizarCant);
				} else {
					JOptionPane.showMessageDialog(null, "No existe dicho producto!");
				}
									
				break;
			case 4:
				// Elimina el producto ingresado
				nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto que desea eliminar");
				if (productoInventario.contains(nombreProducto)) {
					productoInventario.remove(nombreProducto);
					
				} else {
					JOptionPane.showMessageDialog(null, "No existe dicho producto!");
				}
				
				break;
			case 5:
				// muestra el inventario
				JOptionPane.showMessageDialog(null, "El inventario:\n\n"+"Producto "+productoInventario+"\nY su cantidad:"+cantidadProducto);
				break;
			case 6:
				// salida
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error!", "!!!", JOptionPane.WARNING_MESSAGE);
				break;
			}
		} while (menuP != 6);
	}

}
