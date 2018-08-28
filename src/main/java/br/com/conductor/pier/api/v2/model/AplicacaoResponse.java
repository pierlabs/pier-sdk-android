package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{aplicacao_response_description}}}
 **/
@ApiModel(description = "{{{aplicacao_response_description}}}")
public class AplicacaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("tokenId")
  private Long tokenId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
