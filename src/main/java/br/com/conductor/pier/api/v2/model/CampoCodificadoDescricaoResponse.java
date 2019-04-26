package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Campo Condificado
 **/
@ApiModel(description = "Objeto Campo Condificado")
public class CampoCodificadoDescricaoResponse  {
  
  @SerializedName("codigo")
  private Long codigo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da descri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da descri\u00E7\u00E3o")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00E7\u00E3o do campo codificado
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do campo codificado")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoCodificadoDescricaoResponse {\n");
    
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
