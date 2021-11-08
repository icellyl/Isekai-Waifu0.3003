

package sistema;
import java.util.Random;

public class GeradorDeEventos {
    Random random = new Random();
    
    public int gerarEventoExplorar(){
    int idEvento = random .nextInt(3)+1;
    return idEvento;
}
    public int gerarEventoAtacar(GeradorDeInimigos gdi, GeradorDeItensAtributos gdia){
        int vidaAtualDoInimigo = gdi.getVidaAtualInimigo();
        int danoDeAtaque = random.nextInt(20)+10 + gdia.getDanoDoitem();
        int resultadoDoAtaque = vidaAtualDoInimigo - danoDeAtaque;
        if(resultadoDoAtaque < 0){
            resultadoDoAtaque = 0;
        }
        return resultadoDoAtaque;
    }
    //oioioi
}
