
package Dados;

import Manipulacao.Candidato;
import java.util.ArrayList;

public class ControlaDados {
    private ArrayList<Candidato> candidatos = new ArrayList<>();
    
    public boolean Salvar(Candidato c){
        if(c != null){
            candidatos.add(c);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Candidato> mostrar(){
        return candidatos;
    }
    
}
