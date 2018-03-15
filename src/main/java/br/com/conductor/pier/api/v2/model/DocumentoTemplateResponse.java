package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso do Template de Documento
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso do Template de Documento")
public class DocumentoTemplateResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;

  
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
   * ID do Tipo de Template.
   **/
  @ApiModelProperty(value = "ID do Tipo de Template.")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplateResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTemplate: ").append(idTipoTemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
