package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de refer\u00EAncia para os dados do boleto de entrada
 **/
@ApiModel(description = "Objeto de refer\u00EAncia para os dados do boleto de entrada")
public class AcordoBoletoPersist  {
  
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * C\u00F3digo de identifia\u00E7\u00E3o do conv\u00EAnio
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifia\u00E7\u00E3o do conv\u00EAnio")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoBoletoPersist {\n");
    
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
