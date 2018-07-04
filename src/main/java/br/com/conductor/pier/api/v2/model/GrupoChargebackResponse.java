package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{grupo_chargeback_response_description}}}
 **/
@ApiModel(description = "{{{grupo_chargeback_response_description}}}")
public class GrupoChargebackResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{grupo_chargeback_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_chargeback_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{grupo_chargeback_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_chargeback_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoChargebackResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


