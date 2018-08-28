package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{taxa_juros_conta_lista_response_description}}}
 **/
@ApiModel(description = "{{{taxa_juros_conta_lista_response_description}}}")
public class TaxaJurosContaListaResponse  {
  
  @SerializedName("plano")
  private Integer plano = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;

  
  /**
   * {{{taxa_juros_conta_lista_response_plano_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_juros_conta_lista_response_plano_value}}}")
  public Integer getPlano() {
    return plano;
  }
  public void setPlano(Integer plano) {
    this.plano = plano;
  }

  
  /**
   * {{{taxa_juros_conta_lista_response_taxa_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_juros_conta_lista_response_taxa_value}}}")
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
