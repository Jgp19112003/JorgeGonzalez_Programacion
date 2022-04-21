import controller.BinariosController;
import model.Usuario;

public class Main {
    public static void main(String[] args) {

        BinariosController binariosController = new BinariosController();
        binariosController.escribirBinario();
        binariosController.lecturaBinario();
    }
}
