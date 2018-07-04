package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transacao_corrente_response_description}}}
 **/
@ApiModel(description = "{{{transacao_corrente_response_description}}}")
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
   * {{{transacao_corrente_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transacao_corrente_response_id_tipo_registro_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_id_tipo_registro_value}}}")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * {{{transacao_corrente_response_ordem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_ordem_value}}}")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * {{{transacao_corrente_response_id_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_id_transacao_value}}}")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{transacao_corrente_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{transacao_corrente_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transacao_corrente_response_descricao_status_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_descricao_status_value}}}")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * {{{transacao_corrente_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transacao_corrente_response_valor_dolar_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_valor_dolar_value}}}")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * {{{transacao_corrente_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{transacao_corrente_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{transacao_corrente_response_data_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_data_evento_value}}}")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * {{{transacao_corrente_response_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_estabelecimento_value}}}")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * {{{transacao_corrente_response_flag_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_flag_credito_value}}}")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{transacao_corrente_response_tipo_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_tipo_estabelecimento_value}}}")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * {{{transacao_corrente_response_id_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_id_grupo_m_c_c_value}}}")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * {{{transacao_corrente_response_flag_solicitou_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_corrente_response_flag_solicitou_contestacao_value}}}")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
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
    sb.append("}\n");
    return sb.toString();
  }
}


