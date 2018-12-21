package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{adesao_pacote_tarifa_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{adesao_pacote_tarifa_persistencia_descricao}}}")
public class AdesaoPacoteTarifaPersist  {
  
  @SerializedName("idPacoteTarifa")
  private Long idPacoteTarifa = null;
  @SerializedName("ciclo")
  private Integer ciclo = null;
  @SerializedName("dataHoraAtivacao")
  private String dataHoraAtivacao = null;
  @SerializedName("dataHoraDesativacao")
  private String dataHoraDesativacao = null;
  @SerializedName("dataFimCiclo")
  private String dataFimCiclo = null;
  @SerializedName("recargaCelularUtilizado")
  private Integer recargaCelularUtilizado = null;
  @SerializedName("bilheteUnicoUtilizado")
  private Integer bilheteUnicoUtilizado = null;
  @SerializedName("pagamentoContaUtilizado")
  private Integer pagamentoContaUtilizado = null;
  @SerializedName("saqueUtilizado")
  private Integer saqueUtilizado = null;
  @SerializedName("transferenciaUtilizado")
  private Integer transferenciaUtilizado = null;
  @SerializedName("boletoUtilizado")
  private Integer boletoUtilizado = null;
  @SerializedName("aplicacaoUtilizado")
  private Integer aplicacaoUtilizado = null;
  @SerializedName("tarifaManutencaoCobrada")
  private Boolean tarifaManutencaoCobrada = null;
  @SerializedName("cobraTarifa")
  private Boolean cobraTarifa = null;

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_id_pacote_tarefa_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_id_pacote_tarefa_descricao}}}")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_ciclo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_ciclo_descricao}}}")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_hora_ativacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_data_hora_ativacao_descricao}}}")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_hora_desativacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_data_hora_desativacao_descricao}}}")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_fim_ciclo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_data_fim_ciclo_descricao}}}")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_recarga_celular_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_recarga_celular_utilizado_descricao}}}")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_bilhete_unico_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_bilhete_unico_utilizado_descricao}}}")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_pagamento_conta_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_pagamento_conta_utilizado_descricao}}}")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_saque_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_saque_utilizado_descricao}}}")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_transferencia_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_transferencia_utilizado_descricao}}}")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_boleto_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_boleto_utilizado_descricao}}}")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_aplicacao_utilizado_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adesao_pacote_tarifa_persistencia_aplicacao_utilizado_descricao}}}")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_tarifa_manutencao_cobrada_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_tarifa_manutencao_cobrada_descricao}}}")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_cobra_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_persistencia_cobra_tarifa_descricao}}}")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaPersist {\n");
    
    sb.append("  idPacoteTarifa: ").append(idPacoteTarifa).append("\n");
    sb.append("  ciclo: ").append(ciclo).append("\n");
    sb.append("  dataHoraAtivacao: ").append(dataHoraAtivacao).append("\n");
    sb.append("  dataHoraDesativacao: ").append(dataHoraDesativacao).append("\n");
    sb.append("  dataFimCiclo: ").append(dataFimCiclo).append("\n");
    sb.append("  recargaCelularUtilizado: ").append(recargaCelularUtilizado).append("\n");
    sb.append("  bilheteUnicoUtilizado: ").append(bilheteUnicoUtilizado).append("\n");
    sb.append("  pagamentoContaUtilizado: ").append(pagamentoContaUtilizado).append("\n");
    sb.append("  saqueUtilizado: ").append(saqueUtilizado).append("\n");
    sb.append("  transferenciaUtilizado: ").append(transferenciaUtilizado).append("\n");
    sb.append("  boletoUtilizado: ").append(boletoUtilizado).append("\n");
    sb.append("  aplicacaoUtilizado: ").append(aplicacaoUtilizado).append("\n");
    sb.append("  tarifaManutencaoCobrada: ").append(tarifaManutencaoCobrada).append("\n");
    sb.append("  cobraTarifa: ").append(cobraTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
