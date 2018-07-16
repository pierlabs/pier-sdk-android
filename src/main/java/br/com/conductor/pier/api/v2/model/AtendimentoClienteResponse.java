package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{atendimento_cliente_response_description}}}
 **/
@ApiModel(description = "{{{atendimento_cliente_response_description}}}")
public class AtendimentoClienteResponse  {
  
  @SerializedName("idAtendimento")
  private Long idAtendimento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoAtendimento")
  private Long idTipoAtendimento = null;
  @SerializedName("descricaoTipoAtendimento")
  private String descricaoTipoAtendimento = null;
  @SerializedName("conteudoAtendimento")
  private String conteudoAtendimento = null;
  @SerializedName("detalhesAtendimento")
  private String detalhesAtendimento = null;
  @SerializedName("nomeAtendente")
  private String nomeAtendente = null;
  @SerializedName("nomeSistema")
  private String nomeSistema = null;
  @SerializedName("dataHoraInicioAtendimento")
  private String dataHoraInicioAtendimento = null;
  @SerializedName("dataHoraFimAtendimento")
  private String dataHoraFimAtendimento = null;
  @SerializedName("dataAtendimento")
  private String dataAtendimento = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("dataProcessamento")
  private String dataProcessamento = null;
  @SerializedName("flagProcessamento")
  private Integer flagProcessamento = null;

  
  /**
   * {{{atendimento_cliente_response_id_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_id_atendimento_value}}}")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{atendimento_cliente_response_id_tipo_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_id_tipo_atendimento_value}}}")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_descricao_tipo_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_descricao_tipo_atendimento_value}}}")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_conteudo_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_conteudo_atendimento_value}}}")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_detalhes_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_detalhes_atendimento_value}}}")
  public String getDetalhesAtendimento() {
    return detalhesAtendimento;
  }
  public void setDetalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_nome_atendente_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_nome_atendente_value}}}")
  public String getNomeAtendente() {
    return nomeAtendente;
  }
  public void setNomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
  }

  
  /**
   * {{{atendimento_cliente_response_nome_sistema_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_nome_sistema_value}}}")
  public String getNomeSistema() {
    return nomeSistema;
  }
  public void setNomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
  }

  
  /**
   * {{{atendimento_cliente_response_data_hora_inicio_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_data_hora_inicio_atendimento_value}}}")
  public String getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_data_hora_fim_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_data_hora_fim_atendimento_value}}}")
  public String getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_data_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_data_atendimento_value}}}")
  public String getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * {{{atendimento_cliente_response_data_agendamento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_data_agendamento_value}}}")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * {{{atendimento_cliente_response_data_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_data_processamento_value}}}")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{atendimento_cliente_response_flag_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{atendimento_cliente_response_flag_processamento_value}}}")
  public Integer getFlagProcessamento() {
    return flagProcessamento;
  }
  public void setFlagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtendimentoClienteResponse {\n");
    
    sb.append("  idAtendimento: ").append(idAtendimento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoAtendimento: ").append(idTipoAtendimento).append("\n");
    sb.append("  descricaoTipoAtendimento: ").append(descricaoTipoAtendimento).append("\n");
    sb.append("  conteudoAtendimento: ").append(conteudoAtendimento).append("\n");
    sb.append("  detalhesAtendimento: ").append(detalhesAtendimento).append("\n");
    sb.append("  nomeAtendente: ").append(nomeAtendente).append("\n");
    sb.append("  nomeSistema: ").append(nomeSistema).append("\n");
    sb.append("  dataHoraInicioAtendimento: ").append(dataHoraInicioAtendimento).append("\n");
    sb.append("  dataHoraFimAtendimento: ").append(dataHoraFimAtendimento).append("\n");
    sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  flagProcessamento: ").append(flagProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


