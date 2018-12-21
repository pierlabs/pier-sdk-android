package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{aplicacao_mobile_emissor_resposta_descricao}}}
 **/
@ApiModel(description = "{{{aplicacao_mobile_emissor_resposta_descricao}}}")
public class AplicacaoMobileEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * {{{aplicacao_mobile_emissor_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_emissor_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
