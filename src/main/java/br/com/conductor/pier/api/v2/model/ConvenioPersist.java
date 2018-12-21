package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Object for save Convenant 
 **/
@ApiModel(description = "Request Object for save Convenant ")
public class ConvenioPersist  {
  
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("agencia")
  private Long agencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("especie")
  private String especie = null;
  @SerializedName("numeroConvenio")
  private BigDecimal numeroConvenio = null;
  @SerializedName("carteira")
  private Long carteira = null;
  @SerializedName("codigoCedente")
  private String codigoCedente = null;
  @SerializedName("especieTipo")
  private String especieTipo = null;
  @SerializedName("especieDocumento")
  private String especieDocumento = null;
  @SerializedName("aceite")
  private Boolean aceite = null;
  @SerializedName("instrucoes")
  private String instrucoes = null;
  @SerializedName("localPagamento1")
  private String localPagamento1 = null;
  @SerializedName("localPagamento2")
  private String localPagamento2 = null;
  @SerializedName("enderecoCobrancaEmissor")
  private String enderecoCobrancaEmissor = null;
  @SerializedName("nomeBeneficiario")
  private String nomeBeneficiario = null;
  @SerializedName("cnpjBeneficiario")
  private String cnpjBeneficiario = null;

  
  /**
   * Bank Id
   **/
  @ApiModelProperty(required = true, value = "Bank Id")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Agency Number
   **/
  @ApiModelProperty(required = true, value = "Agency Number")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Current Account
   **/
  @ApiModelProperty(required = true, value = "Current Account")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * Convenant Id code
   **/
  @ApiModelProperty(value = "Convenant Id code")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * Number Convenant
   **/
  @ApiModelProperty(value = "Number Convenant")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * Wallet Id Code
   **/
  @ApiModelProperty(value = "Wallet Id Code")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * Assignor code
   **/
  @ApiModelProperty(value = "Assignor code")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * Species Value
   **/
  @ApiModelProperty(value = "Species Value")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * Species Document Value
   **/
  @ApiModelProperty(value = "Species Document Value")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * Information about if payer signed billing document
   **/
  @ApiModelProperty(value = "Information about if payer signed billing document")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Instructions for the payment
   **/
  @ApiModelProperty(value = "Instructions for the payment")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * preferred place for payment
   **/
  @ApiModelProperty(value = "preferred place for payment")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * preferred place for payment(additional)
   **/
  @ApiModelProperty(value = "preferred place for payment(additional)")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * billing address
   **/
  @ApiModelProperty(value = "billing address")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * Beneficiary name
   **/
  @ApiModelProperty(value = "Beneficiary name")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Beneficiary cnpj
   **/
  @ApiModelProperty(value = "Beneficiary cnpj")
  public String getCnpjBeneficiario() {
    return cnpjBeneficiario;
  }
  public void setCnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvenioPersist {\n");
    
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  especie: ").append(especie).append("\n");
    sb.append("  numeroConvenio: ").append(numeroConvenio).append("\n");
    sb.append("  carteira: ").append(carteira).append("\n");
    sb.append("  codigoCedente: ").append(codigoCedente).append("\n");
    sb.append("  especieTipo: ").append(especieTipo).append("\n");
    sb.append("  especieDocumento: ").append(especieDocumento).append("\n");
    sb.append("  aceite: ").append(aceite).append("\n");
    sb.append("  instrucoes: ").append(instrucoes).append("\n");
    sb.append("  localPagamento1: ").append(localPagamento1).append("\n");
    sb.append("  localPagamento2: ").append(localPagamento2).append("\n");
    sb.append("  enderecoCobrancaEmissor: ").append(enderecoCobrancaEmissor).append("\n");
    sb.append("  nomeBeneficiario: ").append(nomeBeneficiario).append("\n");
    sb.append("  cnpjBeneficiario: ").append(cnpjBeneficiario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
