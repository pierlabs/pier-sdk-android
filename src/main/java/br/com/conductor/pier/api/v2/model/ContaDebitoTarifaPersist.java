package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persistencia de tarifas de d\u00E9bito da conta
 **/
@ApiModel(description = "Objeto de persistencia de tarifas de d\u00E9bito da conta")
public class ContaDebitoTarifaPersist  {
  
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
  @SerializedName("idAjuste")
  private Long idAjuste = null;
  @SerializedName("idTarifaExtrato")
  private Long idTarifaExtrato = null;
  @SerializedName("dataHoraInclusaoDebito")
  private String dataHoraInclusaoDebito = null;

  
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

  
  /**
   * Valor do c\u00F3digo identificador do ajuste 
   **/
  @ApiModelProperty(value = "Valor do c\u00F3digo identificador do ajuste ")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  
  /**
   * Valor do identificador do extrato da tarifa
   **/
  @ApiModelProperty(value = "Valor do identificador do extrato da tarifa")
  public Long getIdTarifaExtrato() {
    return idTarifaExtrato;
  }
  public void setIdTarifaExtrato(Long idTarifaExtrato) {
    this.idTarifaExtrato = idTarifaExtrato;
  }

  
  /**
   * Data e hota da inclus\u00E3o do d\u00E9bito
   **/
  @ApiModelProperty(value = "Data e hota da inclus\u00E3o do d\u00E9bito")
  public String getDataHoraInclusaoDebito() {
    return dataHoraInclusaoDebito;
  }
  public void setDataHoraInclusaoDebito(String dataHoraInclusaoDebito) {
    this.dataHoraInclusaoDebito = dataHoraInclusaoDebito;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoTarifaPersist {\n");
    
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  valorOriginal: ").append(valorOriginal).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  dataHoraFimCobranca: ").append(dataHoraFimCobranca).append("\n");
    sb.append("  dataHoraExpiracao: ").append(dataHoraExpiracao).append("\n");
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("  idTarifaExtrato: ").append(idTarifaExtrato).append("\n");
    sb.append("  dataHoraInclusaoDebito: ").append(dataHoraInclusaoDebito).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
