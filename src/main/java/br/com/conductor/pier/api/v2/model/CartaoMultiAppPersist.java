package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia de cart\u00F5es MultiApp
 **/
@ApiModel(description = "Objeto para persist\u00EAncia de cart\u00F5es MultiApp")
public class CartaoMultiAppPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;

  
  /**
   * C\u00F3digo identificador da conta na base
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da conta na base")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Pessoa que ser\u00E1 a portadora do Cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da Pessoa que ser\u00E1 a portadora do Cart\u00E3o")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
