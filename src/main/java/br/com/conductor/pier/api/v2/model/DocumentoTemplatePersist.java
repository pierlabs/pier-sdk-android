package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the document template
 **/
@ApiModel(description = "Representation of the document template")
public class DocumentoTemplatePersist  {
  
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("integracoes")
  private List<ReferenciaIdPersist> integracoes = null;

  
  /**
   * ID for the template type linked to the template
   **/
  @ApiModelProperty(value = "ID for the template type linked to the template")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  
  /**
   * Template for the content of the document
   **/
  @ApiModelProperty(value = "Template for the content of the document")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   * Integrate Configuration List
   **/
  @ApiModelProperty(value = "Integrate Configuration List")
  public List<ReferenciaIdPersist> getIntegracoes() {
    return integracoes;
  }
  public void setIntegracoes(List<ReferenciaIdPersist> integracoes) {
    this.integracoes = integracoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplatePersist {\n");
    
    sb.append("  idTipoTemplate: ").append(idTipoTemplate).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("  integracoes: ").append(integracoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
