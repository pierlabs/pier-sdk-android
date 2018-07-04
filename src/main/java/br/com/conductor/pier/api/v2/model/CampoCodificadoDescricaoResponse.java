package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{campo_codificado_descricao_response_description}}}
 **/
@ApiModel(description = "{{{campo_codificado_descricao_response_description}}}")
public class CampoCodificadoDescricaoResponse  {
  
  @SerializedName("codigo")
  private Long codigo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{campo_codificado_descricao_response_codigo_value}}}
   **/
  @ApiModelProperty(value = "{{{campo_codificado_descricao_response_codigo_value}}}")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{campo_codificado_descricao_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{campo_codificado_descricao_response_descricao_value}}}")
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


