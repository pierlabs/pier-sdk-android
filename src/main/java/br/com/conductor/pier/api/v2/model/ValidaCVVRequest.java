package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representation of the CVV validation
 **/
@ApiModel(description = "Request Representation of the CVV validation")
public class ValidaCVVRequest  {
  
  @SerializedName("idChaveCriptografia")
  private Long idChaveCriptografia = null;
  @SerializedName("cvv")
  private String cvv = null;

  
  /**
   * Identification Code of the encrypted key
   **/
  @ApiModelProperty(value = "Identification Code of the encrypted key")
  public Long getIdChaveCriptografia() {
    return idChaveCriptografia;
  }
  public void setIdChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
  }

  
  /**
   * Value of the Card Checking (CVV)
   **/
  @ApiModelProperty(value = "Value of the Card Checking (CVV)")
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
