package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response do Tipo Servi\u00E7o SMS
 **/
@ApiModel(description = "Objeto Response do Tipo Servi\u00E7o SMS")
public class TipoServicoSMSResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Identificador do Tipo Servi\u00E7o SMS
   **/
  @ApiModelProperty(value = "Identificador do Tipo Servi\u00E7o SMS")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do Tipo Servi\u00E7o SMS
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Tipo Servi\u00E7o SMS")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoServicoSMSResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
