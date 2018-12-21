package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object for persistence of cards MultiApp
 **/
@ApiModel(description = "Object for persistence of cards MultiApp")
public class CardMultiAppPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;

  
  /**
   * Code of identification of the account
   **/
  @ApiModelProperty(required = true, value = "Code of identification of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification code of the Person who will be the holder of the Card
   **/
  @ApiModelProperty(required = true, value = "Identification code of the Person who will be the holder of the Card")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardMultiAppPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
