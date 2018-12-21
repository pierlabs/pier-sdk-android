package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters of the embossing card creation
 **/
@ApiModel(description = "Request Parameters of the embossing card creation")
public class CartaoEmbossingRequest  {
  
  @SerializedName("id_pessoa")
  private Long idPessoa = null;
  @SerializedName("id_tipo_plastico")
  private Long idTipoPlastico = null;

  
  /**
   * Identification Code of the Person which the card belongs (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Person which the card belongs (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification Code of TypePlastic (id)
   **/
  @ApiModelProperty(value = "Identification Code of TypePlastic (id)")
  public Long getIdTipoPlastico() {
    return idTipoPlastico;
  }
  public void setIdTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingRequest {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoPlastico: ").append(idTipoPlastico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
