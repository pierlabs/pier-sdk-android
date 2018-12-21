package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Parameters of Fraud Risk
 **/
@ApiModel(description = "Response Parameters of Fraud Risk")
public class RiskFraudResponse  {
  
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
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;

  
  /**
   * identification Code of the risk of Fraud
   **/
  @ApiModelProperty(value = "identification Code of the risk of Fraud")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the type of resolution attributed to the register
   **/
  @ApiModelProperty(value = "Identification Code of the type of resolution attributed to the register")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Description of the type of the resolution attributed to the register
   **/
  @ApiModelProperty(value = "Description of the type of the resolution attributed to the register")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * When it is active, it indicates that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed
   **/
  @ApiModelProperty(value = "When it is active, it indicates that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * Identification code of the account
   **/
  @ApiModelProperty(value = "Identification code of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card
   **/
  @ApiModelProperty(value = "Identification Code of the Card")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
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
   * Date which the transaction ranked as a risk of fraud was made
   **/
  @ApiModelProperty(value = "Date which the transaction ranked as a risk of fraud was made")
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
   * Value of the transaction ranked as a risk of fraud
   **/
  @ApiModelProperty(value = "Value of the transaction ranked as a risk of fraud")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFraudResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
