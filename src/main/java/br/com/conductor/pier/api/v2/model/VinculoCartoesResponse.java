package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object with link-to-cards response
 **/
@ApiModel(description = "Object with link-to-cards response")
public class VinculoCartoesResponse  {
  
  @SerializedName("idCartaoPrincipal")
  private Long idCartaoPrincipal = null;
  @SerializedName("idCartaoVinculado")
  private Long idCartaoVinculado = null;

  
  /**
   * ID code of main card generated
   **/
  @ApiModelProperty(value = "ID code of main card generated")
  public Long getIdCartaoPrincipal() {
    return idCartaoPrincipal;
  }
  public void setIdCartaoPrincipal(Long idCartaoPrincipal) {
    this.idCartaoPrincipal = idCartaoPrincipal;
  }

  
  /**
   * Id of the card attached to the card
   **/
  @ApiModelProperty(value = "Id of the card attached to the card")
  public Long getIdCartaoVinculado() {
    return idCartaoVinculado;
  }
  public void setIdCartaoVinculado(Long idCartaoVinculado) {
    this.idCartaoVinculado = idCartaoVinculado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoCartoesResponse {\n");
    
    sb.append("  idCartaoPrincipal: ").append(idCartaoPrincipal).append("\n");
    sb.append("  idCartaoVinculado: ").append(idCartaoVinculado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
