package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta para o Grupo MCC
 **/
@ApiModel(description = "Objeto de Resposta para o Grupo MCC")
public class GrupoMCCResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("descricaoExtrato")
  private String descricaoExtrato = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * descricao
   **/
  @ApiModelProperty(value = "descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * descricaoExtrato
   **/
  @ApiModelProperty(value = "descricaoExtrato")
  public String getDescricaoExtrato() {
    return descricaoExtrato;
  }
  public void setDescricaoExtrato(String descricaoExtrato) {
    this.descricaoExtrato = descricaoExtrato;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoMCCResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  descricaoExtrato: ").append(descricaoExtrato).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
