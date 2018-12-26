package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta da listagem da taxa de juros
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta da listagem da taxa de juros")
public class TaxaJurosContaListaResponse  {
  
  @SerializedName("plano")
  private Integer plano = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;

  
  /**
   * Numero da parcela do plano de taxa
   **/
  @ApiModelProperty(value = "Numero da parcela do plano de taxa")
  public Integer getPlano() {
    return plano;
  }
  public void setPlano(Integer plano) {
    this.plano = plano;
  }

  
  /**
   * Valor da taxa de juros
   **/
  @ApiModelProperty(value = "Valor da taxa de juros")
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
