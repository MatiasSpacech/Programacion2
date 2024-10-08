package procesadoresDinamicos;

public abstract class ColaDeTareasOrdenada extends ColaDeTareas {
	
	@Override
	public void addTarea(Tarea tarea) {
		int i = 0;
		while (i < this.tareas.size() 
				//&& tarea.getPrioridad() >= this.tareas.get(i).getPrioridad())
				&& esMayor(tarea, this.tareas.get(i)))
			i++;
		
		if (i == this.tareas.size()) {
			this.tareas.add(tarea); // Inserta al final
		}
		else {
			this.tareas.add(i, tarea); // Inserta en posicion i
		}
	}

	protected abstract boolean esMayor(Tarea t1, Tarea t2);

}