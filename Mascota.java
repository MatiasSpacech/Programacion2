
    public class Mascota {
        private String nombre;
        private String raza;
        private String duenio;
    
        public Mascota(String nombre, String raza, String duenio) {
            this.nombre = nombre;
            this.raza = raza;
            this.duenio = duenio;
        }
    
        public Mascota(String nombre, String raza) {
            this(nombre, raza, "NN");
        }
    
        public Mascota(String nombre, String dueño) {
            this(nombre, "desconocida", dueño);
        }
    
        //continúa con los métodos de la clase
    
    }


