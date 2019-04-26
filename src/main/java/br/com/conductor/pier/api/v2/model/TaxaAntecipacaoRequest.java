package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Requisi\u00E7\u00E3o de Taxa de Antecipa\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de Requisi\u00E7\u00E3o de Taxa de Antecipa\u00E7\u00E3o")
public class TaxaAntecipacaoRequest  {
  
  public enum TipoTransacaoEnum {
     ON_US,  OFF_US, 
  };
  @SerializedName("tipoTransacao")
  private TipoTransacaoEnum tipoTransacao = null;
  @SerializedName("valorTaxa")
  private BigDecimal valorTaxa = null;

  
  /**
   * C\u00F3digo que identifica se um par\u00E2metro refere-se a uma transa\u00E7\u00E3o On-Us ou Off-Us
   **/
  @ApiModelProperty(value = "C\u00F3digo que identifica se um par\u00E2metro refere-se a uma transa\u00E7\u00E3o On-Us ou Off-Us")
  public TipoTransacaoEnum getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * Valor da Taxa de Antecipa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da Taxa de Antecipa\u00E7\u00E3o")
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
