package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AnexoNotificacaoEmailRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{notificacao_email_request_description}}}
 **/
@ApiModel(description = "{{{notificacao_email_request_description}}}")
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
   * {{{notificacao_email_request_id_template_notificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_email_request_id_template_notificacao_value}}}")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * {{{notificacao_email_request_destinatarios_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_email_request_destinatarios_value}}}")
  public List<String> getDestinatarios() {
    return destinatarios;
  }
  public void setDestinatarios(List<String> destinatarios) {
    this.destinatarios = destinatarios;
  }

  
  /**
   * {{{notificacao_email_request_anexos_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_email_request_anexos_value}}}")
  public List<AnexoNotificacaoEmailRequest> getAnexos() {
    return anexos;
  }
  public void setAnexos(List<AnexoNotificacaoEmailRequest> anexos) {
    this.anexos = anexos;
  }

  
  /**
   * {{{notificacao_email_request_parametros_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_email_request_parametros_conteudo_value}}}")
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
