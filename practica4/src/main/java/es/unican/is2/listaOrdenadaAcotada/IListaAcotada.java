package es.unican.is2.listaOrdenadaAcotada;

public interface IListaAcotada<E> {
	

	/**
	 * Lectura posicional: Retorna el elemento que ocupa la
	 * posicion indicada
	 * @param indice
	 * @return Elemento que ocupa la posicion indice
	 * @throws IndexOutOfBoundsException si el indice es incorrecto
	 */
    public E get(int indice);
    
    /**
     * Anade un elemento en la posicion que le corresponde
     * @param elemento a anadir
     * @throws Lanza IllegalStateException si el elemento no cabe
     */
    public void add(E elemento);
    
    /**
     * Elimina el elemento que ocupa la posicion indicada
     * @param indice Posicion del elemento a eliminar
     * @return Elemento que ocupaba la posicion indicada
     * Lanza IndexOutOfBoundsException si el indice es incorrecto
     */
    public E remove(int indice);
    
    /**
     * Retorna el tamano de la lista
     * @return Tamano de la lista
     */
    public int size();
    
    /**
     * Hace nula la lista
     */
     public void clear();
}
     