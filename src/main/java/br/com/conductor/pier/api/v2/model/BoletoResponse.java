package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the invoice bank slip
 **/
@ApiModel(description = "Response Representation of the invoice bank slip")
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
  @SerializedName("boletoRegistrado")
  private Boolean boletoRegistrado = null;

  
  /**
   * Number of the document is the code informed by the bank to the identification of the client
   **/
  @ApiModelProperty(value = "Number of the document is the code informed by the bank to the identification of the client")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }
  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  
  /**
   * Date of processing (issue or billing) of the bank slip
   **/
  @ApiModelProperty(value = "Date of processing (issue or billing) of the bank slip")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Date of the document (printing)
   **/
  @ApiModelProperty(value = "Date of the document (printing)")
  public String getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * Date of the expiration
   **/
  @ApiModelProperty(value = "Date of the expiration")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Date of the closing
   **/
  @ApiModelProperty(value = "Date of the closing")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Value of the Bank slip
   **/
  @ApiModelProperty(value = "Value of the Bank slip")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * Beneficiary is the person/company that creates the bank slip
   **/
  @ApiModelProperty(value = "Beneficiary is the person/company that creates the bank slip")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Document of the beneficiary
   **/
  @ApiModelProperty(value = "Document of the beneficiary")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * Agency
   **/
  @ApiModelProperty(value = "Agency")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Code of the beneficiary
   **/
  @ApiModelProperty(value = "Code of the beneficiary")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * Covenant number provided by the bank is the code that identifies the issuer with the bank to associate the Bank slip
   **/
  @ApiModelProperty(value = "Covenant number provided by the bank is the code that identifies the issuer with the bank to associate the Bank slip")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * Digit of the beneficiary code
   **/
  @ApiModelProperty(value = "Digit of the beneficiary code")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * Wallet is the code informed by the bank for identification of the type of bank slip
   **/
  @ApiModelProperty(value = "Wallet is the code informed by the bank for identification of the type of bank slip")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * Our number is the code that the beneficiary choose to keep control on the bank slip. This value serves to the identifier which bank slips were paid or not. It is recommended the use of the sequencial numbers, to create lots of bank slips, to facilitate the identification of the paid bank slips
   **/
  @ApiModelProperty(value = "Our number is the code that the beneficiary choose to keep control on the bank slip. This value serves to the identifier which bank slips were paid or not. It is recommended the use of the sequencial numbers, to create lots of bank slips, to facilitate the identification of the paid bank slips")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Digit of our number
   **/
  @ApiModelProperty(value = "Digit of our number")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  
  /**
   * Bank
   **/
  @ApiModelProperty(value = "Bank")
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }

  
  /**
   * Acceptance informs to the bank if it must accept the bank slip after the expiration date (standard: 'N')
   **/
  @ApiModelProperty(value = "Acceptance informs to the bank if it must accept the bank slip after the expiration date (standard: 'N')")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Document type is the identifier of the type of bank slip (standard: 'DV')
   **/
  @ApiModelProperty(value = "Document type is the identifier of the type of bank slip (standard: 'DV')")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }
  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  
  /**
   * Cash is the identifier of the currency of bank slip (standard: 'R$')
   **/
  @ApiModelProperty(value = "Cash is the identifier of the currency of bank slip (standard: 'R$')")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * Instructions for the beneficiary
   **/
  @ApiModelProperty(value = "Instructions for the beneficiary")
  public List<String> getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * Places of payment
   **/
  @ApiModelProperty(value = "Places of payment")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }
  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  
  /**
   * Payer is the person/company that must pay the bank slip
   **/
  @ApiModelProperty(value = "Payer is the person/company that must pay the bank slip")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * Document of the payer (CPF or CNPJ)
   **/
  @ApiModelProperty(value = "Document of the payer (CPF or CNPJ)")
  public String getDocumentoPagador() {
    return documentoPagador;
  }
  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  
  /**
   * Street of the payer
   **/
  @ApiModelProperty(value = "Street of the payer")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }
  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  
  /**
   * Neighborhood of the payer
   **/
  @ApiModelProperty(value = "Neighborhood of the payer")
  public String getBairroPagador() {
    return bairroPagador;
  }
  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  
  /**
   * Zip code of the payer
   **/
  @ApiModelProperty(value = "Zip code of the payer")
  public String getCepPagador() {
    return cepPagador;
  }
  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  
  /**
   * City of the payer
   **/
  @ApiModelProperty(value = "City of the payer")
  public String getCidadePagador() {
    return cidadePagador;
  }
  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  
  /**
   * Federal Unity of the payer
   **/
  @ApiModelProperty(value = "Federal Unity of the payer")
  public String getUfPagador() {
    return ufPagador;
  }
  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  
  /**
   * Numeric value of the bar code
   **/
  @ApiModelProperty(value = "Numeric value of the bar code")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * Digitable Line formated
   **/
  @ApiModelProperty(value = "Digitable Line formated")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * id_account
   **/
  @ApiModelProperty(value = "id_account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Beneficiary's billing address
   **/
  @ApiModelProperty(value = "Beneficiary's billing address")
  public String getEnderecoCobrancaBeneficiario() {
    return enderecoCobrancaBeneficiario;
  }
  public void setEnderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
  }

  
  /**
   * Status
   **/
  @ApiModelProperty(value = "Status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * Registered Bank slip
   **/
  @ApiModelProperty(value = "Registered Bank slip")
  public Boolean getBoletoRegistrado() {
    return boletoRegistrado;
  }
  public void setBoletoRegistrado(Boolean boletoRegistrado) {
    this.boletoRegistrado = boletoRegistrado;
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
    sb.append("  boletoRegistrado: ").append(boletoRegistrado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
