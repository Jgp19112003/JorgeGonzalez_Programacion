import java.util.ArrayList;

public class Concesionario {


    private ArrayList<Coche> concesionario;

    public Concesionario(){
        this.concesionario = new ArrayList<>();
    }

    public void agregarCoche (Coche coche){

        for (int i = 0; i < concesionario.size(); i++) {
            do {
                if (concesionario.get(i).getMatricula().equalsIgnoreCase(coche.getMatricula())) {
                    System.out.println("Esta matricula ya existe, introduzca una nueva");
                }else {
                    concesionario.add(coche);
                    concesionario.get(i).mostrarDatos();
                }
            }while (concesionario.get(i).getMatricula().equalsIgnoreCase(coche.getMatricula()));
        }
    }

    public void buscarCoche(String matricula){
        for (int i = 0; i < concesionario.size(); i++) {

                if (concesionario.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                    concesionario.get(i).mostrarDatos();
                } else {
                    System.out.println("Esta matricula no tiene ningun coche registrado");
                }

        }

    }

}
