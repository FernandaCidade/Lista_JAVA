import java.time.LocalDate;

public class PessoaFisica extends Pessoa { //para herdar do pai tem que colocar extends
    public String cpf;
    public LocalDate dataNascimento;
    public float CalcularImposto(int rendimento){
        if(rendimento <= 1500){
        return 0;
        } else if (rendimento > 1500 && rendimento <= 3500) {
            
            float resultado = (rendimento /100)*2;
            return resultado;
            
        } else if (rendimento > 3500 && rendimento <= 6000) {

            float resultado = (rendimento / 100)* 3.5f;
            return resultado;
        }else{
            float resultado = (rendimento / 100)*5;
            return resultado;
        }
    }

}
