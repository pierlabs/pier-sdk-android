package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de uma tarifa de d\u00E9bito da conta
 **/
@ApiModel(description = "Objeto de resposta de uma tarifa de d\u00E9bito da conta")
public class ContaDebitoTarifaResponse  {
  
  @SerializedName("dataHoraExpiracao")
  private String dataHoraExpiracao = null;
  @SerializedName("dataHoraFimCobranca")
  private String dataHoraFimCobranca = null;
  @SerializedName("dataHoraInclusaoDebito")
  private String dataHoraInclusaoDebito = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idAjuste")
  private Long idAjuste = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTarifaExtrato")
  private Long idTarifaExtrato = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("valorOriginal")
  private BigDecimal valorOriginal = null;

  
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
   * Data e hota da inclus\u00E3o do d\u00E9bito
   **/
  @ApiModelProperty(value = "Data e hota da inclus\u00E3o do d\u00E9bito")
  public String getDataHoraInclusaoDebito() {
    return dataHoraInclusaoDebito;
  }
  public void setDataHoraInclusaoDebito(String dataHoraInclusaoDebito) {
    this.dataHoraInclusaoDebito = dataHoraInclusaoDebito;
  }

  
  /**
   * Identificador do registro
   **/
  @ApiModelProperty(value = "Identificador do registro")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do ajuste 
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do ajuste ")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador do extrato da tarifa
   **/
  @ApiModelProperty(value = "Identificador do extrato da tarifa")
  public Long getIdTarifaExtrato() {
    return idTarifaExtrato;
  }
  public void setIdTarifaExtrato(Long idTarifaExtrato) {
    this.idTarifaExtrato = idTarifaExtrato;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoTarifaResponse {\n");
    
    sb.append("  dataHoraExpiracao: ").append(dataHoraExpiracao).append("\n");
    sb.append("  dataHoraFimCobranca: ").append(dataHoraFimCobranca).append("\n");
    sb.append("  dataHoraInclusaoDebito: ").append(dataHoraInclusaoDebito).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTarifaExtrato: ").append(idTarifaExtrato).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  valorOriginal: ").append(valorOriginal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
