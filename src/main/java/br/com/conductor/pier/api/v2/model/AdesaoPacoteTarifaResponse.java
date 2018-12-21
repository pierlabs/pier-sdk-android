package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PacoteTarifaResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{adesao_pacote_tarifa_resposta_descricao}}}
 **/
@ApiModel(description = "{{{adesao_pacote_tarifa_resposta_descricao}}}")
public class AdesaoPacoteTarifaResponse  {
  
  @SerializedName("aplicacaoUtilizado")
  private Integer aplicacaoUtilizado = null;
  @SerializedName("bilheteUnicoUtilizado")
  private Integer bilheteUnicoUtilizado = null;
  @SerializedName("boletoUtilizado")
  private Integer boletoUtilizado = null;
  @SerializedName("ciclo")
  private Integer ciclo = null;
  @SerializedName("cobraTarifa")
  private Boolean cobraTarifa = null;
  @SerializedName("dataFimCiclo")
  private String dataFimCiclo = null;
  @SerializedName("dataHoraAtivacao")
  private String dataHoraAtivacao = null;
  @SerializedName("dataHoraDesativacao")
  private String dataHoraDesativacao = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("pacoteTarifa")
  private PacoteTarifaResponse pacoteTarifa = null;
  @SerializedName("pagamentoContaUtilizado")
  private Integer pagamentoContaUtilizado = null;
  @SerializedName("recargaCelularUtilizado")
  private Integer recargaCelularUtilizado = null;
  @SerializedName("saqueUtilizado")
  private Integer saqueUtilizado = null;
  @SerializedName("tarifaManutencaoCobrada")
  private Boolean tarifaManutencaoCobrada = null;
  @SerializedName("transferenciaUtilizado")
  private Integer transferenciaUtilizado = null;

  
  /**
   * {{{adesao_pacote_tarifa_resposta_aplicacao_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_aplicacao_utilizado_descricao}}}")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_bilhete_unico_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_bilhete_unico_utilizado_descricao}}}")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_boleto_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_boleto_utilizado_descricao}}}")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_ciclo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_ciclo_descricao}}}")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_cobra_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_cobra_tarifa_descricao}}}")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_fim_ciclo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_data_fim_ciclo_descricao}}}")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_hora_ativacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_data_hora_ativacao_descricao}}}")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_hora_desativacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_data_hora_desativacao_descricao}}}")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_id_conta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_id_conta_descricao}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_pacote_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_pacote_tarifa_descricao}}}")
  public PacoteTarifaResponse getPacoteTarifa() {
    return pacoteTarifa;
  }
  public void setPacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_pagamento_conta_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_pagamento_conta_utilizado_descricao}}}")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_recarga_celular_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_recarga_celular_utilizado_descricao}}}")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_saque_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_saque_utilizado_descricao}}}")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_tarifa_manutencao_cobrada_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_tarifa_manutencao_cobrada_descricao}}}")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_transferencia_utilizado_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_pacote_tarifa_resposta_transferencia_utilizado_descricao}}}")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaResponse {\n");
    
    sb.append("  aplicacaoUtilizado: ").append(aplicacaoUtilizado).append("\n");
    sb.append("  bilheteUnicoUtilizado: ").append(bilheteUnicoUtilizado).append("\n");
    sb.append("  boletoUtilizado: ").append(boletoUtilizado).append("\n");
    sb.append("  ciclo: ").append(ciclo).append("\n");
    sb.append("  cobraTarifa: ").append(cobraTarifa).append("\n");
    sb.append("  dataFimCiclo: ").append(dataFimCiclo).append("\n");
    sb.append("  dataHoraAtivacao: ").append(dataHoraAtivacao).append("\n");
    sb.append("  dataHoraDesativacao: ").append(dataHoraDesativacao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  pacoteTarifa: ").append(pacoteTarifa).append("\n");
    sb.append("  pagamentoContaUtilizado: ").append(pagamentoContaUtilizado).append("\n");
    sb.append("  recargaCelularUtilizado: ").append(recargaCelularUtilizado).append("\n");
    sb.append("  saqueUtilizado: ").append(saqueUtilizado).append("\n");
    sb.append("  tarifaManutencaoCobrada: ").append(tarifaManutencaoCobrada).append("\n");
    sb.append("  transferenciaUtilizado: ").append(transferenciaUtilizado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
