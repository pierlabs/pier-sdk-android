package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{vincular_cartoes_response_description}}}
 **/
@ApiModel(description = "{{{vincular_cartoes_response_description}}}")
public class VinculoCartoesResponse  {
  
  @SerializedName("idCartaoPrincipal")
  private Long idCartaoPrincipal = null;
  @SerializedName("idCartaoVinculado")
  private Long idCartaoVinculado = null;

  
  /**
   * {{{vincular_cartoes_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{vincular_cartoes_response_id_cartao_value}}}")
  public Long getIdCartaoPrincipal() {
    return idCartaoPrincipal;
  }
  public void setIdCartaoPrincipal(Long idCartaoPrincipal) {
    this.idCartaoPrincipal = idCartaoPrincipal;
  }

  
  /**
   * {{{vincular_cartoes_response_id_cartao_vinculado_value}}}
   **/
  @ApiModelProperty(value = "{{{vincular_cartoes_response_id_cartao_vinculado_value}}}")
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
