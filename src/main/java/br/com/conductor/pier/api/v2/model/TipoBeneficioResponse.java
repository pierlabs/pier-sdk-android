package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do tipo de benef\u00EDcio
 **/
@ApiModel(description = "Objeto de resposta do tipo de benef\u00EDcio")
public class TipoBeneficioResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Identificador do tipo de benef\u00EDcio
   **/
  @ApiModelProperty(value = "Identificador do tipo de benef\u00EDcio")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de benef\u00EDcio
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de benef\u00EDcio")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoBeneficioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
