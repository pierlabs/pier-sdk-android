package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{documento_template_response_description}}}
 **/
@ApiModel(description = "{{{documento_template_response_description}}}")
public class DocumentoTemplateResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;

  
  /**
   * {{{documento_template_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_template_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_template_response_id_tipo_template_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_template_response_id_tipo_template_value}}}")
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
