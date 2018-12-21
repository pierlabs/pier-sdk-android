package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{notificacao_s_m_s_response_description}}}
 **/
@ApiModel(description = "{{{notificacao_s_m_s_response_description}}}")
public class NotificacaoSMSResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nsu")
  private Long nsu = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ERRO,  TRANSACAO_SIMULACAO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_TOKEN, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  public enum StatusEnum {
     PENDENTE,  ENCAMINHADO,  ENVIADO,  RESPONDIDO,  ERRO,  ERRO_RESPOSTA,  SUCESSO_RESPOSTA, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("operadora")
  private String operadora = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("resposta")
  private String resposta = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("quantidadeTentativasEnvio")
  private Integer quantidadeTentativasEnvio = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracaoStatus")
  private String dataAlteracaoStatus = null;
  @SerializedName("protocolo")
  private String protocolo = null;

  
  /**
   * {{{notificacao_s_m_s_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_s_m_s_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{notificacao_s_m_s_response_nsu_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_s_m_s_response_nsu_value}}}")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_s_m_s_response_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{notificacao_s_m_s_response_tipo_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_s_m_s_response_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{notificacao_s_m_s_response_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{notificacao_s_m_s_response_descricao_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_descricao_status_value}}}")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{notificacao_s_m_s_response_celular_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_celular_value}}}")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * {{{notificacao_s_m_s_response_operadora_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_operadora_value}}}")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * {{{notificacao_s_m_s_response_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{notificacao_s_m_s_response_resposta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_resposta_value}}}")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_agendamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_data_agendamento_value}}}")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * {{{notificacao_s_m_s_response_quantidade_tentativas_envio_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_quantidade_tentativas_envio_value}}}")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_alteracao_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_s_m_s_response_data_alteracao_status_value}}}")
  public String getDataAlteracaoStatus() {
    return dataAlteracaoStatus;
  }
  public void setDataAlteracaoStatus(String dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
  }

  
  /**
   * {{{notificacao_s_m_s_response_protocolo_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_s_m_s_response_protocolo_value}}}")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoSMSResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nsu: ").append(nsu).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  operadora: ").append(operadora).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  resposta: ").append(resposta).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  quantidadeTentativasEnvio: ").append(quantidadeTentativasEnvio).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracaoStatus: ").append(dataAlteracaoStatus).append("\n");
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
