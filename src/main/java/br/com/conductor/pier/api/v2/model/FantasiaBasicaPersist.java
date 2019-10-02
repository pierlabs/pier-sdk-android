package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class FantasiaBasicaPersist  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("descricaoArquivo")
  private String descricaoArquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("quantidadeMaxProposta")
  private Integer quantidadeMaxProposta = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoArquivo() {
    return descricaoArquivo;
  }
  public void setDescricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantidadeMaxProposta() {
    return quantidadeMaxProposta;
  }
  public void setQuantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FantasiaBasicaPersist {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  descricaoArquivo: ").append(descricaoArquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  quantidadeMaxProposta: ").append(quantidadeMaxProposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
