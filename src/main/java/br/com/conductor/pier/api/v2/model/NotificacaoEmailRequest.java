package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AnexoNotificacaoEmailRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the resource of sending a notification by email.??o do recurso para envio de uma notifica??o por email
 **/
@ApiModel(description = "Representation of the resource of sending a notification by email.??o do recurso para envio de uma notifica??o por email")
public class NotificacaoEmailRequest  {
  
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("destinatarios")
  private List<String> destinatarios = null;
  @SerializedName("anexos")
  private List<AnexoNotificacaoEmailRequest> anexos = null;
  @SerializedName("parametrosConteudo")
  private Map<String, Object> parametrosConteudo = null;

  
  /**
   * ID for the template of the notification
   **/
  @ApiModelProperty(value = "ID for the template of the notification")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * List of email(s) of the addressee
   **/
  @ApiModelProperty(value = "List of email(s) of the addressee")
  public List<String> getDestinatarios() {
    return destinatarios;
  }
  public void setDestinatarios(List<String> destinatarios) {
    this.destinatarios = destinatarios;
  }

  
  /**
   * List of ids of the attaches to be sent
   **/
  @ApiModelProperty(value = "List of ids of the attaches to be sent")
  public List<AnexoNotificacaoEmailRequest> getAnexos() {
    return anexos;
  }
  public void setAnexos(List<AnexoNotificacaoEmailRequest> anexos) {
    this.anexos = anexos;
  }

  
  /**
   * Map of parameter for the montage of the notification
   **/
  @ApiModelProperty(value = "Map of parameter for the montage of the notification")
  public Map<String, Object> getParametrosConteudo() {
    return parametrosConteudo;
  }
  public void setParametrosConteudo(Map<String, Object> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoEmailRequest {\n");
    
    sb.append("  idTemplateNotificacao: ").append(idTemplateNotificacao).append("\n");
    sb.append("  destinatarios: ").append(destinatarios).append("\n");
    sb.append("  anexos: ").append(anexos).append("\n");
    sb.append("  parametrosConteudo: ").append(parametrosConteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
