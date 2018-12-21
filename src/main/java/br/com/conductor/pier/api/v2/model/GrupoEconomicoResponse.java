package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the economic group resource
 **/
@ApiModel(description = "Response Representation of the economic group resource")
public class GrupoEconomicoResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
  @SerializedName("usuario")
  private String usuario = null;
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
   * Identifier code of the economic group
   **/
  @ApiModelProperty(value = "Identifier code of the economic group")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Social reason of the Legal person
   **/
  @ApiModelProperty(value = "Social reason of the Legal person")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Name of the Creditor
   **/
  @ApiModelProperty(value = "Name of the Creditor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * Number of the IRs
   **/
  @ApiModelProperty(value = "Number of the IRs")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * State Registration Number
   **/
  @ApiModelProperty(value = "State Registration Number")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Name of the person to keep contact
   **/
  @ApiModelProperty(value = "Name of the person to keep contact")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Bank code
   **/
  @ApiModelProperty(value = "Bank code")
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
   * Verifier digit of the agency
   **/
  @ApiModelProperty(value = "Verifier digit of the agency")
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
   * Verifier Digit of the current account
   **/
  @ApiModelProperty(value = "Verifier Digit of the current account")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * User login for registering the insertion
   **/
  @ApiModelProperty(value = "User login for registering the insertion")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Payment Frequency
   **/
  @ApiModelProperty(value = "Payment Frequency")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Weekly payday
   **/
  @ApiModelProperty(value = "Weekly payday")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Monthly payment date
   **/
  @ApiModelProperty(value = "Monthly payment date")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * First decendial payment date
   **/
  @ApiModelProperty(value = "First decendial payment date")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Second decendial payment date
   **/
  @ApiModelProperty(value = "Second decendial payment date")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Third decendial payment date
   **/
  @ApiModelProperty(value = "Third decendial payment date")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * First Biweekly Payment Date
   **/
  @ApiModelProperty(value = "First Biweekly Payment Date")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Second Biweekly payment date
   **/
  @ApiModelProperty(value = "Second Biweekly payment date")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Identifier of the creditor RAV
   **/
  @ApiModelProperty(value = "Identifier of the creditor RAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Percentage Value of the creditor RAV
   **/
  @ApiModelProperty(value = "Percentage Value of the creditor RAV")
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
    sb.append("class GrupoEconomicoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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
    sb.append("  usuario: ").append(usuario).append("\n");
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
