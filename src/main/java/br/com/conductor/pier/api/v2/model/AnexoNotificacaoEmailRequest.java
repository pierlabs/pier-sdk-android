package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{anexo_notificacao_email_request_description}}}
 **/
@ApiModel(description = "{{{anexo_notificacao_email_request_description}}}")
public class AnexoNotificacaoEmailRequest  {
  
  @SerializedName("idDocumento")
  private Long idDocumento = null;

  
  /**
   * {{{anexo_notificacao_email_request_id_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{anexo_notificacao_email_request_id_documento_value}}}")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnexoNotificacaoEmailRequest {\n");
    
    sb.append("  idDocumento: ").append(idDocumento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


