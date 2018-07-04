package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{taxa_antecipacao_request_description}}}
 **/
@ApiModel(description = "{{{taxa_antecipacao_request_description}}}")
public class TaxaAntecipacaoRequest  {
  
  public enum TipoTransacaoEnum {
     ON_US,  OFF_US, 
  };
  @SerializedName("tipoTransacao")
  private TipoTransacaoEnum tipoTransacao = null;
  @SerializedName("valorTaxa")
  private BigDecimal valorTaxa = null;

  
  /**
   * {{{taxa_antecipacao_request_tipo_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_antecipacao_request_tipo_transacao_value}}}")
  public TipoTransacaoEnum getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * {{{taxa_antecipacao_request_valor_taxa_value}}}
   **/
  @ApiModelProperty(value = "{{{taxa_antecipacao_request_valor_taxa_value}}}")
  public BigDecimal getValorTaxa() {
    return valorTaxa;
  }
  public void setValorTaxa(BigDecimal valorTaxa) {
    this.valorTaxa = valorTaxa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaAntecipacaoRequest {\n");
    
    sb.append("  tipoTransacao: ").append(tipoTransacao).append("\n");
    sb.append("  valorTaxa: ").append(valorTaxa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


