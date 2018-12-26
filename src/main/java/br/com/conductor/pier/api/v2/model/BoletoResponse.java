package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do boleto de fatura
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do boleto de fatura")
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
   * N\u00FAmero do documento \u00E9 o c\u00F3digo informado pelo banco para identifica\u00E7\u00E3o do cliente
   **/
  @ApiModelProperty(value = "N\u00FAmero do documento \u00E9 o c\u00F3digo informado pelo banco para identifica\u00E7\u00E3o do cliente")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }
  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  
  /**
   * Data do processamento (emiss\u00E3o ou faturamento) do boleto
   **/
  @ApiModelProperty(value = "Data do processamento (emiss\u00E3o ou faturamento) do boleto")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Data do documento (impress\u00E3o)
   **/
  @ApiModelProperty(value = "Data do documento (impress\u00E3o)")
  public String getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * Data do vencimento
   **/
  @ApiModelProperty(value = "Data do vencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Data do fechamento
   **/
  @ApiModelProperty(value = "Data do fechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Valor do Boleto
   **/
  @ApiModelProperty(value = "Valor do Boleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * Benefici\u00E1rio \u00E9 a pessoa/empresa que gera o boleto
   **/
  @ApiModelProperty(value = "Benefici\u00E1rio \u00E9 a pessoa/empresa que gera o boleto")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Documento do Beneficiario
   **/
  @ApiModelProperty(value = "Documento do Beneficiario")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * Ag\u00EAncia
   **/
  @ApiModelProperty(value = "Ag\u00EAncia")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * C\u00F3digo do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "C\u00F3digo do benefici\u00E1rio")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * N\u00FAmero do conv\u00EAnio fornecido pelo banco \u00E9 o c\u00F3digo que identifica um emissor junto ao seu banco para associar seus boletos
   **/
  @ApiModelProperty(value = "N\u00FAmero do conv\u00EAnio fornecido pelo banco \u00E9 o c\u00F3digo que identifica um emissor junto ao seu banco para associar seus boletos")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * D\u00EDgito do c\u00F3digo do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "D\u00EDgito do c\u00F3digo do benefici\u00E1rio")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * Carteira \u00E9 o c\u00F3digo informado pelo banco pra identifica\u00E7\u00E3o do tipo do boleto
   **/
  @ApiModelProperty(value = "Carteira \u00E9 o c\u00F3digo informado pelo banco pra identifica\u00E7\u00E3o do tipo do boleto")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * Nosso n\u00FAmero \u00E9 o c\u00F3digo que o benefici\u00E1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00E3o. Recomenda-se o uso de n\u00FAmeros sequ\u00EAnciais, na gera\u00E7\u00E3o de diversos boletos, para facilitar a identifica\u00E7\u00E3o dos boletos pagos
   **/
  @ApiModelProperty(value = "Nosso n\u00FAmero \u00E9 o c\u00F3digo que o benefici\u00E1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00E3o. Recomenda-se o uso de n\u00FAmeros sequ\u00EAnciais, na gera\u00E7\u00E3o de diversos boletos, para facilitar a identifica\u00E7\u00E3o dos boletos pagos")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * D\u00EDgito do nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "D\u00EDgito do nosso n\u00FAmero")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
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
   * Aceite informa ao banco se deve aceitar o boleto ap\u00F3s a data de vencimento (padr\u00E3o: 'N')
   **/
  @ApiModelProperty(value = "Aceite informa ao banco se deve aceitar o boleto ap\u00F3s a data de vencimento (padr\u00E3o: 'N')")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Esp\u00E9cie do documento \u00E9 o identificador do tipo de boleto (padr\u00E3o: 'DV')
   **/
  @ApiModelProperty(value = "Esp\u00E9cie do documento \u00E9 o identificador do tipo de boleto (padr\u00E3o: 'DV')")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }
  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  
  /**
   * Esp\u00E9cie \u00E9 o identificador da moeda do boleto (padr\u00E3o: 'R$')
   **/
  @ApiModelProperty(value = "Esp\u00E9cie \u00E9 o identificador da moeda do boleto (padr\u00E3o: 'R$')")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * Instru\u00E7\u00F5es para o benefici\u00E1rio
   **/
  @ApiModelProperty(value = "Instru\u00E7\u00F5es para o benefici\u00E1rio")
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
   * Pagador \u00E9 a pessoa/empresa que deve pagar o boleto
   **/
  @ApiModelProperty(value = "Pagador \u00E9 a pessoa/empresa que deve pagar o boleto")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
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
   * Valor num\u00E9rico do c\u00F3digo de barras
   **/
  @ApiModelProperty(value = "Valor num\u00E9rico do c\u00F3digo de barras")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * Linha digit\u00E1vel formatada
   **/
  @ApiModelProperty(value = "Linha digit\u00E1vel formatada")
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
   * id_conta
   **/
  @ApiModelProperty(value = "id_conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Endere\u00E7o de cobran\u00E7a do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "Endere\u00E7o de cobran\u00E7a do benefici\u00E1rio")
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
   * Boleto Registrado
   **/
  @ApiModelProperty(value = "Boleto Registrado")
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
