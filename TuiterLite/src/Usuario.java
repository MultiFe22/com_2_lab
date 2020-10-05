import java.awt.*;

public class Usuario {

    public static final int MIN_TUITES_SENIOR = 200;
    public static final int MIN_TUITES_NINJA = 1000;
    private int numTuites = 0;
    private final String email;
    private String nome;
    private Image foto;

    // Pode ser INICIANTE, SENIOR ou NINJA
    private NivelUsuario nivel;

    public Usuario(String nome, String email) {
        this.email = email;
        this.nome = nome;
        this.nivel = NivelUsuario.INICIANTE;
    }
    @Override
    public boolean equals(Object o){
        Usuario o1 = (Usuario) o;
        if (o1.getEmail() == this.email){
            return true;
        }
        else{return false;}
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public Image getFoto() {
        return this.foto;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }
    public void addNumTuites(){
        this.numTuites++;
    }

    public NivelUsuario getNivel() {
        if(this.numTuites>=MIN_TUITES_NINJA){
            this.nivel = NivelUsuario.NINJA;
            return this.nivel;
        }
        else if (this.numTuites >= MIN_TUITES_SENIOR){
            this.nivel = NivelUsuario.SENIOR;
            return this.nivel;
        }
        else{
            return this.nivel;
        }

    }
}
