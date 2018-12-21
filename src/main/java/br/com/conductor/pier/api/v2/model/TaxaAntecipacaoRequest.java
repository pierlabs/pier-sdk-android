package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Request of the Antecipation Taxe
 **/
@ApiModel(description = "Object Request of the Antecipation Taxe")
public class TaxaAntecipacaoRequest  {
  
  public enum TipoTransacaoEnum {
     ON_US,  OFF_US, 
  };
  @SerializedName("tipoTransacao")
  private TipoTransacaoEnum tipoTransacao = null;
  @SerializedName("valorTaxa")
  private BigDecimal valorTaxa = null;

  
  /**
   * Code that identifies if a parameter refers to a trnsaction On-Us or Off-Us
   **/
  @ApiModelProperty(value = "Code that identifies if a parameter refers to a trnsaction On-Us or Off-Us")
  public TipoTransacaoEnum getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * Value of the Antecipation Taxe
   **/
  @ApiModelProperty(value = "Value of the Antecipation Taxe")
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
