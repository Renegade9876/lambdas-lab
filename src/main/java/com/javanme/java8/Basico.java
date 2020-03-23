package com.javanme.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Para quitar las referenciaas tipo: Collectors.toList();
import static java.util.stream.Collectors.*;

/**
 * Clase con ejercicios nivel básico
 * Created by aalopez on 18/08/15. 
 */
public class Basico {

    /**
     * Convertir a mayúsculas cada una de las palabras recibidas como parámetro.
     * Trata de usar uno de los nuevos métodos adicionados a las listas en Java 8, verifica cual método permite
     * reemplazar los items de la lista por medio de una función.
     *
     * @param palabras Listado de palabras a convertir
     * @return Lista que contiene las palabras en mayúsculas
     */
    public List<String> ejercicio1(List<String> palabras) {
    	List<String> palabrasMayusculas = new ArrayList<>();
    	try {
    		palabrasMayusculas = palabras.stream()
    				.map(String::toUpperCase)
        			.collect(Collectors.toList());
		
    		System.out.println(palabrasMayusculas);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return palabrasMayusculas;
    }
    
    /**
    Alexis Lopez (@aa_lopez): https://www.oracle.com/technetwork/es/articles/java/expresiones-lambda-api-stream-java-2737544-esa.html
    +map(Function<T, R>): Stream<R>
	Retorna un Stream que contiene el resultado de aplicar la función pasada por parámetro a todos los elementos del Stream.
	Transforma los elementos del tipo T al tipo R.

	El siguiente ejemplo muestra cómo transformar un Stream de cadenas a otro Stream de esas mismas cadenas pero en mayúsculas.
	La función usada en este caso es una función (expresión lambda) dónde T y R son de tipo java.lang.String:

	List<String>  paises = Arrays.asList("Colombia", "Perú",  "Panamá"); 
	//Stream cuyos elementos son los países en mayúsculas 
	Stream<String>  stream = paises.stream().map(String::toUpperCase);
	*/

    
    
    
    
    
    
    
    /**
     * Del listado de cadenas de texto eliminar las cadenas de ese listado cuyo tamaño sea inferior o igual a 10 caracteres.
     * Trata de usar uno de los nuevos métodos adicionados a las listas en Java 8
     *
     * @param listado cadenas de texto. Atención: Este listado es no modificable, por lo que una nueva lista de debe ser
     * creada a partir de este listado, por ejemplo: {@code List<String> nuevaLista = new ArrayList<>(listado);}
     * @return lista que contiene cadenas de texto cuyo tamaño de caracteres es superior a 10
     */
    public List<String> ejercicio2(List<String> listado) {
    	List<String> palabrasLargas = new ArrayList<>();
    	try {
    		palabrasLargas = listado.stream()
    				.map(String::toUpperCase)
    				.filter(s -> s.length()>4)
        			.collect(Collectors.toList());
		
    		System.out.println(palabrasLargas);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return palabrasLargas;
    }
    
    /**
    Alexis Lopez (@aa_lopez): https://www.oracle.com/technetwork/es/articles/java/expresiones-lambda-api-stream-java-2737544-esa.html
	+filter(Predicate<T>):Stream<T>
	Retorna un Stream que contiene sólo los elementos que cumplen con el predicado pasado por parámetro.
	
	List<String> ciudades = ... 
	
	//Stream de ciudades cuya primera letra es C de Cali 
	Stream  stream = ciudades.stream() 
		.filter(s ->  s.charAt(0) == 'C');     
    */
    
    
    
    
    
    

    /**
     * Del listado pasado como parámetro, une la tercera, cuarta y quinta cadena separadas por guión (-).
     * Usa la API Stream y sus métodos que permiten saltar y limitar el stream.
     *
     * @param listado cadenas de texto
     * @return Cadena de texto que se compone de la tercera, cuarta y quinta cadena de texto separadas por guiones
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public String ejercicio3(List<String> listado) {
    	String res = "";
    	try {
    		res = listado.stream()
    				.skip(2)
    				.limit(3)
    				.reduce("", (a,b)-> a+"-"+b)
    				.toString();
		
    		System.out.println(res);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return res;
    }
    
    
    /**
	Alexis Lopez (@aa_lopez): https://www.oracle.com/technetwork/es/articles/java/expresiones-lambda-api-stream-java-2737544-esa.html
	Filtrado. Diversas operaciones pueden usarse para filtrar elementos de un stream: 

    filter(Predicate): Toma un predicado (java.util.function.Predicate) 
    como argumento y devuelve un stream que incluye todos los elementos que coinciden con el predicado indicado.
    distinct: Devuelve un stream con elementos únicos (según sea la implementación de equals para un elemento del stream).
    limit(n): Devuelve un stream cuya máxima longitud es n.
    skip(n): Devuelve un stream en el que se han descartado los primeros n números. 
    */
    
    
    
    
    

    /**
     * Ordernar el listado pasado como parámetro usando orden natural numérico.
     * Atención, el listado contiene números como cadenas de texto, por lo tanto, se debe hacer conversión.
     * Usa la API Stream
     *
     * @param listado números a ordenar
     * @return Listado de números en orden natural
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public List<Integer> ejercicio4(List<String> listado) {
        throw new UnsupportedOperationException();
    }

    /**
     * Ordernar el listado pasado como parámetro primero por tamaño de la cadena de texto y luego alfabeticamente
     * Usa la API Stream.
     * Crea un {@code Comparator<String>} compuesto para que compares primero por el tamaño y luego alfabeticamente.
     *
     * @param listado cadenas de texto a ordenar
     * @return Listado ordenado primero por número de caracteres y luego alfabeticamente
     * @see java.util.stream.Stream
     * @see java.util.stream.Collectors
     */
    public List<String> ejercicio5(List<String> listado) {
        throw new UnsupportedOperationException();
    }
}
