package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{banco_response_description}}}
 **/
@ApiModel(description = "{{{banco_response_description}}}")
public class BancoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("digitoBanco")
  private String digitoBanco = null;

  
  /**
   * {{{banco_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{banco_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{banco_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{banco_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{banco_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{banco_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{banco_response_digito_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{banco_response_digito_banco_value}}}")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  digitoBanco: ").append(digitoBanco).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
