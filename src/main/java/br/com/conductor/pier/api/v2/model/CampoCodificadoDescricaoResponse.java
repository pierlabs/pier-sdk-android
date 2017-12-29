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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da descri\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da descri\u00C3\u00A7\u00C3\u00A3o.")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do campo codificado.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do campo codificado.")
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
