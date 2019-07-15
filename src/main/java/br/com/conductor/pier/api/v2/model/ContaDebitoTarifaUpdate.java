package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de atualiza\u00E7\u00E3o parcial da tarifa de d\u00E9bito da conta
 **/
@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial da tarifa de d\u00E9bito da conta")
public class ContaDebitoTarifaUpdate  {
  
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("valorOriginal")
  private BigDecimal valorOriginal = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("dataHoraFimCobranca")
  private String dataHoraFimCobranca = null;
  @SerializedName("dataHoraExpiracao")
  private String dataHoraExpiracao = null;

  
  /**
   * Valor da tarifa com desconto
   **/
  @ApiModelProperty(value = "Valor da tarifa com desconto")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Valor original da tarifa
   **/
  @ApiModelProperty(value = "Valor original da tarifa")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Percentual de desconto
   **/
  @ApiModelProperty(value = "Percentual de desconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Data e hora do fim da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Data e hora do fim da cobran\u00E7a")
  public String getDataHoraFimCobranca() {
    return dataHoraFimCobranca;
  }
  public void setDataHoraFimCobranca(String dataHoraFimCobranca) {
    this.dataHoraFimCobranca = dataHoraFimCobranca;
  }

  
  /**
   * Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a")
  public String getDataHoraExpiracao() {
    return dataHoraExpiracao;
  }
  public void setDataHoraExpiracao(String dataHoraExpiracao) {
    this.dataHoraExpiracao = dataHoraExpiracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoTarifaUpdate {\n");
    
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  valorOriginal: ").append(valorOriginal).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  dataHoraFimCobranca: ").append(dataHoraFimCobranca).append("\n");
    sb.append("  dataHoraExpiracao: ").append(dataHoraExpiracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
