package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia da conta MultiApp
 **/
@ApiModel(description = "Objeto para persist\u00EAncia da conta MultiApp")
public class ContaMultiAppPersist  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("idEnderecoCorrespondencia")
  private Long idEnderecoCorrespondencia = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("flagFaturaDigital")
  private Integer flagFaturaDigital = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;

  
  /**
   * C\u00F3digo identificador da pessoa na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da pessoa na base (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da origem comercial na base (id)")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do produto na base (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Dia do vencimento da conta
   **/
  @ApiModelProperty(required = true, value = "Dia do vencimento da conta")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Valor da renda do titular da conta
   **/
  @ApiModelProperty(required = true, value = "Valor da renda do titular da conta")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(required = true, value = "Valor da pontua\u00E7\u00E3o da conta")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * Limite global da conta
   **/
  @ApiModelProperty(required = true, value = "Limite global da conta")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Limite m\u00E1ximo da conta
   **/
  @ApiModelProperty(required = true, value = "Limite m\u00E1ximo da conta")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * informar o Limite Mensal espec\u00EDfico para Transa\u00E7\u00F5es Parceladas
   **/
  @ApiModelProperty(required = true, value = "informar o Limite Mensal espec\u00EDfico para Transa\u00E7\u00F5es Parceladas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * informar a margem de Limite Consignado
   **/
  @ApiModelProperty(required = true, value = "informar a margem de Limite Consignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Quanto ativa, indica que o cliente escolheu a op\u00E7\u00E3o de envio de Fatura por Email. Do contr\u00E1rio, as faturas ser\u00E3o enviadas por Correspond\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Quanto ativa, indica que o cliente escolheu a op\u00E7\u00E3o de envio de Fatura por Email. Do contr\u00E1rio, as faturas ser\u00E3o enviadas por Correspond\u00EAncia")
  public Integer getFlagFaturaDigital() {
    return flagFaturaDigital;
  }
  public void setFlagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
  }

  
  /**
   * Quando utilizado, serve para indicar o canal de captura do cadastro do cliente, como Web, Site, App, etc
   **/
  @ApiModelProperty(value = "Quando utilizado, serve para indicar o canal de captura do cadastro do cliente, como Web, Site, App, etc")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Status da conta
   **/
  @ApiModelProperty(value = "Status da conta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaMultiAppPersist {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  idEnderecoCorrespondencia: ").append(idEnderecoCorrespondencia).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  flagFaturaDigital: ").append(flagFaturaDigital).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
