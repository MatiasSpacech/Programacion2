package EJ3ONEPIECE;
/**Se desea organizar el universo de personajes de One Piece. En One Piece cada personaje
individual posee un nombre, una edad, un peso y fuerza. Asimismo cada personaje puede
haber ingerido una fruta especial que modifica su fuerza. Para algunas frutas la fuerza es un
valor fijo, en otros casos es el peso multiplicado por 10, e inclusos para algunas frutas es un
valor fijo más el peso multiplicado por 7; si el personaje no comió ninguna fruta tiene una
fuerza por defecto de 125, la cual puede cambiar en un futuro pero es el mismo valor para
todos los personajes. */
public abstract class Fruta {
    
    public abstract int getFuerza(Personaje pj);
}
