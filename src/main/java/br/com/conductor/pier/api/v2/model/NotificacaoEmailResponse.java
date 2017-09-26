package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Notifica\u00C3\u00A7\u00C3\u00A3o do envio do email
 **/
@ApiModel(description = "Notifica\u00C3\u00A7\u00C3\u00A3o do envio do email")
public class NotificacaoEmailResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("idDocumento")
  private Long idDocumento = null;
  @SerializedName("destinatario")
  private String destinatario = null;
  @SerializedName("remetente")
  private String remetente = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da notifica\u00C3\u00A7\u00C3\u00A3o gerada.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da notifica\u00C3\u00A7\u00C3\u00A3o gerada.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do Documento.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do Documento.")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * Email do destinat\u00C3\u00A1rio da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Email do destinat\u00C3\u00A1rio da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public String getDestinatario() {
    return destinatario;
  }
  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  
  /**
   * Email do remetente da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Email do remetente da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoEmailResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplateNotificacao: ").append(idTemplateNotificacao).append("\n");
    sb.append("  idDocumento: ").append(idDocumento).append("\n");
    sb.append("  destinatario: ").append(destinatario).append("\n");
    sb.append("  remetente: ").append(remetente).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


