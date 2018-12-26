package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{documento_template_persist_description}}}
 **/
@ApiModel(description = "{{{documento_template_persist_description}}}")
public class DocumentoTemplatePersist  {
  
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;
  @SerializedName("template")
  private String template = null;
  @SerializedName("integracoes")
  private List<ReferenciaIdPersist> integracoes = null;

  
  /**
   * {{{documento_template_persist_id_tipo_template_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_template_persist_id_tipo_template_value}}}")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  
  /**
   * {{{documento_template_persist_template_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_template_persist_template_value}}}")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   * {{{documento_template_persist_integracoes_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_template_persist_integracoes_value}}}")
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
