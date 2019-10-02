package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de operadora telef\u00F4nica
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de operadora telef\u00F4nica")
public class FantasiaBasicaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("descricaoArquivo")
  private String descricaoArquivo = null;
  @SerializedName("quantidadeMaxProposta")
  private Integer quantidadeMaxProposta = null;

  
  /**
   * Identificador da fantasia b\u00E1sica
   **/
  @ApiModelProperty(value = "Identificador da fantasia b\u00E1sica")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome da fantasia b\u00E1sica
   **/
  @ApiModelProperty(value = "Nome da fantasia b\u00E1sica")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00E7\u00E3o da fantasia b\u00E1sica
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da fantasia b\u00E1sica")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Descri\u00E7\u00E3o do arquivo da fantasia b\u00E1sica
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do arquivo da fantasia b\u00E1sica")
  public String getDescricaoArquivo() {
    return descricaoArquivo;
  }
  public void setDescricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
  }

  
  /**
   * Quantidade m\u00E1xima de propostas da fantasia b\u00E1sica
   **/
  @ApiModelProperty(value = "Quantidade m\u00E1xima de propostas da fantasia b\u00E1sica")
  public Integer getQuantidadeMaxProposta() {
    return quantidadeMaxProposta;
  }
  public void setQuantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FantasiaBasicaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  descricaoArquivo: ").append(descricaoArquivo).append("\n");
    sb.append("  quantidadeMaxProposta: ").append(quantidadeMaxProposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
