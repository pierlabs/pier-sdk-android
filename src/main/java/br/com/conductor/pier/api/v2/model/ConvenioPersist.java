package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{convenio_persist_description}}} 
 **/
@ApiModel(description = "{{{convenio_persist_description}}} ")
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
   * {{{convenio_persist_banco_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{convenio_persist_banco_value}}}")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{convenio_persist_agencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{convenio_persist_agencia_value}}}")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{convenio_persist_conta_corrente_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{convenio_persist_conta_corrente_value}}}")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{convenio_persist_especie_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_especie_value}}}")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{convenio_persist_numero_convenio_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_numero_convenio_value}}}")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{convenio_persist_carteira_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_carteira_value}}}")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{convenio_persist_codigo_cedente_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_codigo_cedente_value}}}")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * {{{convenio_persist_especie_tipo_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_especie_tipo_value}}}")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * {{{convenio_persist_especie_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_especie_documento_value}}}")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * {{{convenio_persist_aceite_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_aceite_value}}}")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{convenio_persist_instrucoes_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_instrucoes_value}}}")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{convenio_persist_local_pagamento1_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_local_pagamento1_value}}}")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * {{{convenio_persist_local_pagamento2_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_local_pagamento2_value}}}")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * {{{convenio_persist_endereco_cobranca_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_endereco_cobranca_emissor_value}}}")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * {{{convenio_persist_nome_beneficiario_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_nome_beneficiario_emissor_value}}}")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{convenio_persist_cnpj_beneficiario_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{convenio_persist_cnpj_beneficiario_emissor_value}}}")
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
