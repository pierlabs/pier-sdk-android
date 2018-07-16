package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{boleto_response_description}}}
 **/
@ApiModel(description = "{{{boleto_response_description}}}")
public class BoletoResponse  {
  
  @SerializedName("numeroDoDocumento")
  private String numeroDoDocumento = null;
  @SerializedName("dataProcessamento")
  private String dataProcessamento = null;
  @SerializedName("dataDocumento")
  private String dataDocumento = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("dataFechamento")
  private String dataFechamento = null;
  @SerializedName("valorBoleto")
  private BigDecimal valorBoleto = null;
  @SerializedName("nomeBeneficiario")
  private String nomeBeneficiario = null;
  @SerializedName("documentoBeneficiario")
  private String documentoBeneficiario = null;
  @SerializedName("agencia")
  private String agencia = null;
  @SerializedName("codigoBeneficiario")
  private String codigoBeneficiario = null;
  @SerializedName("numeroConvenio")
  private String numeroConvenio = null;
  @SerializedName("digitoCodigoBeneficiario")
  private String digitoCodigoBeneficiario = null;
  @SerializedName("carteira")
  private String carteira = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("digitoNossoNumero")
  private String digitoNossoNumero = null;
  @SerializedName("banco")
  private String banco = null;
  @SerializedName("aceite")
  private Boolean aceite = null;
  @SerializedName("especieDoDocumento")
  private String especieDoDocumento = null;
  @SerializedName("especie")
  private String especie = null;
  @SerializedName("instrucoes")
  private List<String> instrucoes = null;
  @SerializedName("locaisDePagamento")
  private List<String> locaisDePagamento = null;
  @SerializedName("nomePagador")
  private String nomePagador = null;
  @SerializedName("documentoPagador")
  private String documentoPagador = null;
  @SerializedName("logradouroPagador")
  private String logradouroPagador = null;
  @SerializedName("bairroPagador")
  private String bairroPagador = null;
  @SerializedName("cepPagador")
  private String cepPagador = null;
  @SerializedName("cidadePagador")
  private String cidadePagador = null;
  @SerializedName("ufPagador")
  private String ufPagador = null;
  @SerializedName("codigoDeBarras")
  private String codigoDeBarras = null;
  @SerializedName("linhaDigitavel")
  private String linhaDigitavel = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("enderecoCobrancaBeneficiario")
  private String enderecoCobrancaBeneficiario = null;
  @SerializedName("status")
  private Long status = null;

  
  /**
   * {{{boleto_response_numero_do_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_numero_do_documento_value}}}")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }
  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  
  /**
   * {{{boleto_response_data_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_data_processamento_value}}}")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{boleto_response_data_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_data_documento_value}}}")
  public String getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * {{{boleto_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_response_data_fechamento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_data_fechamento_value}}}")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * {{{boleto_response_valor_boleto_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_valor_boleto_value}}}")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * {{{boleto_response_nome_beneficiario_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_nome_beneficiario_value}}}")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{boleto_response_documento_beneficiario_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_documento_beneficiario_value}}}")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * {{{boleto_response_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_agencia_value}}}")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{boleto_response_codigo_beneficiario_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_codigo_beneficiario_value}}}")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * {{{boleto_response_numero_convenio_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_numero_convenio_value}}}")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{boleto_response_digito_codigo_beneficiario_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_digito_codigo_beneficiario_value}}}")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * {{{boleto_response_carteira_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_carteira_value}}}")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{boleto_response_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_nosso_numero_value}}}")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{boleto_response_digito_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_digito_nosso_numero_value}}}")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  
  /**
   * {{{boleto_response_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_banco_value}}}")
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }

  
  /**
   * {{{boleto_response_aceite_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_aceite_value}}}")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{boleto_response_especie_do_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_especie_do_documento_value}}}")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }
  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  
  /**
   * {{{boleto_response_especie_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_especie_value}}}")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{boleto_response_instrucoes_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_instrucoes_value}}}")
  public List<String> getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{boleto_response_locais_de_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_locais_de_pagamento_value}}}")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }
  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  
  /**
   * {{{boleto_response_nome_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_nome_pagador_value}}}")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * {{{boleto_response_documento_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_documento_pagador_value}}}")
  public String getDocumentoPagador() {
    return documentoPagador;
  }
  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  
  /**
   * {{{boleto_response_logradouro_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_logradouro_pagador_value}}}")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }
  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  
  /**
   * {{{boleto_response_bairro_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_bairro_pagador_value}}}")
  public String getBairroPagador() {
    return bairroPagador;
  }
  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  
  /**
   * {{{boleto_response_cep_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_cep_pagador_value}}}")
  public String getCepPagador() {
    return cepPagador;
  }
  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  
  /**
   * {{{boleto_response_cidade_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_cidade_pagador_value}}}")
  public String getCidadePagador() {
    return cidadePagador;
  }
  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  
  /**
   * {{{boleto_response_uf_pagador_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_uf_pagador_value}}}")
  public String getUfPagador() {
    return ufPagador;
  }
  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  
  /**
   * {{{boleto_response_codigo_de_barras_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_codigo_de_barras_value}}}")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * {{{boleto_response_linha_digitavel_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_linha_digitavel_value}}}")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  
  /**
   * {{{boleto_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{boleto_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_response_endereco_cobranca_beneficiario_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_endereco_cobranca_beneficiario_value}}}")
  public String getEnderecoCobrancaBeneficiario() {
    return enderecoCobrancaBeneficiario;
  }
  public void setEnderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
  }

  
  /**
   * {{{boleto_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_status_value}}}")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoResponse {\n");
    
    sb.append("  numeroDoDocumento: ").append(numeroDoDocumento).append("\n");
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  dataDocumento: ").append(dataDocumento).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  valorBoleto: ").append(valorBoleto).append("\n");
    sb.append("  nomeBeneficiario: ").append(nomeBeneficiario).append("\n");
    sb.append("  documentoBeneficiario: ").append(documentoBeneficiario).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  codigoBeneficiario: ").append(codigoBeneficiario).append("\n");
    sb.append("  numeroConvenio: ").append(numeroConvenio).append("\n");
    sb.append("  digitoCodigoBeneficiario: ").append(digitoCodigoBeneficiario).append("\n");
    sb.append("  carteira: ").append(carteira).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  digitoNossoNumero: ").append(digitoNossoNumero).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  aceite: ").append(aceite).append("\n");
    sb.append("  especieDoDocumento: ").append(especieDoDocumento).append("\n");
    sb.append("  especie: ").append(especie).append("\n");
    sb.append("  instrucoes: ").append(instrucoes).append("\n");
    sb.append("  locaisDePagamento: ").append(locaisDePagamento).append("\n");
    sb.append("  nomePagador: ").append(nomePagador).append("\n");
    sb.append("  documentoPagador: ").append(documentoPagador).append("\n");
    sb.append("  logradouroPagador: ").append(logradouroPagador).append("\n");
    sb.append("  bairroPagador: ").append(bairroPagador).append("\n");
    sb.append("  cepPagador: ").append(cepPagador).append("\n");
    sb.append("  cidadePagador: ").append(cidadePagador).append("\n");
    sb.append("  ufPagador: ").append(ufPagador).append("\n");
    sb.append("  codigoDeBarras: ").append(codigoDeBarras).append("\n");
    sb.append("  linhaDigitavel: ").append(linhaDigitavel).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  enderecoCobrancaBeneficiario: ").append(enderecoCobrancaBeneficiario).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


