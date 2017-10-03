package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.")
public class DocumentoTemplatePersist  {
  
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("integracoes")
  private List<ReferenciaIdPersist> integracoes = null;

  
  /**
   * ID para o Tipo de Template vinculado ao template.
   **/
  @ApiModelProperty(value = "ID para o Tipo de Template vinculado ao template.")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  
  /**
   * Template para o conte\u00C3\u00BAdo do documento.
   **/
  @ApiModelProperty(value = "Template para o conte\u00C3\u00BAdo do documento.")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   * Lista de configura\u00C3\u00A7\u00C3\u00B5es de integra\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Lista de configura\u00C3\u00A7\u00C3\u00B5es de integra\u00C3\u00A7\u00C3\u00A3o")
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


