
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra21503801
 */
@Entity
public class Ocorrencia {
    private String nome;
    private String endereco;
    private String tipo_ocorrencia;
    private int idade;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo_ocorrencia() {
        return tipo_ocorrencia;
    }

    public void setTipo_ocorrencia(String tipo_ocorrencia) {
        this.tipo_ocorrencia = tipo_ocorrencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
