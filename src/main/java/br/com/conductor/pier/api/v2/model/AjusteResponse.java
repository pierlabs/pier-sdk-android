package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class AjusteResponse  {
  
  @SerializedName("idAjuste")
  private Long idAjuste = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjusteResponse {\n");
    
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


