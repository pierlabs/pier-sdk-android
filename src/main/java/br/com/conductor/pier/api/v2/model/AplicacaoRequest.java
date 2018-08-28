package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{aplicacao_request_description}}}
 **/
@ApiModel(description = "{{{aplicacao_request_description}}}")
public class AplicacaoRequest  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("tokenId")
  private Long tokenId = null;
  @SerializedName("sort")
  private List<String> sort = null;

  
  /**
   * {{{aplicacao_dto_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_dto_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{aplicacao_dto_token_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_dto_token_value}}}")
  public Long getTokenId() {
    return tokenId;
  }
  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  
  /**
   * {{{global_menssagem_sort_sort}}}
   **/
  @ApiModelProperty(value = "{{{global_menssagem_sort_sort}}}")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoRequest {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
