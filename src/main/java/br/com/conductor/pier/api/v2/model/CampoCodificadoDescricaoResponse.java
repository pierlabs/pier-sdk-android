package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Field Encoded
 **/
@ApiModel(description = "Object Field Encoded")
public class CampoCodificadoDescricaoResponse  {
  
  @SerializedName("codigo")
  private Long codigo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Identification Code of the description
   **/
  @ApiModelProperty(value = "Identification Code of the description")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Description of the encoded field
   **/
  @ApiModelProperty(value = "Description of the encoded field")
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
