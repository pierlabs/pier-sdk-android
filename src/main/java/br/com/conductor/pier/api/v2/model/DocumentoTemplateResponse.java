package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the template resource document response
 **/
@ApiModel(description = "Representation of the template resource document response")
public class DocumentoTemplateResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;

  
  /**
   * Template ID of the Document
   **/
  @ApiModelProperty(value = "Template ID of the Document")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID of the Type of Template
   **/
  @ApiModelProperty(value = "ID of the Type of Template")
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
