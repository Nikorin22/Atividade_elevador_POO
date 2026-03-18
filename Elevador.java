public class Elevador {
    private int andarAtual;
    private int TotalAndares;
    private boolean Aberto_fechado;

    public Elevador(int TotalAndares) {
        this.TotalAndares = TotalAndares;
        this.andarAtual = 0;
        this.Aberto_fechado = false;
    }

    public void AbrirPorta() {
        if (!Aberto_fechado) {
            Aberto_fechado = true;
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta já está aberta");
        }
    }

    public void FecharPorta() {
        if (Aberto_fechado) {
            Aberto_fechado = false;
            System.out.println("A porta está fechada");
        } else {
            System.out.println("A porta já está fechada");
        }
    }

    public void SubirAndar() {
        if (Aberto_fechado) {
            System.out.println("Não é possível subir de andar caso a porta esteja aberta");
            return;
        }
        if (andarAtual < TotalAndares) {
            andarAtual++;
            System.out.println("Subir para o andar" + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar");
        }
    }

    public void DescerAndar() {
        if (Aberto_fechado) {
            System.out.println("Não é possível descer de andar caso a porta esteja aberta");
            return;
        }
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descer para o andar" + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar");
        }
    }

    public void Mostrarandar() {
        System.out.println("Andar atual: " + andarAtual);
    }

    public void mostrarEstadoPorta() {
        if (Aberto_fechado) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
}
