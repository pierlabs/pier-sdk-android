package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the transaction resource
 **/
@ApiModel(description = "Representation of the transaction resource")
public class TransacaoCorrenteResponse  {
  
  @SerializedName("ultimaParcelaLancada")
  private Integer ultimaParcelaLancada = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoRegistro")
  private Long idTipoRegistro = null;
  @SerializedName("ordem")
  private Integer ordem = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("valorDolar")
  private BigDecimal valorDolar = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("dataEvento")
  private String dataEvento = null;
  @SerializedName("estabelecimento")
  private String estabelecimento = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("tipoEstabelecimento")
  private String tipoEstabelecimento = null;
  @SerializedName("idGrupoMCC")
  private Integer idGrupoMCC = null;
  @SerializedName("flagSolicitouContestacao")
  private Integer flagSolicitouContestacao = null;
  @SerializedName("tipoTransacao")
  private Integer tipoTransacao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUltimaParcelaLancada() {
    return ultimaParcelaLancada;
  }
  public void setUltimaParcelaLancada(Integer ultimaParcelaLancada) {
    this.ultimaParcelaLancada = ultimaParcelaLancada;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification code of the transaction type (id)
   **/
  @ApiModelProperty(value = "Identification code of the transaction type (id)")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representation of the transaction order (id)
   **/
  @ApiModelProperty(value = "Representation of the transaction order (id)")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * Identification Code of the transaction (id)
   **/
  @ApiModelProperty(value = "Identification Code of the transaction (id)")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Attribute that represents the description of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the description of the transaction")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Attribute that represents the identifier code of the transaction status
   **/
  @ApiModelProperty(value = "Attribute that represents the identifier code of the transaction status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Attribute that represent the description of the transaction status
   **/
  @ApiModelProperty(value = "Attribute that represent the description of the transaction status")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * Attribute that represents the value of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the value of the transaction")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Attribute that represents the value in dollar of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the value in dollar of the transaction")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * Attribute that represents the quantity of parcels of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the quantity of parcels of the transaction")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Attribute that represents the parcel value of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the parcel value of the transaction")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Attribute that represents the sending date of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the sending date of the transaction")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * Attribute that represents the merchant of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the merchant of the transaction")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Attribute that identifies if the transaction is a credit one or debit one
   **/
  @ApiModelProperty(value = "Attribute that identifies if the transaction is a credit one or debit one")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Attribute that represents the type merchant of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the type merchant of the transaction")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * Attribute that represents the MCC group of the transaction
   **/
  @ApiModelProperty(value = "Attribute that represents the MCC group of the transaction")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Attribute that identifier if the cardholder requested the contesting of the transaction
   **/
  @ApiModelProperty(value = "Attribute that identifier if the cardholder requested the contesting of the transaction")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Attribute that identifies if the transaction is a credit one or debit one
   **/
  @ApiModelProperty(value = "Attribute that identifies if the transaction is a credit one or debit one")
  public Integer getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(Integer tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoCorrenteResponse {\n");
    
    sb.append("  ultimaParcelaLancada: ").append(ultimaParcelaLancada).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoRegistro: ").append(idTipoRegistro).append("\n");
    sb.append("  ordem: ").append(ordem).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  valorDolar: ").append(valorDolar).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  dataEvento: ").append(dataEvento).append("\n");
    sb.append("  estabelecimento: ").append(estabelecimento).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  tipoEstabelecimento: ").append(tipoEstabelecimento).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  flagSolicitouContestacao: ").append(flagSolicitouContestacao).append("\n");
    sb.append("  tipoTransacao: ").append(tipoTransacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
