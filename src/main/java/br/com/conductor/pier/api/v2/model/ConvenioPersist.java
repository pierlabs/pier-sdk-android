package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ConvenioPersist
 **/
@ApiModel(description = "ConvenioPersist")
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
   * Identifica\u00E7\u00E3o do banco.
   **/
  @ApiModelProperty(required = true, value = "Identifica\u00E7\u00E3o do banco.")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero da ag\u00EAncia.")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Conta corrente.
   **/
  @ApiModelProperty(required = true, value = "Conta corrente.")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * C\u00F3digo do tipo de esp\u00E9cie do documento.
   **/
  @ApiModelProperty(value = "C\u00F3digo do tipo de esp\u00E9cie do documento.")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio.")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * C\u00F3digo da carteira de cobran\u00E7a.
   **/
  @ApiModelProperty(value = "C\u00F3digo da carteira de cobran\u00E7a.")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * C\u00F3digo do cedente.
   **/
  @ApiModelProperty(value = "C\u00F3digo do cedente.")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * Tipo de esp\u00E9cie de t\u00EDtulo de cr\u00E9dito.
   **/
  @ApiModelProperty(value = "Tipo de esp\u00E9cie de t\u00EDtulo de cr\u00E9dito.")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * Esp\u00E9cie do documento.
   **/
  @ApiModelProperty(value = "Esp\u00E9cie do documento.")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * Indica se o pagador assinou o documento de cobran\u00E7a que originou o boleto. O padr\u00E3o \u00E9 usar \"N\".
   **/
  @ApiModelProperty(value = "Indica se o pagador assinou o documento de cobran\u00E7a que originou o boleto. O padr\u00E3o \u00E9 usar \"N\".")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Instru\u00E7\u00F5es para pagamento.
   **/
  @ApiModelProperty(value = "Instru\u00E7\u00F5es para pagamento.")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * Local preferencial onde pode ser efetuado o pagamento.
   **/
  @ApiModelProperty(value = "Local preferencial onde pode ser efetuado o pagamento.")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * Local para pagamento (campo adicional).
   **/
  @ApiModelProperty(value = "Local para pagamento (campo adicional).")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * Endere\u00E7o de cobran\u00E7a do emissor.
   **/
  @ApiModelProperty(value = "Endere\u00E7o de cobran\u00E7a do emissor.")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * Nome do benefici\u00E1rio/cedente da cobran\u00E7a.
   **/
  @ApiModelProperty(value = "Nome do benefici\u00E1rio/cedente da cobran\u00E7a.")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * CNPJ do benefici\u00E1rio/cedente da cobran\u00E7a.
   **/
  @ApiModelProperty(value = "CNPJ do benefici\u00E1rio/cedente da cobran\u00E7a.")
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
