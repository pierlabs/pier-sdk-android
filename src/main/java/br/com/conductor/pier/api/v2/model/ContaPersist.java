package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ContaPersist
 **/
@ApiModel(description = "ContaPersist")
public class ContaPersist  {
  
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
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
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
  @SerializedName("flagFaturaPorEmail")
  private Integer flagFaturaPorEmail = null;
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("matricula")
  private String matricula = null;
  @SerializedName("responsavelDigitacao")
  private String responsavelDigitacao = null;
  @SerializedName("idPromotorVenda")
  private Integer idPromotorVenda = null;

  
  /**
   * Person Identifier
   **/
  @ApiModelProperty(required = true, value = "Person Identifier")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Commercial origin identifier
   **/
  @ApiModelProperty(required = true, value = "Commercial origin identifier")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Product Identifier
   **/
  @ApiModelProperty(required = true, value = "Product Identifier")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Payment day
   **/
  @ApiModelProperty(required = true, value = "Payment day")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Owner rent
   **/
  @ApiModelProperty(required = true, value = "Owner rent")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Input channel
   **/
  @ApiModelProperty(value = "Input channel")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Account score
   **/
  @ApiModelProperty(required = true, value = "Account score")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Correspondence address identifier
   **/
  @ApiModelProperty(required = true, value = "Correspondence address identifier")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * Global account limit
   **/
  @ApiModelProperty(required = true, value = "Global account limit")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Maximun account limit
   **/
  @ApiModelProperty(required = true, value = "Maximun account limit")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * portion limit
   **/
  @ApiModelProperty(required = true, value = "portion limit")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Consigned limit
   **/
  @ApiModelProperty(required = true, value = "Consigned limit")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Send invoice formar
   **/
  @ApiModelProperty(required = true, value = "Send invoice formar")
  public Integer getFlagFaturaPorEmail() {
    return flagFaturaPorEmail;
  }
  public void setFlagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
  }

  
  /**
   * Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes
   **/
  @ApiModelProperty(value = "Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * License Plate Number
   **/
  @ApiModelProperty(value = "License Plate Number")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * Responsible for typing the proposal
   **/
  @ApiModelProperty(value = "Responsible for typing the proposal")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * Sale promoter identification code
   **/
  @ApiModelProperty(value = "Sale promoter identification code")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPersist {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  idEnderecoCorrespondencia: ").append(idEnderecoCorrespondencia).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  flagFaturaPorEmail: ").append(flagFaturaPorEmail).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  matricula: ").append(matricula).append("\n");
    sb.append("  responsavelDigitacao: ").append(responsavelDigitacao).append("\n");
    sb.append("  idPromotorVenda: ").append(idPromotorVenda).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
