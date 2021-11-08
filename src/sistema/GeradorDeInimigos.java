package sistema;

import java.util.Random;

public class GeradorDeInimigos {

    private String nomeInimigo;
    private String vidaMaximaInimigo;
    private int vidaAtualInimigo;
    private String idInimigo;
    private int inimigoAtivo = 0;

    Random random = new Random();

    public void gerarInimigo() {
        int idInimigoA = random.nextInt(100) + 1;

        if (idInimigoA >= 1 & idInimigoA <= 20) {
            setNomeInimigo("Slime girl");
            setVidaMaximaInimigo("/150");
            setVidaAtualInimigo(150);
        } else if (idInimigoA >= 21 & idInimigoA <= 40) {
            setNomeInimigo("Wolf girl");
            setVidaMaximaInimigo("/100");
            setVidaAtualInimigo(100);
        } else if (idInimigoA >= 41 & idInimigoA < 60) {
            setNomeInimigo("Magma ghost");
            setVidaMaximaInimigo("/50");
            setVidaAtualInimigo(50);
        } else if (idInimigoA >= 61 & idInimigoA <= 80) {
            setNomeInimigo("Magma reaper");
            setVidaMaximaInimigo("/100");
            setVidaAtualInimigo(100);
        } else if (idInimigoA >= 81 & idInimigoA <= 100) {
            setNomeInimigo("Reaper");
            setVidaMaximaInimigo("/80");
            setVidaAtualInimigo(80);
        }
        setInimigoAtivo(1);
    }

    public int getVidaAtualInimigo() {
        return vidaAtualInimigo;
    }

    public void setVidaAtualInimigo(int vidaAtualInimigo) {
        this.vidaAtualInimigo = vidaAtualInimigo;
    }

    public String getIdInimigo() {
        return idInimigo;
    }

    public void setIdInimigo(String idInimigo) {
        this.idInimigo = idInimigo;
    }

    public int getInimigoAtivo() {
        return inimigoAtivo;
    }

    public void setInimigoAtivo(int inimigoAtivo) {
        this.inimigoAtivo = inimigoAtivo;
    }

    public String getNomeInimigo() {
        return nomeInimigo;
    }

    public void setNomeInimigo(String nomeInimigo) {
        this.nomeInimigo = nomeInimigo;
    }

    public String getVidaMaximaInimigo() {
        return vidaMaximaInimigo;
    }

    public void setVidaMaximaInimigo(String vidaMaximaInimigo) {
        this.vidaMaximaInimigo = vidaMaximaInimigo;
    }

}
