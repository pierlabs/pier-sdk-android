package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Operation type object, containing only properties that can be changed
 **/
@ApiModel(description = "Operation type object, containing only properties that can be changed")
public class TipoOperacaoParcialUpdate  {
  
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate
   **/
  @ApiModelProperty(value = "Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoParcialUpdate {\n");
    
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
