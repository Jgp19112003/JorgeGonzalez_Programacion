package Examen;

public class LanzarEx {

    public void lanzarMiExcepcion() throws MiExcepcion {
        throw new MiExcepcion("ERROR, no hay espacio para mas comensales.");
    }
}
