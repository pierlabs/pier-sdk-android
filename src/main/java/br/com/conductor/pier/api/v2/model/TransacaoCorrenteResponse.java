package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso transacao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso transacao")
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
  @SerializedName("idEventoAjuste")
  private Integer idEventoAjuste = null;

  
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
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de transacao (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de transacao (id)")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representa\u00E7\u00E3o da ordena\u00E7\u00E3o da transacao (id)
   **/
  @ApiModelProperty(value = "Representa\u00E7\u00E3o da ordena\u00E7\u00E3o da transacao (id)")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transacao (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transacao (id)")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Atributo que representa a descri\u00E7\u00E3o da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa a descri\u00E7\u00E3o da transa\u00E7\u00E3o")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Atributo que representa a descri\u00E7\u00E3o do status da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa a descri\u00E7\u00E3o do status da transa\u00E7\u00E3o")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * Atributo que representa o valor da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o valor da transa\u00E7\u00E3o")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Atributo que representa o valor em D\u00F3lar da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o valor em D\u00F3lar da transa\u00E7\u00E3o")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * Atributo que representa a quantidade de parcelas da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa a quantidade de parcelas da transa\u00E7\u00E3o")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Atributo que representa o valor da parcela da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o valor da parcela da transa\u00E7\u00E3o")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Atributo que representa a data de envio da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa a data de envio da transa\u00E7\u00E3o")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * Atributo que representa o estabelecimento da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o estabelecimento da transa\u00E7\u00E3o")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito
   **/
  @ApiModelProperty(value = "Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Atributo que representa o tipo de estabelecimento da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o tipo de estabelecimento da transa\u00E7\u00E3o")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * Atributo que representa o grupo MCC da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o grupo MCC da transa\u00E7\u00E3o")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Atributo que identifica se o portador solicitou contesta\u00E7\u00E3o da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que identifica se o portador solicitou contesta\u00E7\u00E3o da transa\u00E7\u00E3o")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito
   **/
  @ApiModelProperty(value = "Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito")
  public Integer getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(Integer tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * Atributo que representa o evento de ajuste
   **/
  @ApiModelProperty(value = "Atributo que representa o evento de ajuste")
  public Integer getIdEventoAjuste() {
    return idEventoAjuste;
  }
  public void setIdEventoAjuste(Integer idEventoAjuste) {
    this.idEventoAjuste = idEventoAjuste;
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
    sb.append("  idEventoAjuste: ").append(idEventoAjuste).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
