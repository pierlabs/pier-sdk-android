package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.")
public class DocumentoTemplatePersist  {
  
  @SerializedName("idTipoDocumento")
  private Long idTipoDocumento = null;
  @SerializedName("template")
  private String template = null;

  
  /**
   * ID para o Tipo de Documento vinculado ao template.
   **/
  @ApiModelProperty(value = "ID para o Tipo de Documento vinculado ao template.")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplatePersist {\n");
    
    sb.append("  idTipoDocumento: ").append(idTipoDocumento).append("\n");
    sb.append("  template: ").append(template).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


