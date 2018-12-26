package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{taxa_juros_conta_persist_value}}}
 **/
@ApiModel(description = "{{{taxa_juros_conta_persist_value}}}")
public class TaxaJurosContaPersistValue  {
  
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;

  
  /**
   * {{{taxa_juros_conta_update_numero_meses_carencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{taxa_juros_conta_update_numero_meses_carencia_value}}}")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{taxa_juros_conta_update_taxa_juros_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{taxa_juros_conta_update_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaPersistValue {\n");
    
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
