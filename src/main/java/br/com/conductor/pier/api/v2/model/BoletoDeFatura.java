package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do boleto de fatura
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do boleto de fatura")
public class BoletoDeFatura  {
  
  @SerializedName("dataProcessamento")
  private Date dataProcessamento = null;
  @SerializedName("dataDocumento")
  private Date dataDocumento = null;
  @SerializedName("dataVencimento")
  private Date dataVencimento = null;
  @SerializedName("valorBoleto")
  private BigDecimal valorBoleto = null;
  @SerializedName("numeroDoDocumento")
  private String numeroDoDocumento = null;
  @SerializedName("nomeBeneficiario")
  private String nomeBeneficiario = null;
  @SerializedName("agencia")
  private String agencia = null;
  @SerializedName("codigoBeneficiario")
  private String codigoBeneficiario = null;
  @SerializedName("digitoCodigoBeneficiario")
  private String digitoCodigoBeneficiario = null;
  @SerializedName("numeroConvenio")
  private String numeroConvenio = null;
  @SerializedName("carteira")
  private String carteira = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("banco")
  private String banco = null;
  @SerializedName("digitoNossoNumero")
  private String digitoNossoNumero = null;
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
  @SerializedName("documentoBeneficiario")
  private String documentoBeneficiario = null;
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

  
  /**
   * Data do processamento (emiss\u00C3\u00A3o ou faturamento) do boleto
   **/
  @ApiModelProperty(value = "Data do processamento (emiss\u00C3\u00A3o ou faturamento) do boleto")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Data do documento (impress\u00C3\u00A3o)
   **/
  @ApiModelProperty(value = "Data do documento (impress\u00C3\u00A3o)")
  public Date getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(Date dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * Data do vencimento
   **/
  @ApiModelProperty(value = "Data do vencimento")
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * N\u00C3\u00BAmero do documento \u00C3\u00A9 o c\u00C3\u00B3digo informado pelo banco para identifica\u00C3\u00A7\u00C3\u00A3o do cliente
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do documento \u00C3\u00A9 o c\u00C3\u00B3digo informado pelo banco para identifica\u00C3\u00A7\u00C3\u00A3o do cliente")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }
  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  
  /**
   * Benefici\u00C3\u00A1rio \u00C3\u00A9 a pessoa/empresa que gera o boleto
   **/
  @ApiModelProperty(value = "Benefici\u00C3\u00A1rio \u00C3\u00A9 a pessoa/empresa que gera o boleto")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "Ag\u00C3\u00AAncia")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * C\u00C3\u00B3digo do benefici\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do benefici\u00C3\u00A1rio")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * D\u00C3\u00ADgito do c\u00C3\u00B3digo do benefici\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito do c\u00C3\u00B3digo do benefici\u00C3\u00A1rio")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * N\u00C3\u00BAmero do conv\u00C3\u00AAnio fornecido pelo banco \u00C3\u00A9 o c\u00C3\u00B3digo que identifica um emissor junto ao seu banco para associar seus boletos.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do conv\u00C3\u00AAnio fornecido pelo banco \u00C3\u00A9 o c\u00C3\u00B3digo que identifica um emissor junto ao seu banco para associar seus boletos.")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * Carteira \u00C3\u00A9 o c\u00C3\u00B3digo informado pelo banco pra identifica\u00C3\u00A7\u00C3\u00A3o do tipo do boleto
   **/
  @ApiModelProperty(value = "Carteira \u00C3\u00A9 o c\u00C3\u00B3digo informado pelo banco pra identifica\u00C3\u00A7\u00C3\u00A3o do tipo do boleto")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * Nosso n\u00C3\u00BAmero \u00C3\u00A9 o c\u00C3\u00B3digo que o benefici\u00C3\u00A1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00C3\u00A3o. Recomenda-se o uso de n\u00C3\u00BAmeros sequ\u00C3\u00AAnciais, na gera\u00C3\u00A7\u00C3\u00A3o de diversos boletos, para facilitar a identifica\u00C3\u00A7\u00C3\u00A3o dos boletos pagos
   **/
  @ApiModelProperty(value = "Nosso n\u00C3\u00BAmero \u00C3\u00A9 o c\u00C3\u00B3digo que o benefici\u00C3\u00A1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00C3\u00A3o. Recomenda-se o uso de n\u00C3\u00BAmeros sequ\u00C3\u00AAnciais, na gera\u00C3\u00A7\u00C3\u00A3o de diversos boletos, para facilitar a identifica\u00C3\u00A7\u00C3\u00A3o dos boletos pagos")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Banco
   **/
  @ApiModelProperty(value = "Banco")
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }

  
  /**
   * D\u00C3\u00ADgito do nosso n\u00C3\u00BAmero
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito do nosso n\u00C3\u00BAmero")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  
  /**
   * Aceite informa ao banco se deve aceitar o boleto ap\u00C3\u00B3s a data de vencimento (padr\u00C3\u00A3o: \"N\")
   **/
  @ApiModelProperty(value = "Aceite informa ao banco se deve aceitar o boleto ap\u00C3\u00B3s a data de vencimento (padr\u00C3\u00A3o: \"N\")")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Esp\u00C3\u00A9cie do documento \u00C3\u00A9 o identificador do tipo de boleto (padr\u00C3\u00A3o: \"DV\")
   **/
  @ApiModelProperty(value = "Esp\u00C3\u00A9cie do documento \u00C3\u00A9 o identificador do tipo de boleto (padr\u00C3\u00A3o: \"DV\")")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }
  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  
  /**
   * Esp\u00C3\u00A9cie \u00C3\u00A9 o identificador da moeda do boleto (padr\u00C3\u00A3o: \"R$\")
   **/
  @ApiModelProperty(value = "Esp\u00C3\u00A9cie \u00C3\u00A9 o identificador da moeda do boleto (padr\u00C3\u00A3o: \"R$\")")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * Instru\u00C3\u00A7\u00C3\u00B5es para o benefici\u00C3\u00A1rio
   **/
  @ApiModelProperty(value = "Instru\u00C3\u00A7\u00C3\u00B5es para o benefici\u00C3\u00A1rio")
  public List<String> getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * Locais de pagamento
   **/
  @ApiModelProperty(value = "Locais de pagamento")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }
  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  
  /**
   * Pagador \u00C3\u00A9 a pessoa/empresa que deve pagar o boleto
   **/
  @ApiModelProperty(value = "Pagador \u00C3\u00A9 a pessoa/empresa que deve pagar o boleto")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * Documento do pagador (CPF ou CNPJ)
   **/
  @ApiModelProperty(value = "Documento do pagador (CPF ou CNPJ)")
  public String getDocumentoPagador() {
    return documentoPagador;
  }
  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  
  /**
   * Logradouro do pagador
   **/
  @ApiModelProperty(value = "Logradouro do pagador")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }
  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  
  /**
   * Bairro do pagador
   **/
  @ApiModelProperty(value = "Bairro do pagador")
  public String getBairroPagador() {
    return bairroPagador;
  }
  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  
  /**
   * CEP do pagador
   **/
  @ApiModelProperty(value = "CEP do pagador")
  public String getCepPagador() {
    return cepPagador;
  }
  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  
  /**
   * Cidade do pagador
   **/
  @ApiModelProperty(value = "Cidade do pagador")
  public String getCidadePagador() {
    return cidadePagador;
  }
  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  
  /**
   * Unidade federativa do pagador
   **/
  @ApiModelProperty(value = "Unidade federativa do pagador")
  public String getUfPagador() {
    return ufPagador;
  }
  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  
  /**
   * Valor num\u00C3\u00A9rico do c\u00C3\u00B3digo de barras
   **/
  @ApiModelProperty(value = "Valor num\u00C3\u00A9rico do c\u00C3\u00B3digo de barras")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * Linha digit\u00C3\u00A1vel formatada
   **/
  @ApiModelProperty(value = "Linha digit\u00C3\u00A1vel formatada")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoDeFatura {\n");
    
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  dataDocumento: ").append(dataDocumento).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  valorBoleto: ").append(valorBoleto).append("\n");
    sb.append("  numeroDoDocumento: ").append(numeroDoDocumento).append("\n");
    sb.append("  nomeBeneficiario: ").append(nomeBeneficiario).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  codigoBeneficiario: ").append(codigoBeneficiario).append("\n");
    sb.append("  digitoCodigoBeneficiario: ").append(digitoCodigoBeneficiario).append("\n");
    sb.append("  numeroConvenio: ").append(numeroConvenio).append("\n");
    sb.append("  carteira: ").append(carteira).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  digitoNossoNumero: ").append(digitoNossoNumero).append("\n");
    sb.append("  aceite: ").append(aceite).append("\n");
    sb.append("  especieDoDocumento: ").append(especieDoDocumento).append("\n");
    sb.append("  especie: ").append(especie).append("\n");
    sb.append("  instrucoes: ").append(instrucoes).append("\n");
    sb.append("  locaisDePagamento: ").append(locaisDePagamento).append("\n");
    sb.append("  nomePagador: ").append(nomePagador).append("\n");
    sb.append("  documentoBeneficiario: ").append(documentoBeneficiario).append("\n");
    sb.append("  documentoPagador: ").append(documentoPagador).append("\n");
    sb.append("  logradouroPagador: ").append(logradouroPagador).append("\n");
    sb.append("  bairroPagador: ").append(bairroPagador).append("\n");
    sb.append("  cepPagador: ").append(cepPagador).append("\n");
    sb.append("  cidadePagador: ").append(cidadePagador).append("\n");
    sb.append("  ufPagador: ").append(ufPagador).append("\n");
    sb.append("  codigoDeBarras: ").append(codigoDeBarras).append("\n");
    sb.append("  linhaDigitavel: ").append(linhaDigitavel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


