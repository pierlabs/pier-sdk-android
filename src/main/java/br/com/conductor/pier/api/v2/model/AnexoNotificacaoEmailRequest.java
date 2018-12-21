package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the attached document for a notification
 **/
@ApiModel(description = "Representation of the attached document for a notification")
public class AnexoNotificacaoEmailRequest  {
  
  @SerializedName("idDocumento")
  private Long idDocumento = null;

  
  /**
   * ID of the Document will be attached to the notification
   **/
  @ApiModelProperty(value = "ID of the Document will be attached to the notification")
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
