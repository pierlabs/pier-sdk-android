package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ObjectAddressApproved;
import br.com.conductor.pier.api.v2.model.PersonPersist;
import br.com.conductor.pier.api.v2.model.RefenceCommercialApprovedPersist;
import br.com.conductor.pier.api.v2.model.TelephonePersonApprovedPersist;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PersonLegalApprovedPersist
 **/
@ApiModel(description = "PersonLegalApprovedPersist")
public class PessoaJuridicaAprovadaPersist  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("dataAberturaEmpresa")
  private String dataAberturaEmpresa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("telefones")
  private List<TelephonePersonApprovedPersist> telefones = null;
  @SerializedName("enderecos")
  private List<ObjectAddressApproved> enderecos = null;
  @SerializedName("socios")
  private List<PersonPersist> socios = null;
  @SerializedName("referenciasComerciais")
  private List<RefenceCommercialApprovedPersist> referenciasComerciais = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;

  
  /**
   * Show the full name of the social reason (business name)'
   **/
  @ApiModelProperty(required = true, value = "Show the full name of the social reason (business name)'")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Show the fantasy name of the company
   **/
  @ApiModelProperty(value = "Show the fantasy name of the company")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * CNPJ
   **/
  @ApiModelProperty(required = true, value = "CNPJ")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * State registration number
   **/
  @ApiModelProperty(value = "State registration number")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Company opening date, this date must be informed in the format: yyyy-MM-dd
   **/
  @ApiModelProperty(required = true, value = "Company opening date, this date must be informed in the format: yyyy-MM-dd")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id or the commercial origin
   **/
  @ApiModelProperty(required = true, value = "Id or the commercial origin")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id product
   **/
  @ApiModelProperty(required = true, value = "Id product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Bank number
   **/
  @ApiModelProperty(value = "Bank number")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * Agency Number
   **/
  @ApiModelProperty(value = "Agency Number")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Number of the current account
   **/
  @ApiModelProperty(value = "Number of the current account")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email of the company
   **/
  @ApiModelProperty(value = "Email of the company")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Expiration date
   **/
  @ApiModelProperty(required = true, value = "Expiration date")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Name that must be printed on the card
   **/
  @ApiModelProperty(value = "Name that must be printed on the card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta o valor da renda compravada
   **/
  @ApiModelProperty(value = "Apresenta o valor da renda compravada")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Indicate the channel which the register of the client was created
   **/
  @ApiModelProperty(value = "Indicate the channel which the register of the client was created")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indicate the value of the puntuaction attributed to the client (case it is not informed it will be attributed the value =0)
   **/
  @ApiModelProperty(value = "Indicate the value of the puntuaction attributed to the client (case it is not informed it will be attributed the value =0)")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * List the Telephones of the Company
   **/
  @ApiModelProperty(value = "List the Telephones of the Company")
  public List<TelephonePersonApprovedPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelephonePersonApprovedPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * It can be informed the following types of address: Residencial, Commercial and Others
   **/
  @ApiModelProperty(required = true, value = "It can be informed the following types of address: Residencial, Commercial and Others")
  public List<ObjectAddressApproved> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjectAddressApproved> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Show the dates of the partners, in case of existence
   **/
  @ApiModelProperty(value = "Show the dates of the partners, in case of existence")
  public List<PersonPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<PersonPersist> socios) {
    this.socios = socios;
  }

  
  /**
   * show the dates of the commercial references
   **/
  @ApiModelProperty(value = "show the dates of the commercial references")
  public List<RefenceCommercialApprovedPersist> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<RefenceCommercialApprovedPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * Value of the Global Limit
   **/
  @ApiModelProperty(required = true, value = "Value of the Global Limit")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Maximum value of the credit limit to make transactions
   **/
  @ApiModelProperty(required = true, value = "Maximum value of the credit limit to make transactions")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Credit Limit Value accumulated of the sum of the purchase parcels
   **/
  @ApiModelProperty(required = true, value = "Credit Limit Value accumulated of the sum of the purchase parcels")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   **/
  @ApiModelProperty(value = "Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) ")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaPersist {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  dataAberturaEmpresa: ").append(dataAberturaEmpresa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  socios: ").append(socios).append("\n");
    sb.append("  referenciasComerciais: ").append(referenciasComerciais).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
