package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do Template de Documento
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do Template de Documento")
public class DocumentoTemplateResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoDocumento")
  private Long idTipoDocumento = null;

  
  /**
   * ID do Template do Documento.
   **/
  @ApiModelProperty(value = "ID do Template do Documento.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID do Tipo de Documento.
   **/
  @ApiModelProperty(value = "ID do Tipo de Documento.")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplateResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoDocumento: ").append(idTipoDocumento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


