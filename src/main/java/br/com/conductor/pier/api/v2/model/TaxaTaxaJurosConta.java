package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * taxaTaxaJurosConta
 **/
@ApiModel(description = "taxaTaxaJurosConta")
public class TaxaTaxaJurosConta  {
  
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;

  
  /**
   * Number of months of grace period
   **/
  @ApiModelProperty(required = true, value = "Number of months of grace period")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Interest rate value
   **/
  @ApiModelProperty(required = true, value = "Interest rate value")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaTaxaJurosConta {\n");
    
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
