package br.com.conductor.pier.api.v2.model;

import java.util.*;
import java.util.Map;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso para envio de uma notifica\u00C3\u00A7\u00C3\u00A3o por email.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso para envio de uma notifica\u00C3\u00A7\u00C3\u00A3o por email.")
public class NotificacaoEmailRequest  {
  
  @SerializedName("idDocumento")
  private Long idDocumento = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("destinatario")
  private String destinatario = null;
  public enum TipoLayoutEnum {
     RECUPERAR_SENHA,  FATURA_POR_EMAIL,  VALIDAR_DISPOSITIVO,  NOTIFICACAO_EMAIL, 
  };
  @SerializedName("tipoLayout")
  private TipoLayoutEnum tipoLayout = null;
  @SerializedName("parametrosConteudo")
  private Map<String, Object> parametrosConteudo = null;

  
  /**
   * ID para o documento a ser enviado.
   **/
  @ApiModelProperty(value = "ID para o documento a ser enviado.")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * ID para o template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "ID para o template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Email do destinat\u00C3\u00A1rio.
   **/
  @ApiModelProperty(value = "Email do destinat\u00C3\u00A1rio.")
  public String getDestinatario() {
    return destinatario;
  }
  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  
  /**
   * Tipo de layout para o template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Tipo de layout para o template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * Mapa de par\u00C3\u00A2metros para montagem da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Mapa de par\u00C3\u00A2metros para montagem da notifica\u00C3\u00A7\u00C3\u00A3o.")
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
    
    sb.append("  idDocumento: ").append(idDocumento).append("\n");
    sb.append("  idTemplateNotificacao: ").append(idTemplateNotificacao).append("\n");
    sb.append("  destinatario: ").append(destinatario).append("\n");
    sb.append("  tipoLayout: ").append(tipoLayout).append("\n");
    sb.append("  parametrosConteudo: ").append(parametrosConteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


