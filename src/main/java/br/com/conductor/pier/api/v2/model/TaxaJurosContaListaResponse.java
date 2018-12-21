package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the response of the interest rate listing
 **/
@ApiModel(description = "Representation of the response of the interest rate listing")
public class TaxaJurosContaListaResponse  {
  
  @SerializedName("plano")
  private Integer plano = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;

  
  /**
   * Fee plan tranche number
   **/
  @ApiModelProperty(value = "Fee plan tranche number")
  public Integer getPlano() {
    return plano;
  }
  public void setPlano(Integer plano) {
    this.plano = plano;
  }

  
  /**
   * Interest rate value
   **/
  @ApiModelProperty(value = "Interest rate value")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaListaResponse {\n");
    
    sb.append("  plano: ").append(plano).append("\n");
    sb.append("  taxa: ").append(taxa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
