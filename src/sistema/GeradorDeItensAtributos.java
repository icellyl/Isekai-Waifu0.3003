package sistema;

import java.util.Random;

public class GeradorDeItensAtributos {

    private String nomeDoitemDropado;
    private int validarSeItemFoiDropado;
    private String nomeDoItemEquipado;
    private int danoDoitem;

    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;

    Random random = new Random();

    public void organizarItens(int itemQueFoiRetirado) {
        switch (itemQueFoiRetirado) {
            case 0:
                item1 = item2;
                item2 = item3;
                item3 = item4;
                item4 = item5;
                item5 = null;
                break;
            case 1:
                item2 = item3;
                item3 = item4;
                item4 = item5;
                item5 = null;
                break;
            case 2:
                item3 = item4;
                item4 = item5;
                item5 = null;
                break;
            case 3:
                item4 = item5;
                item5 = null;
                break;
            case 4:
                item5 = null;
                break;
        }
    }

    public void guardarItemNaMemoria(String item) {
        if (item1 == null) {
            item1 = item;
        } else if (item2 == null) {
            item2 = item;
        } else if (item3 == null) {
            item3 = item;
        } else if (item4 == null) {
            item4 = item;
        } else if (item5 == null) {
            item5 = item;
        }
    }

    public void gerarItem(String inimigo) {

        int chanceDoItemDropar = random.nextInt(100) + 1;

        switch (inimigo) {
            case "Slime girl":
                if (chanceDoItemDropar > 50) {
                    setNomeDoitemDropado("Adaga gosmenta");
                    setValidarSeItemFoiDropado(1);
                }
                break;
            case "Wolf girl":
                if (chanceDoItemDropar > 50) {
                    setNomeDoitemDropado("Adaga alpha");
                    setValidarSeItemFoiDropado(1);
                }
                break;
            case "Magma ghost":
                if (chanceDoItemDropar > 50) {
                    setNomeDoitemDropado("Lança ardente");
                    setValidarSeItemFoiDropado(1);
                }
                break;
            case "Magma reaper":
                if (chanceDoItemDropar > 50) {
                    setNomeDoitemDropado("Foice ardente");
                    setValidarSeItemFoiDropado(1);
                }
                break;
            case "Reaper":
                if (chanceDoItemDropar > 50) {
                    setNomeDoitemDropado("Foice");
                    setValidarSeItemFoiDropado(1);
                }
                break;
            default:
                setValidarSeItemFoiDropado(0);
        }
    }

    public void equiparItem(String item) {
        switch (item) {
            case "Adaga gosmenta":
                setDanoDoitem(3);
                break;
            case "Adaga alpha":
                setDanoDoitem(5);
                break;
            case "Lança ardente":
                setDanoDoitem(6);
                break;
            case "Foice ardente":
                setDanoDoitem(8);
                break;
            case "Foice":
                setDanoDoitem(6);
                break;
        }
    }

    public void configurarItem() {

    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public String getNomeDoitemDropado() {
        return nomeDoitemDropado;
    }

    public void setNomeDoitemDropado(String nomeDoitemDropado) {
        this.nomeDoitemDropado = nomeDoitemDropado;
    }

    public int getValidarSeItemFoiDropado() {
        return validarSeItemFoiDropado;
    }

    public void setValidarSeItemFoiDropado(int validarSeItemFoiDropado) {
        this.validarSeItemFoiDropado = validarSeItemFoiDropado;
    }

    public String getNomeDoItemEquipado() {
        return nomeDoItemEquipado;
    }

    public void setNomeDoItemEquipado(String nomeDoItemEquipado) {
        this.nomeDoItemEquipado = nomeDoItemEquipado;
    }

    public int getDanoDoitem() {
        return danoDoitem;
    }

    public void setDanoDoitem(int danoDoitem) {
        this.danoDoitem = danoDoitem;
    }

}
