import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Media {
    private int linhasInvalidas =0;
    private float media = 0f;
    private int numNotas = 0;
    public Media(){

    }

    public float calcularMedias (String nomeDoArquivo) {
        File arquivo = new File(nomeDoArquivo);
        Scanner scanner = null;
        try {
            scanner = new Scanner(arquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -2f;
        }
        while(scanner.hasNext()){
            float proxFloat = scanner.nextFloat();
            if (10f >= proxFloat || proxFloat <= 0f) {
                this.media += proxFloat;
                this.numNotas += 1;
            }
            else{
                this.linhasInvalidas += 1;
            }


        }
        try{
            valido();
        } catch (ArquivoCorrompidoException e) {
            e.printStackTrace();
            e.numLinhasInvalidas = this.linhasInvalidas;
            return -1f;
        }

        return media/(float) numNotas;
    }

    private void valido() throws  ArquivoCorrompidoException{
        if (this.linhasInvalidas >= this.numNotas) {
            throw new ArquivoCorrompidoException(this.linhasInvalidas);
        }
    }
}
