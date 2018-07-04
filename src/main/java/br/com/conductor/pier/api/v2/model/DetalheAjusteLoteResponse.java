package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{detalhe_ajuste_lote_response_description}}}
 **/
@ApiModel(description = "{{{detalhe_ajuste_lote_response_description}}}")
public class DetalheAjusteLoteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("arquivoId")
  private Long arquivoId = null;
  @SerializedName("tipoAjusteDescricao")
  private String tipoAjusteDescricao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataTransacao")
  private Date dataTransacao = null;
  @SerializedName("valorTotalTransacao")
  private String valorTotalTransacao = null;
  @SerializedName("tipoOperacao")
  private String tipoOperacao = null;
  @SerializedName("dataProcessamento")
  private Date dataProcessamento = null;
  @SerializedName("numeroLinha")
  private Integer numeroLinha = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;

  
  /**
   * {{{detalhe_ajuste_lote_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_arquivoId_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_arquivoId_value}}}")
  public Long getArquivoId() {
    return arquivoId;
  }
  public void setArquivoId(Long arquivoId) {
    this.arquivoId = arquivoId;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_idTipoAjuste_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_idTipoAjuste_value}}}")
  public String getTipoAjusteDescricao() {
    return tipoAjusteDescricao;
  }
  public void setTipoAjusteDescricao(String tipoAjusteDescricao) {
    this.tipoAjusteDescricao = tipoAjusteDescricao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_idConta_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_idConta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_Status_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_Status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_dataTransacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_dataTransacao_value}}}")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_valorTransacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_valorTransacao_value}}}")
  public String getValorTotalTransacao() {
    return valorTotalTransacao;
  }
  public void setValorTotalTransacao(String valorTotalTransacao) {
    this.valorTotalTransacao = valorTotalTransacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_tipoRegistro_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_tipoRegistro_value}}}")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_dataProcessamento_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_dataProcessamento_value}}}")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_numeroLinha_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_numeroLinha_value}}}")
  public Integer getNumeroLinha() {
    return numeroLinha;
  }
  public void setNumeroLinha(Integer numeroLinha) {
    this.numeroLinha = numeroLinha;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_descricaoStatus_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_ajuste_lote_response_descricaoStatus_value}}}")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheAjusteLoteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  arquivoId: ").append(arquivoId).append("\n");
    sb.append("  tipoAjusteDescricao: ").append(tipoAjusteDescricao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTotalTransacao: ").append(valorTotalTransacao).append("\n");
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  numeroLinha: ").append(numeroLinha).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


