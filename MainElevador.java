public class MainElevador {
    public static void main (String[] args){
                Elevador elevador = new Elevador(9);

                elevador.AbrirPorta();
                elevador.SubirAndar();
                elevador.FecharPorta();

                elevador.SubirAndar();
                elevador.SubirAndar();

                elevador.Mostrarandar();

                elevador.DescerAndar();

                elevador.AbrirPorta();
                elevador.mostrarEstadoPorta();

    }
}
