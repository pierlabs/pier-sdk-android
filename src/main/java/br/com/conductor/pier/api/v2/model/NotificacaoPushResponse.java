package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{notificacao_push_response_description}}}
 **/
@ApiModel(description = "{{{notificacao_push_response_description}}}")
public class NotificacaoPushResponse  {
  
  @SerializedName("dataEnvio")
  private String dataEnvio = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  public enum StatusEnum {
     PENDENTE,  ENCAMINHADO,  ENVIADO,  RESPONDIDO,  ERRO,  ERRO_RESPOSTA,  SUCESSO_RESPOSTA, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tokenDispositivo")
  private String tokenDispositivo = null;
  @SerializedName("titulo")
  private String titulo = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  public enum PlataformaEnum {
     APNS,  FCM,  GCM, 
  };
  @SerializedName("plataforma")
  private PlataformaEnum plataforma = null;
  @SerializedName("protocolo")
  private String protocolo = null;

  
  /**
   * {{{notificacao_push_response_data_envio_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_data_envio_value}}}")
  public String getDataEnvio() {
    return dataEnvio;
  }
  public void setDataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
  }

  
  /**
   * {{{notificacao_push_response_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{notificacao_push_response_tipo_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{notificacao_push_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{notificacao_push_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_push_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{notificacao_push_response_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_push_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{notificacao_push_response_token_dispositivo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_push_response_token_dispositivo_value}}}")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * {{{notificacao_push_response_titulo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_push_response_titulo_value}}}")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * {{{notificacao_push_response_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{notificacao_push_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{notificacao_push_response_plataforma_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_plataforma_value}}}")
  public PlataformaEnum getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * {{{notificacao_push_response_protocolo_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_push_response_protocolo_value}}}")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoPushResponse {\n");
    
    sb.append("  dataEnvio: ").append(dataEnvio).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tokenDispositivo: ").append(tokenDispositivo).append("\n");
    sb.append("  titulo: ").append(titulo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  plataforma: ").append(plataforma).append("\n");
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
