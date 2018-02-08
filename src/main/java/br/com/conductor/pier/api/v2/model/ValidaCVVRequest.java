package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o de valida\u00C3\u00A7\u00C3\u00A3o do CVV.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o de valida\u00C3\u00A7\u00C3\u00A3o do CVV.")
public class ValidaCVVRequest  {
  
  @SerializedName("idChaveCriptografia")
  private Long idChaveCriptografia = null;
  @SerializedName("cvv")
  private String cvv = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do chave de criptografia.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do chave de criptografia.")
  public Long getIdChaveCriptografia() {
    return idChaveCriptografia;
  }
  public void setIdChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
  }

  
  /**
   * Valor de Verifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (CVV).
   **/
  @ApiModelProperty(value = "Valor de Verifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (CVV).")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCVVRequest {\n");
    
    sb.append("  idChaveCriptografia: ").append(idChaveCriptografia).append("\n");
    sb.append("  cvv: ").append(cvv).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
