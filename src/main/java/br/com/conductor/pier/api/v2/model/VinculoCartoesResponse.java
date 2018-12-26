package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto com response do v\u00EDnculo entre cart\u00F5es
 **/
@ApiModel(description = "Objeto com response do v\u00EDnculo entre cart\u00F5es")
public class VinculoCartoesResponse  {
  
  @SerializedName("idCartaoPrincipal")
  private Long idCartaoPrincipal = null;
  @SerializedName("idCartaoVinculado")
  private Long idCartaoVinculado = null;

  
  /**
   * C\u00F3digo identificador do cart\u00E3o principal gerado
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o principal gerado")
  public Long getIdCartaoPrincipal() {
    return idCartaoPrincipal;
  }
  public void setIdCartaoPrincipal(Long idCartaoPrincipal) {
    this.idCartaoPrincipal = idCartaoPrincipal;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o vinculado gerado
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o vinculado gerado")
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
