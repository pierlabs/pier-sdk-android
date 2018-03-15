package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AnexoNotificacaoEmailRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso para envio de uma notifica\u00E7\u00E3o por email.
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso para envio de uma notifica\u00E7\u00E3o por email.")
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
   * ID para o template da notifica\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "ID para o template da notifica\u00E7\u00E3o.")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Lista de email(s) do(s) destinat\u00E1rio(s).
   **/
  @ApiModelProperty(value = "Lista de email(s) do(s) destinat\u00E1rio(s).")
  public List<String> getDestinatarios() {
    return destinatarios;
  }
  public void setDestinatarios(List<String> destinatarios) {
    this.destinatarios = destinatarios;
  }

  
  /**
   * Lista de ids dos anexos a serem enviados.
   **/
  @ApiModelProperty(value = "Lista de ids dos anexos a serem enviados.")
  public List<AnexoNotificacaoEmailRequest> getAnexos() {
    return anexos;
  }
  public void setAnexos(List<AnexoNotificacaoEmailRequest> anexos) {
    this.anexos = anexos;
  }

  
  /**
   * Mapa de par\u00E2metros para montagem da notifica\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Mapa de par\u00E2metros para montagem da notifica\u00E7\u00E3o.")
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
