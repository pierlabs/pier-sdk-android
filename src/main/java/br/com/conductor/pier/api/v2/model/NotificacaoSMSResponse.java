package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object SMS
 **/
@ApiModel(description = "Object SMS")
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
   * Identifier Code
   **/
  @ApiModelProperty(value = "Identifier Code")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Unique Sequel Number
   **/
  @ApiModelProperty(value = "Unique Sequel Number")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * Identification Code of the issuer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the issuer (id)")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * TipoEvento de notifica??o
   **/
  @ApiModelProperty(value = "TipoEvento de notifica??o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Notification Sending Status
   **/
  @ApiModelProperty(required = true, value = "Notification Sending Status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Description of the sending status of the notification
   **/
  @ApiModelProperty(required = true, value = "Description of the sending status of the notification")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * Identified Code of the person
   **/
  @ApiModelProperty(required = true, value = "Identified Code of the person")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identifier Code of the Account
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Show the cell phone to be sent the SMS in format 5588999999999 or 5588999999999
   **/
  @ApiModelProperty(required = true, value = "Show the cell phone to be sent the SMS in format 5588999999999 or 5588999999999")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Show the operator of the cell phone to be sent the SMS
   **/
  @ApiModelProperty(required = true, value = "Show the operator of the cell phone to be sent the SMS")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * Show the notification text to be sent
   **/
  @ApiModelProperty(required = true, value = "Show the notification text to be sent")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Show the text of the notification response that was sent
   **/
  @ApiModelProperty(required = true, value = "Show the text of the notification response that was sent")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * Show the date and time which will be sent the notification
   **/
  @ApiModelProperty(required = true, value = "Show the date and time which will be sent the notification")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quantity of attempts and notification sending
   **/
  @ApiModelProperty(required = true, value = "Quantity of attempts and notification sending")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * Show the date which the register was included in the base to be sent
   **/
  @ApiModelProperty(required = true, value = "Show the date which the register was included in the base to be sent")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Show the date which the status of the register was modified
   **/
  @ApiModelProperty(required = true, value = "Show the date which the status of the register was modified")
  public String getDataAlteracaoStatus() {
    return dataAlteracaoStatus;
  }
  public void setDataAlteracaoStatus(String dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
  }

  
  /**
   * Protocol Number of the notification sending
   **/
  @ApiModelProperty(value = "Protocol Number of the notification sending")
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
