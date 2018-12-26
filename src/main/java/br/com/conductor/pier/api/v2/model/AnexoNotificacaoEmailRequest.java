package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de um documento anexo para uma notifica\u00E7\u00E3o
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de um documento anexo para uma notifica\u00E7\u00E3o")
public class AnexoNotificacaoEmailRequest  {
  
  @SerializedName("idDocumento")
  private Long idDocumento = null;

  
  /**
   * ID do documento que ser\u00E1 anexado a notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "ID do documento que ser\u00E1 anexado a notifica\u00E7\u00E3o")
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
