package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_partial_object_description}}}
 **/
@ApiModel(description = "{{{conta_partial_object_description}}}")
public class ContaPartialUpdate  {
  
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("idContaEmissor")
  private Long idContaEmissor = null;

  
  /**
   * {{{conta_partial_funcao_ativa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_partial_funcao_ativa_value}}}")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * {{{conta_partial_id_conta_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_partial_id_conta_emissor_value}}}")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  idContaEmissor: ").append(idContaEmissor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
