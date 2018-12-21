package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters to register economic group
 **/
@ApiModel(description = "Request Parameters to register economic group")
public class GrupoEconomicoDTO  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  public enum PagamentoSemanalEnum {
     SEGUNDA,  TERCA,  QUARTA,  QUINTA,  SEXTA,  SABADO,  DOMINGO, 
  };
  @SerializedName("pagamentoSemanal")
  private PagamentoSemanalEnum pagamentoSemanal = null;
  @SerializedName("pagamentoMensal")
  private Integer pagamentoMensal = null;
  @SerializedName("pagamentoDecendialPrimeiro")
  private Integer pagamentoDecendialPrimeiro = null;
  @SerializedName("pagamentoDecendialSegundo")
  private Integer pagamentoDecendialSegundo = null;
  @SerializedName("pagamentoDecendialTerceiro")
  private Integer pagamentoDecendialTerceiro = null;
  @SerializedName("pagamentoQuinzenalPrimeiro")
  private Integer pagamentoQuinzenalPrimeiro = null;
  @SerializedName("pagamentoQuinzenalSegundo")
  private Integer pagamentoQuinzenalSegundo = null;
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  @SerializedName("percentualRAV")
  private BigDecimal percentualRAV = null;
  public enum RecebeRAVEnum {
     NAO_TEM_PERMISSAO_RAV,  CREDITO_RAV,  DEBITO_RAV, 
  };
  @SerializedName("recebeRAV")
  private RecebeRAVEnum recebeRAV = null;
  @SerializedName("percentualMultiplica")
  private BigDecimal percentualMultiplica = null;
  @SerializedName("taxaAdm")
  private BigDecimal taxaAdm = null;
  @SerializedName("taxaBanco")
  private BigDecimal taxaBanco = null;
  @SerializedName("limiteRAV")
  private BigDecimal limiteRAV = null;

  
  /**
   * Social reason of the legal person
   **/
  @ApiModelProperty(required = true, value = "Social reason of the legal person")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Name of the creditor
   **/
  @ApiModelProperty(value = "Name of the creditor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * Federal Revenue Number
   **/
  @ApiModelProperty(required = true, value = "Federal Revenue Number")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * State Register Number
   **/
  @ApiModelProperty(value = "State Register Number")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Name of the person to contact
   **/
  @ApiModelProperty(value = "Name of the person to contact")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Bank Code
   **/
  @ApiModelProperty(value = "Bank Code")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Agency Code
   **/
  @ApiModelProperty(value = "Agency Code")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Digit verifier of the agency
   **/
  @ApiModelProperty(value = "Digit verifier of the agency")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Code of the Current Account
   **/
  @ApiModelProperty(value = "Code of the Current Account")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * Verifier Digit of the Current Account
   **/
  @ApiModelProperty(value = "Verifier Digit of the Current Account")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * Frequency of the payment
   **/
  @ApiModelProperty(required = true, value = "Frequency of the payment")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Day for weekly payment
   **/
  @ApiModelProperty(value = "Day for weekly payment")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Date for the monthly payment
   **/
  @ApiModelProperty(value = "Date for the monthly payment")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * Date of the decendial Payment
   **/
  @ApiModelProperty(value = "Date of the decendial Payment")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Date for the second decendial payment
   **/
  @ApiModelProperty(value = "Date for the second decendial payment")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Day of the third decendial payment date
   **/
  @ApiModelProperty(value = "Day of the third decendial payment date")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * Day of the date for the first biweekly payment
   **/
  @ApiModelProperty(value = "Day of the date for the first biweekly payment")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Day of the date for the second biqeekly payment
   **/
  @ApiModelProperty(value = "Day of the date for the second biqeekly payment")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Identifier of the creditor RAV
   **/
  @ApiModelProperty(required = true, value = "Identifier of the creditor RAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Percentage Value of the creditor RAV
   **/
  @ApiModelProperty(required = true, value = "Percentage Value of the creditor RAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Indicate if the creditor recieves RAV and the type
   **/
  @ApiModelProperty(value = "Indicate if the creditor recieves RAV and the type")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentage Multiply
   **/
  @ApiModelProperty(value = "Percentage Multiply")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Administrative Taxe
   **/
  @ApiModelProperty(value = "Administrative Taxe")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * Taxe of the Bank
   **/
  @ApiModelProperty(value = "Taxe of the Bank")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Limit value of the RAV
   **/
  @ApiModelProperty(value = "Limit value of the RAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoDTO {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  pagamentoSemanal: ").append(pagamentoSemanal).append("\n");
    sb.append("  pagamentoMensal: ").append(pagamentoMensal).append("\n");
    sb.append("  pagamentoDecendialPrimeiro: ").append(pagamentoDecendialPrimeiro).append("\n");
    sb.append("  pagamentoDecendialSegundo: ").append(pagamentoDecendialSegundo).append("\n");
    sb.append("  pagamentoDecendialTerceiro: ").append(pagamentoDecendialTerceiro).append("\n");
    sb.append("  pagamentoQuinzenalPrimeiro: ").append(pagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  pagamentoQuinzenalSegundo: ").append(pagamentoQuinzenalSegundo).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdm: ").append(taxaAdm).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
