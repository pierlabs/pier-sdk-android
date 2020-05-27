package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o de atribui\u00E7\u00E3o de um cart\u00E3o a uma conta
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o de atribui\u00E7\u00E3o de um cart\u00E3o a uma conta")
public class AtribuirCartaoPessoaRequest  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;

  
  /**
   * Identificador da pessoa
   **/
  @ApiModelProperty(value = "Identificador da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirCartaoPessoaRequest {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
