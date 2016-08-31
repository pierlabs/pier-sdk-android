package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.PageApiOfEstagioCartao;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Page de Est\u00C3\u00A1gios Cart\u00C3\u00B5es
 **/
@ApiModel(description = "Page de Est\u00C3\u00A1gios Cart\u00C3\u00B5es")
public class PageEstagiosCartoes  {
  
  @SerializedName("estagioCartoes")
  private PageApiOfEstagioCartao estagioCartoes = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public PageApiOfEstagioCartao getEstagioCartoes() {
    return estagioCartoes;
  }
  public void setEstagioCartoes(PageApiOfEstagioCartao estagioCartoes) {
    this.estagioCartoes = estagioCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageEstagiosCartoes {\n");
    
    sb.append("  estagioCartoes: ").append(estagioCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


