package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of response of Detailed Fraud Risk
 **/
@ApiModel(description = "Object of response of Detailed Fraud Risk")
public class RiscoFraudeDetalhadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoResolucao")
  private Long idTipoResolucao = null;
  @SerializedName("descricaoTipoResolucao")
  private String descricaoTipoResolucao = null;
  @SerializedName("flagAltoRisco")
  private Boolean flagAltoRisco = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("valorOrigem")
  private BigDecimal valorOrigem = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("valorDestino")
  private BigDecimal valorDestino = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("idPais")
  private String idPais = null;
  @SerializedName("codigoRespostaAutorizador")
  private String codigoRespostaAutorizador = null;
  @SerializedName("descricaoRespostaAutorizador")
  private String descricaoRespostaAutorizador = null;
  @SerializedName("codigoRespostaFraude")
  private String codigoRespostaFraude = null;
  @SerializedName("descricaoRespostaFraude")
  private String descricaoRespostaFraude = null;
  @SerializedName("origemTransacao")
  private String origemTransacao = null;
  @SerializedName("codigoModoEntradaTerminal")
  private String codigoModoEntradaTerminal = null;
  @SerializedName("descricaoModoEntradaTerminal")
  private String descricaoModoEntradaTerminal = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("telefones")
  private List<TelefoneResponse> telefones = null;

  
  /**
   * Identification Code of risk of fraud
   **/
  @ApiModelProperty(value = "Identification Code of risk of fraud")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification code of the type of resolution attributed to the register
   **/
  @ApiModelProperty(value = "Identification code of the type of resolution attributed to the register")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Description of the type of resolution attributed to the resgister
   **/
  @ApiModelProperty(value = "Description of the type of resolution attributed to the resgister")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * Indicate that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed
   **/
  @ApiModelProperty(value = "Indicate that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * Code of identification of the account
   **/
  @ApiModelProperty(value = "Code of identification of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification code of the card
   **/
  @ApiModelProperty(value = "Identification code of the card")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Code of identification of the product
   **/
  @ApiModelProperty(value = "Code of identification of the product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the transaction
   **/
  @ApiModelProperty(value = "Identification Code of the transaction")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Date that the transaction ranked as a risk of fraude was made
   **/
  @ApiModelProperty(value = "Date that the transaction ranked as a risk of fraude was made")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Value of the transaction ranked as a risk of fraud
   **/
  @ApiModelProperty(value = "Value of the transaction ranked as a risk of fraud")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Code of the origin currency used for the transaction
   **/
  @ApiModelProperty(value = "Code of the origin currency used for the transaction")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Value of the transactions in the origin currency
   **/
  @ApiModelProperty(value = "Value of the transactions in the origin currency")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * Code of the destination currency used for the transaction
   **/
  @ApiModelProperty(value = "Code of the destination currency used for the transaction")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Value of the transaction of the intended currency of the transaction of the destination currency
   **/
  @ApiModelProperty(value = "Value of the transaction of the intended currency of the transaction of the destination currency")
  public BigDecimal getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(BigDecimal valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * Name of the establishment where the transaction with risk of fraud was made
   **/
  @ApiModelProperty(value = "Name of the establishment where the transaction with risk of fraud was made")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Identification code of the Country
   **/
  @ApiModelProperty(value = "Identification code of the Country")
  public String getIdPais() {
    return idPais;
  }
  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }

  
  /**
   * Response code of the authorizer for the transaction
   **/
  @ApiModelProperty(value = "Response code of the authorizer for the transaction")
  public String getCodigoRespostaAutorizador() {
    return codigoRespostaAutorizador;
  }
  public void setCodigoRespostaAutorizador(String codigoRespostaAutorizador) {
    this.codigoRespostaAutorizador = codigoRespostaAutorizador;
  }

  
  /**
   * Description of the response of the authorizer for the transaction
   **/
  @ApiModelProperty(value = "Description of the response of the authorizer for the transaction")
  public String getDescricaoRespostaAutorizador() {
    return descricaoRespostaAutorizador;
  }
  public void setDescricaoRespostaAutorizador(String descricaoRespostaAutorizador) {
    this.descricaoRespostaAutorizador = descricaoRespostaAutorizador;
  }

  
  /**
   * Response code of the tool of fraund prevention for the transaction
   **/
  @ApiModelProperty(value = "Response code of the tool of fraund prevention for the transaction")
  public String getCodigoRespostaFraude() {
    return codigoRespostaFraude;
  }
  public void setCodigoRespostaFraude(String codigoRespostaFraude) {
    this.codigoRespostaFraude = codigoRespostaFraude;
  }

  
  /**
   * Description of the response of the Prevention tool to the fraud for the transaction
   **/
  @ApiModelProperty(value = "Description of the response of the Prevention tool to the fraud for the transaction")
  public String getDescricaoRespostaFraude() {
    return descricaoRespostaFraude;
  }
  public void setDescricaoRespostaFraude(String descricaoRespostaFraude) {
    this.descricaoRespostaFraude = descricaoRespostaFraude;
  }

  
  /**
   * Type of Terminal that caused the Transaction (POS, ATM, TEF, etc)
   **/
  @ApiModelProperty(value = "Type of Terminal that caused the Transaction (POS, ATM, TEF, etc)")
  public String getOrigemTransacao() {
    return origemTransacao;
  }
  public void setOrigemTransacao(String origemTransacao) {
    this.origemTransacao = origemTransacao;
  }

  
  /**
   * Code of identification of the origin mode of the transaction capture
   **/
  @ApiModelProperty(value = "Code of identification of the origin mode of the transaction capture")
  public String getCodigoModoEntradaTerminal() {
    return codigoModoEntradaTerminal;
  }
  public void setCodigoModoEntradaTerminal(String codigoModoEntradaTerminal) {
    this.codigoModoEntradaTerminal = codigoModoEntradaTerminal;
  }

  
  /**
   * Description of the origin mode of the transaction capture
   **/
  @ApiModelProperty(value = "Description of the origin mode of the transaction capture")
  public String getDescricaoModoEntradaTerminal() {
    return descricaoModoEntradaTerminal;
  }
  public void setDescricaoModoEntradaTerminal(String descricaoModoEntradaTerminal) {
    this.descricaoModoEntradaTerminal = descricaoModoEntradaTerminal;
  }

  
  /**
   * Number of CPF of the Person carrdholder, when it is the Physical type
   **/
  @ApiModelProperty(value = "Number of CPF of the Person carrdholder, when it is the Physical type")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * CNPJ number of the Per?son cardholder, when it is the Legal type
   **/
  @ApiModelProperty(value = "CNPJ number of the Per?son cardholder, when it is the Legal type")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Email Address of the Cardholder
   **/
  @ApiModelProperty(value = "Email Address of the Cardholder")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * List of associated telephones to the cardholder
   **/
  @ApiModelProperty(value = "List of associated telephones to the cardholder")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeDetalhadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  valorOrigem: ").append(valorOrigem).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  valorDestino: ").append(valorDestino).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  codigoRespostaAutorizador: ").append(codigoRespostaAutorizador).append("\n");
    sb.append("  descricaoRespostaAutorizador: ").append(descricaoRespostaAutorizador).append("\n");
    sb.append("  codigoRespostaFraude: ").append(codigoRespostaFraude).append("\n");
    sb.append("  descricaoRespostaFraude: ").append(descricaoRespostaFraude).append("\n");
    sb.append("  origemTransacao: ").append(origemTransacao).append("\n");
    sb.append("  codigoModoEntradaTerminal: ").append(codigoModoEntradaTerminal).append("\n");
    sb.append("  descricaoModoEntradaTerminal: ").append(descricaoModoEntradaTerminal).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
